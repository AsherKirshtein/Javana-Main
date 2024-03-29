// Generated from Javana.g4 by ANTLR 4.13.1

package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavanaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavanaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavanaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavanaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#programHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeader(JavanaParser.ProgramHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#mainMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethod(JavanaParser.MainMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#mainArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainArg(JavanaParser.MainArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#globalDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDefinitions(JavanaParser.GlobalDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#funcDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefinition(JavanaParser.FuncDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#funcPrototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncPrototype(JavanaParser.FuncPrototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#funcArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgList(JavanaParser.FuncArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#funcArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgument(JavanaParser.FuncArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(JavanaParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#recordDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDecl(JavanaParser.RecordDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(JavanaParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#typeAssoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAssoc(JavanaParser.TypeAssocContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#variableDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDef(JavanaParser.VariableDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#constantDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDef(JavanaParser.ConstantDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#nameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameList(JavanaParser.NameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavanaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavanaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#nameDeclStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameDeclStatement(JavanaParser.NameDeclStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#nameDeclDefStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameDeclDefStatement(JavanaParser.NameDeclDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(JavanaParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#identModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentModifier(JavanaParser.IdentModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#arrIdxSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrIdxSpecifier(JavanaParser.ArrIdxSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JavanaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JavanaParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JavanaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(JavanaParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavanaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(JavanaParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#printLineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintLineStatement(JavanaParser.PrintLineStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#printArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArgument(JavanaParser.PrintArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavanaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(JavanaParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#readCharCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadCharCall(JavanaParser.ReadCharCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#readLineCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadLineCall(JavanaParser.ReadLineCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JavanaParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#newArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArray(JavanaParser.NewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#newRecord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewRecord(JavanaParser.NewRecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#varInitList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInitList(JavanaParser.VarInitListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavanaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavanaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#scalarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarType(JavanaParser.ScalarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#compositeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeType(JavanaParser.CompositeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#integerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(JavanaParser.IntegerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#booleanType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(JavanaParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#stringType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(JavanaParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(JavanaParser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#integerArrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerArrType(JavanaParser.IntegerArrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#booleanArrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanArrType(JavanaParser.BooleanArrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#stringArrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArrType(JavanaParser.StringArrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#recordArrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordArrType(JavanaParser.RecordArrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavanaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JavanaParser.IdentifierContext ctx);
}