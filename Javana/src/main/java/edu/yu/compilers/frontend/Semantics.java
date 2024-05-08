package edu.yu.compilers.frontend;

import antlr4.JavanaBaseVisitor;
import antlr4.JavanaParser;
import antlr4.JavanaParser.ArrIdxSpecifierContext;
import antlr4.JavanaParser.AssignmentStatementContext;
import antlr4.JavanaParser.BlockStatementContext;
import antlr4.JavanaParser.BooleanArrTypeContext;
import antlr4.JavanaParser.BooleanLiteralContext;
import antlr4.JavanaParser.BooleanTypeContext;
import antlr4.JavanaParser.CompositeTypeContext;
import antlr4.JavanaParser.ConstantDefContext;
import antlr4.JavanaParser.ExprArithContext;
import antlr4.JavanaParser.ExprArrayElementContext;
import antlr4.JavanaParser.ExprConditionalContext;
import antlr4.JavanaParser.ExprEqualityContext;
import antlr4.JavanaParser.ExprListContext;
import antlr4.JavanaParser.ExprLiteralContext;
import antlr4.JavanaParser.ExprNewArrayContext;
import antlr4.JavanaParser.ExprRelationalContext;
import antlr4.JavanaParser.ExprVariableContext;
import antlr4.JavanaParser.ExpressionContext;
import antlr4.JavanaParser.ExpressionStatementContext;
import antlr4.JavanaParser.FieldInitContext;
import antlr4.JavanaParser.ForStatementContext;
import antlr4.JavanaParser.FormattedPrintContext;
import antlr4.JavanaParser.FuncArgListContext;
import antlr4.JavanaParser.FuncArgumentContext;
import antlr4.JavanaParser.FuncDefinitionContext;
import antlr4.JavanaParser.FuncPrototypeContext;
import antlr4.JavanaParser.FunctionCallContext;
import antlr4.JavanaParser.GlobalDefinitionsContext;
import antlr4.JavanaParser.IdentifierContext;
import antlr4.JavanaParser.IfStatementContext;
import antlr4.JavanaParser.IntegerArrTypeContext;
import antlr4.JavanaParser.IntegerLiteralContext;
import antlr4.JavanaParser.IntegerTypeContext;
import antlr4.JavanaParser.MainArgContext;
import antlr4.JavanaParser.MainMethodContext;
import antlr4.JavanaParser.NameDeclDefStatementContext;
import antlr4.JavanaParser.NameDeclStatementContext;
import antlr4.JavanaParser.NameListContext;
import antlr4.JavanaParser.NewArrayContext;
import antlr4.JavanaParser.NewRecordContext;
import antlr4.JavanaParser.NoneValueContext;
import antlr4.JavanaParser.PrintLineStatementContext;
import antlr4.JavanaParser.PrintSingleValueContext;
import antlr4.JavanaParser.PrintStatementContext;
import antlr4.JavanaParser.ProgramHeaderContext;
import antlr4.JavanaParser.ReadCharCallContext;
import antlr4.JavanaParser.ReadLineCallContext;
import antlr4.JavanaParser.RecordArrTypeContext;
import antlr4.JavanaParser.RecordDeclContext;
import antlr4.JavanaParser.RecordTypeContext;
import antlr4.JavanaParser.ReturnStatementContext;
import antlr4.JavanaParser.ReturnTypeContext;
import antlr4.JavanaParser.ScalarTypeContext;
import antlr4.JavanaParser.StatementContext;
import antlr4.JavanaParser.StringArrTypeContext;
import antlr4.JavanaParser.StringLiteralContext;
import antlr4.JavanaParser.StringTypeContext;
import antlr4.JavanaParser.TypeAssocContext;
import antlr4.JavanaParser.TypeContext;
import antlr4.JavanaParser.VarModifierContext;
import antlr4.JavanaParser.VariableContext;
import antlr4.JavanaParser.VariableDeclContext;
import antlr4.JavanaParser.VariableDefContext;
import antlr4.JavanaParser.WhileStatementContext;
import edu.yu.compilers.intermediate.symtable.Predefined;
import edu.yu.compilers.intermediate.symtable.SymTable;
import edu.yu.compilers.intermediate.symtable.SymTableEntry;
import edu.yu.compilers.intermediate.symtable.SymTableStack;
import edu.yu.compilers.intermediate.type.TypeChecker;
import edu.yu.compilers.intermediate.type.Typespec;
import edu.yu.compilers.intermediate.type.Typespec.Form;
import edu.yu.compilers.intermediate.symtable.SymTableEntry.Kind;
import edu.yu.compilers.intermediate.util.CrossReferencer;

import static edu.yu.compilers.intermediate.symtable.SymTableEntry.Kind.TYPE;
import static edu.yu.compilers.intermediate.type.Typespec.Form.ARRAY;
import static edu.yu.compilers.intermediate.type.Typespec.Form.SCALAR;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.Attributes.Name;

import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.appender.SyslogAppender;
import org.apache.logging.log4j.core.util.SystemClock;

/***
 * Check the semantics of the Javana program and populate the symbol table.
 */
public class Semantics extends JavanaBaseVisitor<Object> {

    private final SymTableStack symTableStack;
    private final SemanticErrorHandler error;
    private SymTableEntry programId;
    private final static Logger logger = LogManager.getLogger(Semantics.class);
    private TypeChecker typeChecker = new TypeChecker();

    public Semantics()
    {
        this.symTableStack = new SymTableStack();
        Predefined.initialize(symTableStack);
        this.error = new SemanticErrorHandler();
        logger.info("Semantics started");
    }

    public int getErrorCount()
    {
        return error.getCount();
    }

    public SymTableEntry getProgramId() {
        return programId;
    }

    public void printSymbolTableStack()
    {
        CrossReferencer crossReferencer = new CrossReferencer();
        crossReferencer.print(symTableStack);
    }

    // Program and routines --------------------

    @Override 
    public Object visitProgram(JavanaParser.ProgramContext ctx) 
    { 
        visit(ctx.programHeader());
        for (JavanaParser.GlobalDefinitionsContext globalDef : ctx.globalDefinitions())
        {
            visit(globalDef);
        }
        visit(ctx.mainMethod());
        return null;
    }

    @Override
    public Object visitProgramHeader(ProgramHeaderContext ctx) 
    {
        JavanaParser.IdentifierContext idCtx = ctx.identifier();
        String programName = idCtx.IDENT().getText();
        SymTableEntry programId = symTableStack.enterLocal(programName, Kind.PROGRAM);
        programId.setRoutineSymTable(symTableStack.push());
        symTableStack.setProgramId(programId);
        symTableStack.getLocalSymTable().setOwner(programId);
        idCtx.entry = programId;
        return null;
    }

    @Override
    public Object visitMainMethod(MainMethodContext ctx) 
    {
        if(ctx.mainArg() != null)
        {
            visit(ctx.mainArg());
        }
        visit(ctx.blockStatement());
        return null;
    }

    @Override
    public Object visitMainArg(MainArgContext ctx)
    {
        symTableStack.enterLocal(ctx.identifier().getText(), Kind.VARIABLE);//Need to figure out how to visit an identifier in a function(is this right idk?)
        visit(ctx.stringArrType());
        return null; 
    }

    

    @Override
    public Object visitGlobalDefinitions(GlobalDefinitionsContext ctx)
    {
        if(ctx.nameDeclStatement() != null)
        {
            visit(ctx.nameDeclStatement());
        }
        if(ctx.nameDeclDefStatement() != null)
        {
            visit(ctx.nameDeclDefStatement());
        }
        return null;
    }

   // Function Definitions and Declarations ---

   @Override
   public Object visitFuncDefinition(FuncDefinitionContext ctx)
   {
        visit(ctx.funcPrototype());
        visit(ctx.blockStatement());
        return null;
   }

   @Override
    public Object visitFuncPrototype(FuncPrototypeContext ctx)
    {
        SymTableEntry functionEntry = symTableStack.enterLocal(ctx.identifier().getText(), Kind.FUNCTION);
        functionEntry.appendLineNumber(ctx.getStart().getLine());
        
        if(ctx.funcArgList() != null)
        {
            visit(ctx.funcArgList());
        }
        visit(ctx.returnType());
        return null;
    }

    @Override
    public Object visitFuncArgList(FuncArgListContext ctx)
    {
        for(FuncArgumentContext argument: ctx.funcArgument())
        {
            System.out.println("Visiting argument " + argument.getText());
            visit(argument);
        }
        return null;
    }

    @Override
    public Object visitFuncArgument(FuncArgumentContext ctx)
    {
        String[] splited = ctx.getText().split(":");
        System.out.println("Entering " + splited[0] + " to symtablestack");
        symTableStack.enterLocal(splited[0], Kind.VARIABLE);
        return null;
    }


    

    @Override
    public Object visitReturnType(ReturnTypeContext ctx)
    {
        if(ctx.type() != null)
        {
            visit(ctx.type());
        }
        else
        {
            visit(ctx.None());
        }
        return null;
    }

    // Name Definitions and Declarations -------

    @Override
    public Object visitRecordDecl(RecordDeclContext ctx) {
        // TODO Auto-generated method stub
        return super.visitRecordDecl(ctx);
    }
    @Override
    public Object visitVariableDecl(VariableDeclContext ctx)
    {
        JavanaParser.TypeAssocContext typeAssocCtx = ctx.typeAssoc();
        visit(typeAssocCtx);
        return null;
    }

    @Override
    public Object visitTypeAssoc(TypeAssocContext ctx)
    {
        visit(ctx.nameList());
        for(IdentifierContext id : ctx.nameList().identifier())
        {
            System.out.println("Visiting " + id.getText() + " with IDENT " + id.IDENT());
            if(symTableStack.lookupLocal(id.IDENT().getText()) != null)
            {
                error.flag(SemanticErrorHandler.Code.REDECLARED_IDENTIFIER, id);
            }
            else
            {
                SymTableEntry variableEntry = symTableStack.enterLocal(id.IDENT().getText(), Kind.VARIABLE);
                Typespec type = getType(ctx.type());
                if(type != null)
                {
                    variableEntry.setType(type);
                }
                variableEntry.appendLineNumber(ctx.start.getLine());
            }
        }
        return null;
    }

    private Typespec getType(TypeContext type)
    {
        String t = type.getText();
        switch (t)
        {
            case "int":
            return Predefined.integerType;
            case "bool":
            return Predefined.booleanType;
            case "string":
            return Predefined.stringType;
            case "string[]":
            return Predefined.stringArrType;
            case "int[]":
            return Predefined.integerArrType;
            default:
                break;
        }
        return new Typespec(SCALAR);
    }

    @Override
    public Object visitVariableDef(JavanaParser.VariableDefContext ctx)
    {
        Typespec ret = null;
        JavanaParser.NameListContext nameListCtx = ctx.nameList();
        Typespec type = getType(ctx.expression().getText());
        for(IdentifierContext id : ctx.nameList().identifier())
        {
            if(symTableStack.lookupLocal(id.getText()) != null)
            {
                error.flag(SemanticErrorHandler.Code.REDECLARED_IDENTIFIER, nameListCtx);
            }
            System.out.println("Setting " + id.getText());
            SymTableEntry variableEntry = symTableStack.enterLocal(id.getText(), Kind.VARIABLE);
            variableEntry.appendLineNumber(ctx.start.getLine());
            variableEntry.setType(type);
            ret = type;
        }
        return ret;
    }

    private Typespec getType(String type)
    {
        if (type.equalsIgnoreCase("true") || type.equalsIgnoreCase("false")) {
            return Predefined.booleanType;
        }
    
        // Check for an integer value
        try
        {
            Integer.parseInt(type);
            return Predefined.integerType;
        } 
        catch (NumberFormatException e)
        {
            // Not an Integer
        }
        if(null != symTableStack.lookup(type))
        {
            return symTableStack.lookup(type).getType();
        }
        if(type.startsWith("@"))
        {
            String dig = type.substring(1,4);
            switch (dig) {
                case "int":
                    return Predefined.integerArrType;
                case "str":
                    return Predefined.stringArrType;
                case "boo":
                    return Predefined.booleanArrType;
                default:
                    break;
            }
        }
        // If all else fails, consider it a String
        return Predefined.stringType;
    }

    @Override
    public Object visitConstantDef(ConstantDefContext ctx)
    {
        JavanaParser.NameListContext nameListCtx = ctx.nameList();
        if (symTableStack.lookupLocal(nameListCtx.getText()) != null)
        {
            error.flag(SemanticErrorHandler.Code.REDECLARED_IDENTIFIER, nameListCtx);
        }
        JavanaParser.ExpressionContext exprCtx = ctx.expression();
        Object value = visit(exprCtx);  
        SymTableEntry constantEntry = symTableStack.enterLocal(nameListCtx.getText(), Kind.CONSTANT);
        constantEntry.appendLineNumber(ctx.start.getLine());
        constantEntry.setValue(value);
        constantEntry.setType(new Typespec(Form.SCALAR));
        return null;
    }

    @Override
    public Object visitNameList(NameListContext ctx)
    {
        Set<String> seenNames = new HashSet<String>();
        for(JavanaParser.IdentifierContext idCtx : ctx.names)
        {
            String identifier = idCtx.getText();
            if (seenNames.contains(identifier))
            {
                error.flag(SemanticErrorHandler.Code.REDECLARED_IDENTIFIER, ctx);
            } 
            else
            {
                seenNames.add(identifier);
            }
        }
        return null;
    }

    // Statements ------------------------------


    @Override
    public Object visitStatement(StatementContext ctx)
    {
        if (ctx.blockStatement() != null)
        {
            return visit(ctx.blockStatement());
        } 
        else if (ctx.nameDeclStatement() != null)
        {
            return visit(ctx.nameDeclStatement());
        } 
        else if (ctx.nameDeclDefStatement() != null) 
        {
            return visit(ctx.nameDeclDefStatement());
        }
        else if (ctx.assignmentStatement() != null)
        {
            return visit(ctx.assignmentStatement());
        } 
        else if (ctx.ifStatement() != null)
        {
            return visit(ctx.ifStatement());
        } 
        else if (ctx.forStatement() != null)
        {
            return visit(ctx.forStatement());
        } 
        else if (ctx.whileStatement() != null) 
        {
            return visit(ctx.whileStatement());
        } 
        else if (ctx.expressionStatement() != null) 
        {
            return visit(ctx.expressionStatement());
        } 
        else if (ctx.returnStatement() != null) 
        {
            return visit(ctx.returnStatement());
        } 
        else if (ctx.printStatement() != null) 
        {
            return visit(ctx.printStatement());
        } 
        else if (ctx.printLineStatement() != null) 
        {
            return visit(ctx.printLineStatement());
        } 
        else 
        {
            // Handle any other statement types or error cases
        }
        return null;
    }

    @Override
    public Object visitBlockStatement(BlockStatementContext ctx) 
    {
        for (JavanaParser.StatementContext stmtCtx : ctx.statement()) 
        {
            visit(stmtCtx); 
        }
        return null;
    }

    @Override
    public Object visitNameDeclStatement(NameDeclStatementContext ctx)
    {
        if (ctx.variableDecl() != null)
        {
            visitVariableDecl(ctx.variableDecl());
        } 
        else if (ctx.recordDecl() != null)
        {
            visitRecordDecl(ctx.recordDecl());
        }
        return null; 
    }


    @Override
    public Object visitNameDeclDefStatement(NameDeclDefStatementContext ctx)
    {
        if (ctx.variableDef() != null)
        {
            visit(ctx.variableDef());
        } 
        else if (ctx.constantDef() != null) 
        {
            visit(ctx.constantDef());
        } 
        else if (ctx.funcDefinition() != null) 
        {
            visit(ctx.funcDefinition());
        }
        return null;
    }

    @SuppressWarnings("static-access")
    @Override
    public Object visitAssignmentStatement(AssignmentStatementContext ctx)
    {
        //System.out.println("Visiting Assignment statement " + ctx.getText());
        Typespec lhsType = null;
        Typespec rhsType = null;
        if(ctx.variable() != null)
        {
            lhsType = (Typespec) visit(ctx.variable());
        }
        if(ctx.expression() != null)
        {
            rhsType = (Typespec) visit(ctx.expression());
        }
        if(!typeChecker.areAssignmentCompatible(lhsType, rhsType) && lhsType != rhsType)
        {
            error.flag(SemanticErrorHandler.Code.INCOMPATIBLE_ASSIGNMENT, ctx);
        }
        return null;
    }

    @Override
    public Object visitVariable(VariableContext ctx)
    {
        if(symTableStack.lookup(ctx.identifier().getText()) ==  null) 
        {
            error.flag(SemanticErrorHandler.Code.UNDECLARED_IDENTIFIER, ctx);
        }
        for(VarModifierContext modCtx : ctx.modifiers)
        {
            visit(modCtx);
        }
        return symTableStack.lookup(ctx.identifier().getText()).getType();
    }

    @Override
    public Object visitArrIdxSpecifier(ArrIdxSpecifierContext ctx) {
        // TODO Auto-generated method stub
        //System.out.println("ArrIdxSpecifier " + ctx.getText());
        return super.visitArrIdxSpecifier(ctx);
    }

    @SuppressWarnings("static-access")
    @Override
    public Object visitIfStatement(IfStatementContext ctx)
    {
        symTableStack.push();
        ExpressionContext exprContext = ctx.expression();
        Typespec t = (Typespec) visit(exprContext);
        if(!typeChecker.isBoolean(t) && t != null)
        {
            error.flag(SemanticErrorHandler.Code.TYPE_MUST_BE_BOOLEAN, exprContext);
        }
        for(BlockStatementContext block: ctx.blockStatement())
        {
            symTableStack.push();
            visit(block);
            symTableStack.pop();
            
        }
        symTableStack.pop();
        return null;
    }

    @SuppressWarnings("static-access")
    @Override
    public Object visitForStatement(ForStatementContext ctx)
    {
        symTableStack.push();
        VariableDefContext varCtx = ctx.variableDef();
        visit(varCtx);
        for(ExpressionContext expression: ctx.expression())
        {
            visit(expression);
        }
        visit(ctx.blockStatement());
        symTableStack.pop();
        return null;
    }

    @Override
    public Object visitWhileStatement(WhileStatementContext ctx)
    {
        symTableStack.push();
        ExpressionContext exprCtx = ctx.expression();
        visit(ctx.blockStatement());
        symTableStack.pop();
        return null;
    }

    @Override
    public Object visitExpressionStatement(ExpressionStatementContext ctx)
    {
        System.out.println("Visiting Expression Statement " + ctx.getText());
        return super.visitExpressionStatement(ctx);
    }

    @SuppressWarnings("static-access")
    @Override
    public Object visitExprEquality(ExprEqualityContext ctx)
    {
        Typespec lhs = (Typespec) visit(ctx.lhs);
        Typespec rhs = (Typespec) visit(ctx.rhs);
        if(!typeChecker.areAssignmentCompatible(lhs, rhs) && ctx.lhs.getChildCount() == 1 && ctx.rhs.getChildCount() == 1)
        {
            error.flag(SemanticErrorHandler.Code.INCOMPATIBLE_COMPARISON, ctx);
        }
        return Predefined.booleanType;
    }

    @SuppressWarnings("static-access")
    @Override
    public Object visitExprRelational(ExprRelationalContext ctx)
    {
        Typespec lhs = (Typespec) visit(ctx.lhs);
        Typespec rhs = (Typespec) visit(ctx.rhs);
        if(!typeChecker.areAssignmentCompatible(lhs, rhs) && ctx.lhs.getChildCount() == 1 && ctx.rhs.getChildCount() == 1)
        {
            error.flag(SemanticErrorHandler.Code.INCOMPATIBLE_COMPARISON, ctx);
        }
        return Predefined.booleanType;
    }

    @Override
    public Object visitExprVariable(ExprVariableContext ctx)
    {
        //System.out.println("Visiting Expr Variable " + ctx.variable().getText());
        return visit(ctx.variable());
    }

    @Override
    public Object visitExprLiteral(ExprLiteralContext ctx)
    {
        return getType(ctx.getText());
    }

    @SuppressWarnings("static-access")
    @Override
    public Object visitExprArith(ExprArithContext ctx)
    {
        Typespec lhs = (Typespec) visit(ctx.lhs);
        Typespec rhs = (Typespec) visit(ctx.rhs);
        if(!typeChecker.isInteger(lhs))
        {
            error.flag(SemanticErrorHandler.Code.TYPE_MUST_BE_INTEGER, ctx.lhs);
        }
        else if(!typeChecker.isInteger(rhs))
        {
            error.flag(SemanticErrorHandler.Code.TYPE_MUST_BE_INTEGER, ctx.rhs);
        }
        return null;
    }

    @Override
    public Object visitExprConditional(ExprConditionalContext ctx)
    {
        return null;
    }

    @Override
    public Object visitReturnStatement(ReturnStatementContext ctx)
    {
        // TODO Auto-generated method stub
        return super.visitReturnStatement(ctx);
    }

    @Override
    public Object visitPrintStatement(PrintStatementContext ctx)
    {
        if (ctx.printArgument() != null)
        {
            visit(ctx.printArgument());
        }
        else
        {
            error.flag(SemanticErrorHandler.Code.UNDECLARED_IDENTIFIER, ctx);
        }
        return null; 
    }

    @Override
    public Object visitPrintLineStatement(PrintLineStatementContext ctx) {
        visit(ctx.printArgument());
        return null;
    }

    @Override
    public Object visitPrintSingleValue(PrintSingleValueContext ctx)
    {
        Object o = visit(ctx.expression());
        return null;  
    }

    @Override
    public Object visitFormattedPrint(FormattedPrintContext ctx)
    {
        visit(ctx.exprList());
        return null;
    }

    // Expressions -----------------------------

    @Override
    public Object visitExprList(ExprListContext ctx) {
        // TODO Auto-generated method stub
        System.out.println("Visiting expression list " + ctx.getText());
        return super.visitExprList(ctx);
    }

    @Override
    public Object visitReadCharCall(ReadCharCallContext ctx) {
        // TODO Auto-generated method stub
        return super.visitReadCharCall(ctx);
    }

    @Override
    public Object visitReadLineCall(ReadLineCallContext ctx) {
        // TODO Auto-generated method stub
        return super.visitReadLineCall(ctx);
    }

    @Override
    public Object visitFunctionCall(FunctionCallContext ctx)
    {
        String functionName = ctx.identifier().getText();
        if(symTableStack.lookup(functionName) == null)
        {
            error.flag(SemanticErrorHandler.Code.UNDECLARED_IDENTIFIER, ctx);
        }
        return null;
    }

    @Override
    public Object visitNewArray(NewArrayContext ctx) {
        System.out.println("visiting new array " + ctx.getText());
        return super.visitNewArray(ctx);
    }

    @Override
    public Object visitNewRecord(NewRecordContext ctx) {
        // TODO Auto-generated method stub
        return super.visitNewRecord(ctx);
    }

    @Override
    public Object visitFieldInit(FieldInitContext ctx) {
        // TODO Auto-generated method stub
        return super.visitFieldInit(ctx);
    }

    @Override
    public Object visitIntegerLiteral(IntegerLiteralContext ctx) {
        // TODO Auto-generated method stub
        return super.visitIntegerLiteral(ctx);
    }

    @Override
    public Object visitBooleanLiteral(BooleanLiteralContext ctx) {
        System.out.println("Visiting boolean literal " + ctx.getText());
        return super.visitBooleanLiteral(ctx);
    }

    @Override
    public Object visitStringLiteral(StringLiteralContext ctx) {
        // TODO Auto-generated method stub
        return super.visitStringLiteral(ctx);
    }

    // Types -----------------------------------

    @Override
    public Object visitScalarType(ScalarTypeContext ctx)
    {
        System.out.println("Visiting Scalar Type " + ctx.getText());
        if(ctx.booleanType() != null)
        {
            return visit(ctx.booleanType());
        }
        if(ctx.integerType() != null)
        {
            return visit(ctx.integerType());
        }
        if(ctx.stringType() != null)
        {
            return visit(ctx.stringType());
        }
        return null;
    }

    @Override
    public Object visitCompositeType(CompositeTypeContext ctx)
    {
        System.out.println("Visiting Composite type " + ctx.getText());
        return super.visitCompositeType(ctx);
    }

    @Override
    public Object visitIntegerType(IntegerTypeContext ctx) {
        return ctx.INT_TYPE();
    }

    @Override
    public Object visitBooleanType(BooleanTypeContext ctx)
    {
        return ctx.BOOL_TYPE();
    }
    
    @Override
    public Object visitStringType(StringTypeContext ctx) {
        return ctx.STR_TYPE();
    }

    @Override
    public Object visitRecordType(RecordTypeContext ctx) {
        // TODO Auto-generated method stub
        return super.visitRecordType(ctx);
    }

    @Override
    public Object visitIntegerArrType(IntegerArrTypeContext ctx) {
        System.out.println("Visiting Integer[] type " + ctx.getText());
        return super.visitIntegerArrType(ctx);
    }

    @Override
    public Object visitBooleanArrType(BooleanArrTypeContext ctx) {
        // TODO Auto-generated method stub
        return super.visitBooleanArrType(ctx);
    }

    @Override
    public Object visitStringArrType(StringArrTypeContext ctx) {
        System.out.println("Visiting String[] type " + ctx.getText());
        return super.visitStringArrType(ctx);
    }

    @Override
    public Object visitRecordArrType(RecordArrTypeContext ctx) {
        // TODO Auto-generated method stub
        return super.visitRecordArrType(ctx);
    }

    // Misc Rules ------------------------------------------------


    @Override
    public Object visitIdentifier(IdentifierContext ctx)
    {
        if(symTableStack.lookup(ctx.getText()) == null) 
        {
            error.flag(SemanticErrorHandler.Code.UNDECLARED_IDENTIFIER, ctx);
        }
        return null;
    }
    
    @Override
    public Object visitNoneValue(NoneValueContext ctx) {
        // TODO Auto-generated method stub
        return super.visitNoneValue(ctx);
    }

    // Lexer tokens ----------------------------------------------------------

}
