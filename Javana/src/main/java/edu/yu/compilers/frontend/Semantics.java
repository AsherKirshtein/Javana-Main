package edu.yu.compilers.frontend;

import antlr4.JavanaBaseVisitor;
import antlr4.JavanaParser;
import antlr4.JavanaParser.AssignmentStatementContext;
import antlr4.JavanaParser.BlockStatementContext;
import antlr4.JavanaParser.CompositeTypeContext;
import antlr4.JavanaParser.ConstantDefContext;
import antlr4.JavanaParser.ExpressionContext;
import antlr4.JavanaParser.ExpressionStatementContext;
import antlr4.JavanaParser.IdentifierContext;
import antlr4.JavanaParser.LiteralContext;
import antlr4.JavanaParser.MainArgContext;
import antlr4.JavanaParser.MainMethodContext;
import antlr4.JavanaParser.NameDeclDefStatementContext;
import antlr4.JavanaParser.NameDeclStatementContext;
import antlr4.JavanaParser.NameListContext;
import antlr4.JavanaParser.ProgramHeaderContext;
import antlr4.JavanaParser.ScalarTypeContext;
import antlr4.JavanaParser.StatementContext;
import antlr4.JavanaParser.TypeAssocContext;
import antlr4.JavanaParser.TypeContext;
import antlr4.JavanaParser.VarInitListContext;
import antlr4.JavanaParser.VariableDeclContext;
import antlr4.JavanaParser.VariableDefContext;
import edu.yu.compilers.intermediate.symtable.Predefined;
import edu.yu.compilers.intermediate.symtable.SymTable;
import edu.yu.compilers.intermediate.symtable.SymTableEntry;
import edu.yu.compilers.intermediate.symtable.SymTableStack;
import edu.yu.compilers.intermediate.type.Typespec;
import edu.yu.compilers.intermediate.symtable.SymTableEntry.Kind;
import edu.yu.compilers.intermediate.util.CrossReferencer;
import edu.yu.compilers.intermediate.symtable.SymTableEntry;
import java.util.HashSet;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.appender.SyslogAppender;
/***
 * Check the semantics of the Javana program and populate the symbol table.
 */
public class Semantics extends JavanaBaseVisitor<Object> {

    private final SymTableStack symTableStack;
    private final SemanticErrorHandler error;
    private SymTableEntry programId;
    private final static Logger logger = LogManager.getLogger(Semantics.class);

    public Semantics()
    {
        this.symTableStack = new SymTableStack();
        Predefined.initialize(symTableStack);
        this.error = new SemanticErrorHandler();
        //System.out.println("Semantics created");
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

    @Override 
    public Object visitProgram(JavanaParser.ProgramContext ctx) 
    { 
        //System.out.println("Visiting Program: " + ctx.getText());
        visit(ctx.programHeader());
        visit(ctx.mainMethod());
        for (JavanaParser.GlobalDefinitionsContext globalDef : ctx.globalDefinitions())
        {
            visit(globalDef);
        }
        return null;
    }

    @Override
    public Object visitProgramHeader(ProgramHeaderContext ctx) 
    {
        //System.out.println("Visiting Program header " + ctx.getText());
        JavanaParser.IdentifierContext idCtx = ctx.identifier();
        String programName = idCtx.IDENT().getText();  // Extract the program name
        SymTableEntry programId = symTableStack.enterLocal(programName, Kind.PROGRAM);
        programId.setRoutineSymTable(symTableStack.push());
        symTableStack.setProgramId(programId);
        symTableStack.getLocalSymTable().setOwner(programId);
        idCtx.entry = programId;
        return null;
    }

    @Override
    public Object visitMainArg(MainArgContext ctx)
    {
        //System.out.println("Visiting Main Args " + ctx.getText());
        visit(ctx.identifier());
        visit(ctx.stringArrType());
        return null; 
    }

    @Override
    public Object visitMainMethod(MainMethodContext ctx) 
    {
        //System.out.println("Visiting main Method "+ ctx.getText());
        visit(ctx.blockStatement());
        if (ctx.mainArg() != null)
        {
            visit(ctx.mainArg());
        }
        return null;
    }

    @Override
    public Object visitBlockStatement(BlockStatementContext ctx) 
    {
        //System.out.println("Visiting block statement " + ctx.getText());
        for (JavanaParser.StatementContext stmtCtx : ctx.statement()) 
        {
            visit(stmtCtx); // Visit each statement
        }
        return null;
    }

    @Override
    public Object visitStatement(StatementContext ctx)
    {
        //System.out.println("Visiting Statement: " + ctx.getText());
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
    public Object visitNameDeclDefStatement(NameDeclDefStatementContext ctx) {
        System.out.println("Visiting NameDeclDef " + ctx.getText());
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


    @Override
    public Object visitConstantDef(ConstantDefContext ctx) {
        System.out.println("Visiting Constant definition " + ctx.getText());
        return super.visitConstantDef(ctx);
    }

    @Override
    public Object visitVariableDef(JavanaParser.VariableDefContext ctx) {
        System.out.println("Visiting variable definition " + ctx.getText());
        JavanaParser.NameListContext nameListCtx = ctx.nameList();
        JavanaParser.ExpressionContext exprCtx = ctx.expression();
        visit(nameListCtx);
        Object expressionValue = visit(exprCtx);
        Typespec expressionType = exprCtx.type;
        for (JavanaParser.IdentifierContext idCtx : nameListCtx.identifier())
        {
            String variableName = idCtx.getText();
            SymTableEntry variableEntry = symTableStack.lookupLocal(variableName);
            int lineNumber = idCtx.getStart().getLine();
            if (variableEntry == null)
            {
                variableEntry = symTableStack.enterLocal(variableName, SymTableEntry.Kind.VARIABLE);
                System.out.println("Setting type: " + expressionType);
                System.out.println("Setting value: " + expressionValue); 
                System.out.println("Setting LineNumber: " + lineNumber);
                variableEntry.setType(expressionType);
                variableEntry.setValue(expressionValue);
                variableEntry.appendLineNumber(lineNumber);
                idCtx.entry = variableEntry;
            } 
            else 
            {
                if (!variableEntry.getType().equals(expressionType)) 
                {
                    error.flag(SemanticErrorHandler.Code.TYPE_MISMATCH, ctx);
                } 
                else 
                {
                    //variableEntry.setValue(expressionValue);
                }
            }
        }
    
        return null;
    }
    

    @Override
    public Object visitType(TypeContext ctx)
    {
        System.out.println("Visiting type " + ctx.getText());
        if (ctx.scalarType() != null)
        {
            return visitScalarType(ctx.scalarType());
        } 
        else if (ctx.compositeType() != null)
        {
            return visitCompositeType(ctx.compositeType());
        }
        return null; // or throw an exception if you expect all cases to be handled
    
    }

    @Override
    public Object visitExpression(JavanaParser.ExpressionContext ctx)
    {
        System.out.println("Visiting expression " + ctx.getText());
        if (ctx.readCharCall() != null)
        {
            return visitReadCharCall(ctx.readCharCall());
        } 
        else if (ctx.readLineCall() != null) 
        {
            return visitReadLineCall(ctx.readLineCall());
        } 
        else if (ctx.functionCall() != null)
        {
            return visitFunctionCall(ctx.functionCall());
        } 
        else if (ctx.identifier() != null) 
        {
            SymTableEntry entry = ctx.identifier().entry;
            if (entry != null) 
            {
                return entry.getValue();
            }
        } 
        else if (ctx.literal() != null) 
        {
            return visitLiteral(ctx.literal());
        } 
        else if (ctx.newArray() != null) 
        {
            return visitNewArray(ctx.newArray());
        } 
        else if (ctx.newRecord() != null) 
        {
            return visitNewRecord(ctx.newRecord());
        } 
        else if (ctx.arrIdxSpecifier() != null) 
        {
            // Handle array index specifier
        } 
        else if (ctx.expression().size() > 0) 
        {
            // Handle binary and unary operators
            if (ctx.HIGHER_ARITH_OP() != null) 
            {
                // Handle higher arithmetic operator
            } 
            else if (ctx.ARITH_OP() != null) 
            {
                // Handle arithmetic operator
            } 
            else if (ctx.REL_OP() != null) 
            {
                // Handle relational operator
            } 
            else if (ctx.EQ_OP() != null) 
            {
                // Handle equality operator
            } 
            else if (ctx.COND_OP() != null) 
            {
                // Handle conditional operator
            }
        }
        return null;
    }

    @Override
    public Object visitLiteral(JavanaParser.LiteralContext ctx)
    {
        System.out.println("Visiting Literal " + ctx.getText());
        if (ctx.INTEGER() != null) 
        {
            return Integer.parseInt(ctx.INTEGER().getText());
        } 
        else if (ctx.BOOL() != null) 
        {
            return Boolean.parseBoolean(ctx.BOOL().getText());
        } 
        else if (ctx.STRING() != null) 
        {
            String stringWithQuotes = ctx.STRING().getText();
            return stringWithQuotes.substring(1, stringWithQuotes.length() - 1);
        } 
        else if (ctx.NULL_VALUE() != null) 
        {
            return null;
        }
        throw new RuntimeException("Unknown literal type.");
    }



    @Override
    public Object visitExpressionStatement(ExpressionStatementContext ctx)
    {
        System.out.println("Visiting expression statement " + ctx.getText());
        return super.visitExpressionStatement(ctx);
    }

    
    

    @Override
    public Object visitVariableDecl(VariableDeclContext ctx)
    {
        System.out.println("Visiting variable Declaration " + ctx.getText());
        JavanaParser.TypeAssocContext typeAssocCtx = ctx.typeAssoc();
        JavanaParser.TypeContext typeCtx = typeAssocCtx.type();
        JavanaParser.NameListContext nameListCtx = typeAssocCtx.nameList();
        Typespec typeSpec = (Typespec) visit(typeCtx);
        for (JavanaParser.IdentifierContext idCtx : nameListCtx.identifier())
        {
            String variableName = idCtx.getText();
            int lineNumber = idCtx.getStart().getLine();
            if (symTableStack.lookupLocal(variableName) != null)
            {
                error.flag(SemanticErrorHandler.Code.REDECLARED_IDENTIFIER, ctx);
            } 
            else
            {
                SymTableEntry variableEntry = symTableStack.enterLocal(variableName, Kind.VARIABLE);
                System.out.println("Setting Type: " + typeCtx.getText());
                variableEntry.setType(typeSpec);
                variableEntry.appendLineNumber(lineNumber);
                idCtx.entry = variableEntry;
            }
        }
        return null;
    }

    @Override
    public Object visitVarInitList(VarInitListContext ctx) {
        System.out.println("Visiting Initalize List " + ctx.getText());
        return super.visitVarInitList(ctx);
    }

    @Override
    public Object visitAssignmentStatement(AssignmentStatementContext ctx)
    {
        System.out.println("Visiting assignment statement " + ctx.getText());
        return super.visitAssignmentStatement(ctx);
    }

    @Override
    public Object visitNameDeclStatement(NameDeclStatementContext ctx)
    {
        System.out.println("Visiting name declaration " + ctx.getText());
        
        if (ctx.variableDecl() != null)
        {
            return visitVariableDecl(ctx.variableDecl());
        } 
        else if (ctx.recordDecl() != null)
        {
            return visitRecordDecl(ctx.recordDecl());
        }
        return null; // or throw an exception if you expect all cases to be handled
    }

    @Override
    public Object visitScalarType(ScalarTypeContext ctx)
    {
        System.out.println("Visiting Scalar type " + ctx.getText());
        return super.visitScalarType(ctx);
    }

    @Override
    public Object visitCompositeType(CompositeTypeContext ctx)
    {
        System.out.println("Visiting Composite type " + ctx.getText());
        return super.visitCompositeType(ctx);
    }

    @Override
    public Object visitTypeAssoc(TypeAssocContext ctx) {
        System.out.println("Visiting Type Assoc " + ctx.getText());
        return super.visitTypeAssoc(ctx);
    }

    @Override
    public Object visitIdentifier(IdentifierContext ctx) {
        System.out.println("Visiting Identifier " + ctx.getText());
        return super.visitIdentifier(ctx);
    }

    @Override
    public Object visitNameList(NameListContext ctx) {
        System.out.println("Visiting name list "+ ctx.getText() );
        return super.visitNameList(ctx);
    }
}
