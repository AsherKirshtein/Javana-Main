// Generated from Javana.g4 by ANTLR 4.13.1

package antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import edu.yu.compilers.intermediate.symtable.SymTableEntry;
import edu.yu.compilers.intermediate.type.Typespec;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, INT_ARR_TYPE=33, BOOL_ARR_TYPE=34, STR_ARR_TYPE=35, REC_ARR_TYPE=36, 
		INT_TYPE=37, BOOL_TYPE=38, STR_TYPE=39, HIGHER_ARITH_OP=40, ARITH_OP=41, 
		REL_OP=42, EQ_OP=43, COND_OP=44, IDENT=45, STRING=46, INTEGER=47, BOOL=48, 
		NULL_VALUE=49, NEWLINE=50, WS=51, COMMENT=52, LINE_COMMENT=53;
	public static final int
		RULE_program = 0, RULE_programHeader = 1, RULE_mainMethod = 2, RULE_mainArg = 3, 
		RULE_globalDefinitions = 4, RULE_funcDefinition = 5, RULE_funcPrototype = 6, 
		RULE_funcArgList = 7, RULE_funcArgument = 8, RULE_returnType = 9, RULE_recordDecl = 10, 
		RULE_variableDecl = 11, RULE_typeAssoc = 12, RULE_variableDef = 13, RULE_constantDef = 14, 
		RULE_nameList = 15, RULE_statement = 16, RULE_blockStatement = 17, RULE_nameDeclStatement = 18, 
		RULE_nameDeclDefStatement = 19, RULE_assignmentStatement = 20, RULE_identModifier = 21, 
		RULE_arrIdxSpecifier = 22, RULE_ifStatement = 23, RULE_forStatement = 24, 
		RULE_whileStatement = 25, RULE_expressionStatement = 26, RULE_returnStatement = 27, 
		RULE_printStatement = 28, RULE_printLineStatement = 29, RULE_printArgument = 30, 
		RULE_expression = 31, RULE_exprList = 32, RULE_readCharCall = 33, RULE_readLineCall = 34, 
		RULE_functionCall = 35, RULE_newArray = 36, RULE_newRecord = 37, RULE_varInitList = 38, 
		RULE_literal = 39, RULE_type = 40, RULE_scalarType = 41, RULE_compositeType = 42, 
		RULE_integerType = 43, RULE_booleanType = 44, RULE_stringType = 45, RULE_recordType = 46, 
		RULE_integerArrType = 47, RULE_booleanArrType = 48, RULE_stringArrType = 49, 
		RULE_recordArrType = 50, RULE_identifier = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programHeader", "mainMethod", "mainArg", "globalDefinitions", 
			"funcDefinition", "funcPrototype", "funcArgList", "funcArgument", "returnType", 
			"recordDecl", "variableDecl", "typeAssoc", "variableDef", "constantDef", 
			"nameList", "statement", "blockStatement", "nameDeclStatement", "nameDeclDefStatement", 
			"assignmentStatement", "identModifier", "arrIdxSpecifier", "ifStatement", 
			"forStatement", "whileStatement", "expressionStatement", "returnStatement", 
			"printStatement", "printLineStatement", "printArgument", "expression", 
			"exprList", "readCharCall", "readLineCall", "functionCall", "newArray", 
			"newRecord", "varInitList", "literal", "type", "scalarType", "compositeType", 
			"integerType", "booleanType", "stringType", "recordType", "integerArrType", 
			"booleanArrType", "stringArrType", "recordArrType", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Javana'", "':'", "'@main'", "'('", "')'", "'func'", "'->'", "','", 
			"'record'", "'{'", "'}'", "'decl'", "'var'", "'='", "'const'", "'.'", 
			"'['", "']'", "'if'", "'else'", "'for'", "';'", "'while'", "'return'", 
			"'print'", "'println'", "'length'", "'!'", "'-'", "'readch'", "'readln'", 
			"'@'", null, null, null, null, "'int'", "'bool'", "'string'", null, null, 
			null, null, null, null, null, null, null, "'None'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "INT_ARR_TYPE", 
			"BOOL_ARR_TYPE", "STR_ARR_TYPE", "REC_ARR_TYPE", "INT_TYPE", "BOOL_TYPE", 
			"STR_TYPE", "HIGHER_ARITH_OP", "ARITH_OP", "REL_OP", "EQ_OP", "COND_OP", 
			"IDENT", "STRING", "INTEGER", "BOOL", "NULL_VALUE", "NEWLINE", "WS", 
			"COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Javana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavanaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeaderContext programHeader() {
			return getRuleContext(ProgramHeaderContext.class,0);
		}
		public MainMethodContext mainMethod() {
			return getRuleContext(MainMethodContext.class,0);
		}
		public List<GlobalDefinitionsContext> globalDefinitions() {
			return getRuleContexts(GlobalDefinitionsContext.class);
		}
		public GlobalDefinitionsContext globalDefinitions(int i) {
			return getRuleContext(GlobalDefinitionsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			programHeader();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 45632L) != 0)) {
				{
				{
				setState(105);
				globalDefinitions();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			mainMethod();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 45632L) != 0)) {
				{
				{
				setState(112);
				globalDefinitions();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramHeaderContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProgramHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitProgramHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramHeaderContext programHeader() throws RecognitionException {
		ProgramHeaderContext _localctx = new ProgramHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__0);
			setState(119);
			identifier();
			setState(120);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainMethodContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public MainArgContext mainArg() {
			return getRuleContext(MainArgContext.class,0);
		}
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitMainMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__2);
			setState(123);
			match(T__3);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(124);
				mainArg();
				}
			}

			setState(127);
			match(T__4);
			setState(128);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainArgContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringArrTypeContext stringArrType() {
			return getRuleContext(StringArrTypeContext.class,0);
		}
		public MainArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainArg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitMainArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainArgContext mainArg() throws RecognitionException {
		MainArgContext _localctx = new MainArgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			identifier();
			setState(131);
			match(T__1);
			setState(132);
			stringArrType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalDefinitionsContext extends ParserRuleContext {
		public NameDeclStatementContext nameDeclStatement() {
			return getRuleContext(NameDeclStatementContext.class,0);
		}
		public NameDeclDefStatementContext nameDeclDefStatement() {
			return getRuleContext(NameDeclDefStatementContext.class,0);
		}
		public GlobalDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDefinitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitGlobalDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDefinitionsContext globalDefinitions() throws RecognitionException {
		GlobalDefinitionsContext _localctx = new GlobalDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_globalDefinitions);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				nameDeclStatement();
				}
				break;
			case T__5:
			case T__12:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				nameDeclDefStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDefinitionContext extends ParserRuleContext {
		public FuncPrototypeContext funcPrototype() {
			return getRuleContext(FuncPrototypeContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitFuncDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			funcPrototype();
			setState(139);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncPrototypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FuncArgListContext funcArgList() {
			return getRuleContext(FuncArgListContext.class,0);
		}
		public FuncPrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcPrototype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitFuncPrototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncPrototypeContext funcPrototype() throws RecognitionException {
		FuncPrototypeContext _localctx = new FuncPrototypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcPrototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__5);
			setState(142);
			identifier();
			setState(143);
			match(T__3);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(144);
				funcArgList();
				}
			}

			setState(147);
			match(T__4);
			setState(148);
			match(T__6);
			setState(149);
			returnType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncArgListContext extends ParserRuleContext {
		public List<FuncArgumentContext> funcArgument() {
			return getRuleContexts(FuncArgumentContext.class);
		}
		public FuncArgumentContext funcArgument(int i) {
			return getRuleContext(FuncArgumentContext.class,i);
		}
		public FuncArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitFuncArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgListContext funcArgList() throws RecognitionException {
		FuncArgListContext _localctx = new FuncArgListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcArgList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			funcArgument();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(152);
				match(T__7);
				setState(153);
				funcArgument();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncArgumentContext extends ParserRuleContext {
		public TypeAssocContext typeAssoc() {
			return getRuleContext(TypeAssocContext.class,0);
		}
		public FuncArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitFuncArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgumentContext funcArgument() throws RecognitionException {
		FuncArgumentContext _localctx = new FuncArgumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			typeAssoc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NULL_VALUE() { return getToken(JavanaParser.NULL_VALUE, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnType);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_ARR_TYPE:
			case BOOL_ARR_TYPE:
			case STR_ARR_TYPE:
			case REC_ARR_TYPE:
			case INT_TYPE:
			case BOOL_TYPE:
			case STR_TYPE:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				type();
				}
				break;
			case NULL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(NULL_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordDeclContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TypeAssocContext> typeAssoc() {
			return getRuleContexts(TypeAssocContext.class);
		}
		public TypeAssocContext typeAssoc(int i) {
			return getRuleContext(TypeAssocContext.class,i);
		}
		public RecordDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitRecordDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordDeclContext recordDecl() throws RecognitionException {
		RecordDeclContext _localctx = new RecordDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_recordDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__8);
			setState(166);
			identifier();
			setState(167);
			match(T__9);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(168);
				typeAssoc();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclContext extends ParserRuleContext {
		public TypeAssocContext typeAssoc() {
			return getRuleContext(TypeAssocContext.class,0);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__11);
			setState(177);
			typeAssoc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAssocContext extends ParserRuleContext {
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeAssocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssoc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitTypeAssoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAssocContext typeAssoc() throws RecognitionException {
		TypeAssocContext _localctx = new TypeAssocContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeAssoc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			nameList();
			setState(180);
			match(T__1);
			setState(181);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDefContext extends ParserRuleContext {
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitVariableDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefContext variableDef() throws RecognitionException {
		VariableDefContext _localctx = new VariableDefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__12);
			setState(184);
			nameList();
			setState(185);
			match(T__13);
			setState(186);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDefContext extends ParserRuleContext {
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitConstantDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefContext constantDef() throws RecognitionException {
		ConstantDefContext _localctx = new ConstantDefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constantDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__14);
			setState(189);
			nameList();
			setState(190);
			match(T__13);
			setState(191);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public NameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameListContext nameList() throws RecognitionException {
		NameListContext _localctx = new NameListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			identifier();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(194);
				match(T__7);
				setState(195);
				identifier();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public NameDeclStatementContext nameDeclStatement() {
			return getRuleContext(NameDeclStatementContext.class,0);
		}
		public NameDeclDefStatementContext nameDeclDefStatement() {
			return getRuleContext(NameDeclDefStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public PrintLineStatementContext printLineStatement() {
			return getRuleContext(PrintLineStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				nameDeclStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				nameDeclDefStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				assignmentStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(206);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				whileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(208);
				expressionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(209);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(210);
				printStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(211);
				printLineStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__9);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090723984750160L) != 0)) {
				{
				{
				setState(215);
				statement();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameDeclStatementContext extends ParserRuleContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public RecordDeclContext recordDecl() {
			return getRuleContext(RecordDeclContext.class,0);
		}
		public NameDeclStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameDeclStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitNameDeclStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameDeclStatementContext nameDeclStatement() throws RecognitionException {
		NameDeclStatementContext _localctx = new NameDeclStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nameDeclStatement);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				variableDecl();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				recordDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameDeclDefStatementContext extends ParserRuleContext {
		public VariableDefContext variableDef() {
			return getRuleContext(VariableDefContext.class,0);
		}
		public ConstantDefContext constantDef() {
			return getRuleContext(ConstantDefContext.class,0);
		}
		public FuncDefinitionContext funcDefinition() {
			return getRuleContext(FuncDefinitionContext.class,0);
		}
		public NameDeclDefStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameDeclDefStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitNameDeclDefStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameDeclDefStatementContext nameDeclDefStatement() throws RecognitionException {
		NameDeclDefStatementContext _localctx = new NameDeclDefStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nameDeclDefStatement);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				variableDef();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				constantDef();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				funcDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentModifierContext identModifier() {
			return getRuleContext(IdentModifierContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			identifier();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15 || _la==T__16) {
				{
				setState(233);
				identModifier();
				}
			}

			setState(236);
			match(T__13);
			setState(237);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentModifierContext extends ParserRuleContext {
		public ArrIdxSpecifierContext arrIdxSpecifier() {
			return getRuleContext(ArrIdxSpecifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitIdentModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentModifierContext identModifier() throws RecognitionException {
		IdentModifierContext _localctx = new IdentModifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_identModifier);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				arrIdxSpecifier();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(T__15);
				setState(241);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrIdxSpecifierContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrIdxSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrIdxSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitArrIdxSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrIdxSpecifierContext arrIdxSpecifier() throws RecognitionException {
		ArrIdxSpecifierContext _localctx = new ArrIdxSpecifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrIdxSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__16);
			setState(245);
			expression(0);
			setState(246);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__18);
			setState(249);
			match(T__3);
			setState(250);
			expression(0);
			setState(251);
			match(T__4);
			setState(252);
			blockStatement();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(253);
				match(T__19);
				setState(254);
				blockStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public VariableDefContext variableDef() {
			return getRuleContext(VariableDefContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__20);
			setState(258);
			match(T__3);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(259);
				variableDef();
				}
			}

			setState(262);
			match(T__21);
			setState(263);
			expression(0);
			setState(264);
			match(T__21);
			setState(265);
			expression(0);
			setState(266);
			match(T__4);
			setState(267);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__22);
			setState(270);
			match(T__3);
			setState(271);
			expression(0);
			setState(272);
			match(T__4);
			setState(273);
			blockStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__23);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(278);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public PrintArgumentContext printArgument() {
			return getRuleContext(PrintArgumentContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__24);
			setState(282);
			printArgument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintLineStatementContext extends ParserRuleContext {
		public PrintArgumentContext printArgument() {
			return getRuleContext(PrintArgumentContext.class,0);
		}
		public PrintLineStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printLineStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitPrintLineStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintLineStatementContext printLineStatement() throws RecognitionException {
		PrintLineStatementContext _localctx = new PrintLineStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_printLineStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__25);
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(285);
				printArgument();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public PrintArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitPrintArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintArgumentContext printArgument() throws RecognitionException {
		PrintArgumentContext _localctx = new PrintArgumentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_printArgument);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(T__3);
				setState(290);
				exprList();
				setState(291);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Typespec type;
        public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ReadCharCallContext readCharCall() {
			return getRuleContext(ReadCharCallContext.class,0);
		}
		public ReadLineCallContext readLineCall() {
			return getRuleContext(ReadLineCallContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public NewArrayContext newArray() {
			return getRuleContext(NewArrayContext.class,0);
		}
		public NewRecordContext newRecord() {
			return getRuleContext(NewRecordContext.class,0);
		}
		public TerminalNode HIGHER_ARITH_OP() { return getToken(JavanaParser.HIGHER_ARITH_OP, 0); }
		public TerminalNode ARITH_OP() { return getToken(JavanaParser.ARITH_OP, 0); }
		public TerminalNode REL_OP() { return getToken(JavanaParser.REL_OP, 0); }
		public TerminalNode EQ_OP() { return getToken(JavanaParser.EQ_OP, 0); }
		public TerminalNode COND_OP() { return getToken(JavanaParser.COND_OP, 0); }
		public ArrIdxSpecifierContext arrIdxSpecifier() {
			return getRuleContext(ArrIdxSpecifierContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(296);
				match(T__27);
				setState(297);
				expression(10);
				}
				break;
			case 2:
				{
				setState(298);
				match(T__28);
				setState(299);
				expression(9);
				}
				break;
			case 3:
				{
				setState(300);
				match(T__3);
				setState(301);
				expression(0);
				setState(302);
				match(T__4);
				}
				break;
			case 4:
				{
				setState(304);
				readCharCall();
				}
				break;
			case 5:
				{
				setState(305);
				readLineCall();
				}
				break;
			case 6:
				{
				setState(306);
				functionCall();
				}
				break;
			case 7:
				{
				setState(307);
				identifier();
				}
				break;
			case 8:
				{
				setState(308);
				literal();
				}
				break;
			case 9:
				{
				setState(309);
				newArray();
				}
				break;
			case 10:
				{
				setState(310);
				newRecord();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(314);
						match(HIGHER_ARITH_OP);
						setState(315);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(317);
						match(ARITH_OP);
						setState(318);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(320);
						match(REL_OP);
						setState(321);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(323);
						match(EQ_OP);
						setState(324);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(326);
						match(COND_OP);
						setState(327);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(328);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(329);
						arrIdxSpecifier();
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(330);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(331);
						match(T__15);
						setState(332);
						match(T__26);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(334);
						match(T__15);
						setState(335);
						identifier();
						}
						break;
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			expression(0);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(342);
				match(T__7);
				setState(343);
				expression(0);
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadCharCallContext extends ParserRuleContext {
		public ReadCharCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readCharCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitReadCharCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadCharCallContext readCharCall() throws RecognitionException {
		ReadCharCallContext _localctx = new ReadCharCallContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_readCharCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__29);
			setState(350);
			match(T__3);
			setState(351);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadLineCallContext extends ParserRuleContext {
		public ReadLineCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readLineCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitReadLineCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadLineCallContext readLineCall() throws RecognitionException {
		ReadLineCallContext _localctx = new ReadLineCallContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_readLineCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__30);
			setState(354);
			match(T__3);
			setState(355);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			identifier();
			setState(358);
			match(T__3);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090723856252944L) != 0)) {
				{
				setState(359);
				exprList();
				}
			}

			setState(362);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewArrayContext extends ParserRuleContext {
		public ArrIdxSpecifierContext arrIdxSpecifier() {
			return getRuleContext(ArrIdxSpecifierContext.class,0);
		}
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewArrayContext newArray() throws RecognitionException {
		NewArrayContext _localctx = new NewArrayContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_newArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__31);
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case BOOL_TYPE:
			case STR_TYPE:
				{
				setState(365);
				scalarType();
				}
				break;
			case IDENT:
				{
				setState(366);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(369);
			arrIdxSpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewRecordContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarInitListContext varInitList() {
			return getRuleContext(VarInitListContext.class,0);
		}
		public NewRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newRecord; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitNewRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewRecordContext newRecord() throws RecognitionException {
		NewRecordContext _localctx = new NewRecordContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_newRecord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__31);
			setState(372);
			identifier();
			setState(373);
			match(T__9);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(374);
				varInitList();
				}
			}

			setState(377);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarInitListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VarInitListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInitList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitVarInitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarInitListContext varInitList() throws RecognitionException {
		VarInitListContext _localctx = new VarInitListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_varInitList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			identifier();
			setState(380);
			match(T__13);
			setState(381);
			expression(0);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(382);
				match(T__7);
				setState(383);
				identifier();
				setState(384);
				match(T__13);
				setState(385);
				expression(0);
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(JavanaParser.INTEGER, 0); }
		public TerminalNode BOOL() { return getToken(JavanaParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(JavanaParser.STRING, 0); }
		public TerminalNode NULL_VALUE() { return getToken(JavanaParser.NULL_VALUE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public CompositeTypeContext compositeType() {
			return getRuleContext(CompositeTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_type);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case BOOL_TYPE:
			case STR_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				scalarType();
				}
				break;
			case INT_ARR_TYPE:
			case BOOL_ARR_TYPE:
			case STR_ARR_TYPE:
			case REC_ARR_TYPE:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				compositeType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScalarTypeContext extends ParserRuleContext {
		public IntegerTypeContext integerType() {
			return getRuleContext(IntegerTypeContext.class,0);
		}
		public BooleanTypeContext booleanType() {
			return getRuleContext(BooleanTypeContext.class,0);
		}
		public StringTypeContext stringType() {
			return getRuleContext(StringTypeContext.class,0);
		}
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_scalarType);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				integerType();
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				booleanType();
				}
				break;
			case STR_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				stringType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompositeTypeContext extends ParserRuleContext {
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public IntegerArrTypeContext integerArrType() {
			return getRuleContext(IntegerArrTypeContext.class,0);
		}
		public BooleanArrTypeContext booleanArrType() {
			return getRuleContext(BooleanArrTypeContext.class,0);
		}
		public StringArrTypeContext stringArrType() {
			return getRuleContext(StringArrTypeContext.class,0);
		}
		public RecordArrTypeContext recordArrType() {
			return getRuleContext(RecordArrTypeContext.class,0);
		}
		public CompositeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitCompositeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositeTypeContext compositeType() throws RecognitionException {
		CompositeTypeContext _localctx = new CompositeTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_compositeType);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				recordType();
				}
				break;
			case INT_ARR_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				integerArrType();
				}
				break;
			case BOOL_ARR_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				booleanArrType();
				}
				break;
			case STR_ARR_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				stringArrType();
				}
				break;
			case REC_ARR_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(407);
				recordArrType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerTypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(JavanaParser.INT_TYPE, 0); }
		public IntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerTypeContext integerType() throws RecognitionException {
		IntegerTypeContext _localctx = new IntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_integerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(INT_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends ParserRuleContext {
		public TerminalNode BOOL_TYPE() { return getToken(JavanaParser.BOOL_TYPE, 0); }
		public BooleanTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanTypeContext booleanType() throws RecognitionException {
		BooleanTypeContext _localctx = new BooleanTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_booleanType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(BOOL_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringTypeContext extends ParserRuleContext {
		public TerminalNode STR_TYPE() { return getToken(JavanaParser.STR_TYPE, 0); }
		public StringTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringTypeContext stringType() throws RecognitionException {
		StringTypeContext _localctx = new StringTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_stringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(STR_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitRecordType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_recordType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerArrTypeContext extends ParserRuleContext {
		public TerminalNode INT_ARR_TYPE() { return getToken(JavanaParser.INT_ARR_TYPE, 0); }
		public IntegerArrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerArrType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitIntegerArrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerArrTypeContext integerArrType() throws RecognitionException {
		IntegerArrTypeContext _localctx = new IntegerArrTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_integerArrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(INT_ARR_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanArrTypeContext extends ParserRuleContext {
		public TerminalNode BOOL_ARR_TYPE() { return getToken(JavanaParser.BOOL_ARR_TYPE, 0); }
		public BooleanArrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanArrType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitBooleanArrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanArrTypeContext booleanArrType() throws RecognitionException {
		BooleanArrTypeContext _localctx = new BooleanArrTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_booleanArrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(BOOL_ARR_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringArrTypeContext extends ParserRuleContext {
		public TerminalNode STR_ARR_TYPE() { return getToken(JavanaParser.STR_ARR_TYPE, 0); }
		public StringArrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringArrType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitStringArrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringArrTypeContext stringArrType() throws RecognitionException {
		StringArrTypeContext _localctx = new StringArrTypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_stringArrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(STR_ARR_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordArrTypeContext extends ParserRuleContext {
		public TerminalNode REC_ARR_TYPE() { return getToken(JavanaParser.REC_ARR_TYPE, 0); }
		public RecordArrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordArrType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitRecordArrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordArrTypeContext recordArrType() throws RecognitionException {
		RecordArrTypeContext _localctx = new RecordArrTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_recordArrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(REC_ARR_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public SymTableEntry entry;
        public TerminalNode IDENT() { return getToken(JavanaParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u01ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0005\u0000k\b\u0000\n"+
		"\u0000\f\u0000n\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000r\b\u0000\n"+
		"\u0000\f\u0000u\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002~\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0089\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0092\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u009b\b\u0007\n\u0007\f\u0007\u009e"+
		"\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u00a4\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00aa\b\n\n\n\f\n\u00ad\t\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00c5\b\u000f\n\u000f\f\u000f\u00c8\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d5\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00d9\b\u0011\n\u0011\f\u0011\u00dc\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00e2\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00e7\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00eb\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00f3\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0100\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u0105\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0118\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u011f\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0126\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u0138\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0151\b\u001f\n\u001f\f\u001f\u0154\t\u001f\u0001 \u0001"+
		" \u0001 \u0005 \u0159\b \n \f \u015c\t \u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0003#\u0169\b#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0003$\u0170\b$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u0178\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0005&\u0184\b&\n&\f&\u0187\t&\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0003(\u018d\b(\u0001)\u0001)\u0001)\u0003)\u0192\b)"+
		"\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0199\b*\u0001+\u0001+\u0001"+
		",\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u0001"+
		"1\u00011\u00012\u00012\u00013\u00013\u00013\u0000\u0001>4\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\u0001\u0001\u0000.1\u01b3"+
		"\u0000h\u0001\u0000\u0000\u0000\u0002v\u0001\u0000\u0000\u0000\u0004z"+
		"\u0001\u0000\u0000\u0000\u0006\u0082\u0001\u0000\u0000\u0000\b\u0088\u0001"+
		"\u0000\u0000\u0000\n\u008a\u0001\u0000\u0000\u0000\f\u008d\u0001\u0000"+
		"\u0000\u0000\u000e\u0097\u0001\u0000\u0000\u0000\u0010\u009f\u0001\u0000"+
		"\u0000\u0000\u0012\u00a3\u0001\u0000\u0000\u0000\u0014\u00a5\u0001\u0000"+
		"\u0000\u0000\u0016\u00b0\u0001\u0000\u0000\u0000\u0018\u00b3\u0001\u0000"+
		"\u0000\u0000\u001a\u00b7\u0001\u0000\u0000\u0000\u001c\u00bc\u0001\u0000"+
		"\u0000\u0000\u001e\u00c1\u0001\u0000\u0000\u0000 \u00d4\u0001\u0000\u0000"+
		"\u0000\"\u00d6\u0001\u0000\u0000\u0000$\u00e1\u0001\u0000\u0000\u0000"+
		"&\u00e6\u0001\u0000\u0000\u0000(\u00e8\u0001\u0000\u0000\u0000*\u00f2"+
		"\u0001\u0000\u0000\u0000,\u00f4\u0001\u0000\u0000\u0000.\u00f8\u0001\u0000"+
		"\u0000\u00000\u0101\u0001\u0000\u0000\u00002\u010d\u0001\u0000\u0000\u0000"+
		"4\u0113\u0001\u0000\u0000\u00006\u0115\u0001\u0000\u0000\u00008\u0119"+
		"\u0001\u0000\u0000\u0000:\u011c\u0001\u0000\u0000\u0000<\u0125\u0001\u0000"+
		"\u0000\u0000>\u0137\u0001\u0000\u0000\u0000@\u0155\u0001\u0000\u0000\u0000"+
		"B\u015d\u0001\u0000\u0000\u0000D\u0161\u0001\u0000\u0000\u0000F\u0165"+
		"\u0001\u0000\u0000\u0000H\u016c\u0001\u0000\u0000\u0000J\u0173\u0001\u0000"+
		"\u0000\u0000L\u017b\u0001\u0000\u0000\u0000N\u0188\u0001\u0000\u0000\u0000"+
		"P\u018c\u0001\u0000\u0000\u0000R\u0191\u0001\u0000\u0000\u0000T\u0198"+
		"\u0001\u0000\u0000\u0000V\u019a\u0001\u0000\u0000\u0000X\u019c\u0001\u0000"+
		"\u0000\u0000Z\u019e\u0001\u0000\u0000\u0000\\\u01a0\u0001\u0000\u0000"+
		"\u0000^\u01a2\u0001\u0000\u0000\u0000`\u01a4\u0001\u0000\u0000\u0000b"+
		"\u01a6\u0001\u0000\u0000\u0000d\u01a8\u0001\u0000\u0000\u0000f\u01aa\u0001"+
		"\u0000\u0000\u0000hl\u0003\u0002\u0001\u0000ik\u0003\b\u0004\u0000ji\u0001"+
		"\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000os\u0003\u0004\u0002\u0000pr\u0003\b\u0004\u0000qp\u0001\u0000\u0000"+
		"\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000t\u0001\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"vw\u0005\u0001\u0000\u0000wx\u0003f3\u0000xy\u0005\u0002\u0000\u0000y"+
		"\u0003\u0001\u0000\u0000\u0000z{\u0005\u0003\u0000\u0000{}\u0005\u0004"+
		"\u0000\u0000|~\u0003\u0006\u0003\u0000}|\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0005"+
		"\u0000\u0000\u0080\u0081\u0003\"\u0011\u0000\u0081\u0005\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0003f3\u0000\u0083\u0084\u0005\u0002\u0000\u0000\u0084"+
		"\u0085\u0003b1\u0000\u0085\u0007\u0001\u0000\u0000\u0000\u0086\u0089\u0003"+
		"$\u0012\u0000\u0087\u0089\u0003&\u0013\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\t\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0003\f\u0006\u0000\u008b\u008c\u0003\"\u0011\u0000\u008c"+
		"\u000b\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0006\u0000\u0000\u008e"+
		"\u008f\u0003f3\u0000\u008f\u0091\u0005\u0004\u0000\u0000\u0090\u0092\u0003"+
		"\u000e\u0007\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u0005\u0000\u0000\u0094\u0095\u0005\u0007\u0000\u0000\u0095\u0096\u0003"+
		"\u0012\t\u0000\u0096\r\u0001\u0000\u0000\u0000\u0097\u009c\u0003\u0010"+
		"\b\u0000\u0098\u0099\u0005\b\u0000\u0000\u0099\u009b\u0003\u0010\b\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u000f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0003\u0018\f\u0000\u00a0\u0011\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a4\u0003P(\u0000\u00a2\u00a4\u00051\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u0013\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005\t\u0000\u0000\u00a6\u00a7\u0003f"+
		"3\u0000\u00a7\u00ab\u0005\n\u0000\u0000\u00a8\u00aa\u0003\u0018\f\u0000"+
		"\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\u000b\u0000\u0000\u00af\u0015\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0005\f\u0000\u0000\u00b1\u00b2\u0003\u0018\f\u0000\u00b2"+
		"\u0017\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003\u001e\u000f\u0000\u00b4"+
		"\u00b5\u0005\u0002\u0000\u0000\u00b5\u00b6\u0003P(\u0000\u00b6\u0019\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0005\r\u0000\u0000\u00b8\u00b9\u0003\u001e"+
		"\u000f\u0000\u00b9\u00ba\u0005\u000e\u0000\u0000\u00ba\u00bb\u0003>\u001f"+
		"\u0000\u00bb\u001b\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u000f\u0000"+
		"\u0000\u00bd\u00be\u0003\u001e\u000f\u0000\u00be\u00bf\u0005\u000e\u0000"+
		"\u0000\u00bf\u00c0\u0003>\u001f\u0000\u00c0\u001d\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c6\u0003f3\u0000\u00c2\u00c3\u0005\b\u0000\u0000\u00c3\u00c5"+
		"\u0003f3\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u001f\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c9\u00d5\u0003\"\u0011\u0000\u00ca\u00d5\u0003$\u0012"+
		"\u0000\u00cb\u00d5\u0003&\u0013\u0000\u00cc\u00d5\u0003(\u0014\u0000\u00cd"+
		"\u00d5\u0003.\u0017\u0000\u00ce\u00d5\u00030\u0018\u0000\u00cf\u00d5\u0003"+
		"2\u0019\u0000\u00d0\u00d5\u00034\u001a\u0000\u00d1\u00d5\u00036\u001b"+
		"\u0000\u00d2\u00d5\u00038\u001c\u0000\u00d3\u00d5\u0003:\u001d\u0000\u00d4"+
		"\u00c9\u0001\u0000\u0000\u0000\u00d4\u00ca\u0001\u0000\u0000\u0000\u00d4"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000\u00d4"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d4\u00ce\u0001\u0000\u0000\u0000\u00d4"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d0\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5!\u0001\u0000\u0000\u0000\u00d6\u00da"+
		"\u0005\n\u0000\u0000\u00d7\u00d9\u0003 \u0010\u0000\u00d8\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"\u000b\u0000\u0000\u00de#\u0001\u0000\u0000\u0000\u00df\u00e2\u0003\u0016"+
		"\u000b\u0000\u00e0\u00e2\u0003\u0014\n\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2%\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e7\u0003\u001a\r\u0000\u00e4\u00e7\u0003\u001c\u000e\u0000\u00e5"+
		"\u00e7\u0003\n\u0005\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\'\u0001"+
		"\u0000\u0000\u0000\u00e8\u00ea\u0003f3\u0000\u00e9\u00eb\u0003*\u0015"+
		"\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u000e\u0000"+
		"\u0000\u00ed\u00ee\u0003>\u001f\u0000\u00ee)\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f3\u0003,\u0016\u0000\u00f0\u00f1\u0005\u0010\u0000\u0000\u00f1\u00f3"+
		"\u0003f3\u0000\u00f2\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f3+\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0011\u0000"+
		"\u0000\u00f5\u00f6\u0003>\u001f\u0000\u00f6\u00f7\u0005\u0012\u0000\u0000"+
		"\u00f7-\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0013\u0000\u0000\u00f9"+
		"\u00fa\u0005\u0004\u0000\u0000\u00fa\u00fb\u0003>\u001f\u0000\u00fb\u00fc"+
		"\u0005\u0005\u0000\u0000\u00fc\u00ff\u0003\"\u0011\u0000\u00fd\u00fe\u0005"+
		"\u0014\u0000\u0000\u00fe\u0100\u0003\"\u0011\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100/\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0005\u0015\u0000\u0000\u0102\u0104\u0005\u0004\u0000"+
		"\u0000\u0103\u0105\u0003\u001a\r\u0000\u0104\u0103\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0005\u0016\u0000\u0000\u0107\u0108\u0003>\u001f\u0000\u0108"+
		"\u0109\u0005\u0016\u0000\u0000\u0109\u010a\u0003>\u001f\u0000\u010a\u010b"+
		"\u0005\u0005\u0000\u0000\u010b\u010c\u0003\"\u0011\u0000\u010c1\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005\u0017\u0000\u0000\u010e\u010f\u0005"+
		"\u0004\u0000\u0000\u010f\u0110\u0003>\u001f\u0000\u0110\u0111\u0005\u0005"+
		"\u0000\u0000\u0111\u0112\u0003\"\u0011\u0000\u01123\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0003>\u001f\u0000\u01145\u0001\u0000\u0000\u0000\u0115"+
		"\u0117\u0005\u0018\u0000\u0000\u0116\u0118\u0003>\u001f\u0000\u0117\u0116"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u01187\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0005\u0019\u0000\u0000\u011a\u011b\u0003"+
		"<\u001e\u0000\u011b9\u0001\u0000\u0000\u0000\u011c\u011e\u0005\u001a\u0000"+
		"\u0000\u011d\u011f\u0003<\u001e\u0000\u011e\u011d\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f;\u0001\u0000\u0000\u0000\u0120"+
		"\u0126\u0003>\u001f\u0000\u0121\u0122\u0005\u0004\u0000\u0000\u0122\u0123"+
		"\u0003@ \u0000\u0123\u0124\u0005\u0005\u0000\u0000\u0124\u0126\u0001\u0000"+
		"\u0000\u0000\u0125\u0120\u0001\u0000\u0000\u0000\u0125\u0121\u0001\u0000"+
		"\u0000\u0000\u0126=\u0001\u0000\u0000\u0000\u0127\u0128\u0006\u001f\uffff"+
		"\uffff\u0000\u0128\u0129\u0005\u001c\u0000\u0000\u0129\u0138\u0003>\u001f"+
		"\n\u012a\u012b\u0005\u001d\u0000\u0000\u012b\u0138\u0003>\u001f\t\u012c"+
		"\u012d\u0005\u0004\u0000\u0000\u012d\u012e\u0003>\u001f\u0000\u012e\u012f"+
		"\u0005\u0005\u0000\u0000\u012f\u0138\u0001\u0000\u0000\u0000\u0130\u0138"+
		"\u0003B!\u0000\u0131\u0138\u0003D\"\u0000\u0132\u0138\u0003F#\u0000\u0133"+
		"\u0138\u0003f3\u0000\u0134\u0138\u0003N\'\u0000\u0135\u0138\u0003H$\u0000"+
		"\u0136\u0138\u0003J%\u0000\u0137\u0127\u0001\u0000\u0000\u0000\u0137\u012a"+
		"\u0001\u0000\u0000\u0000\u0137\u012c\u0001\u0000\u0000\u0000\u0137\u0130"+
		"\u0001\u0000\u0000\u0000\u0137\u0131\u0001\u0000\u0000\u0000\u0137\u0132"+
		"\u0001\u0000\u0000\u0000\u0137\u0133\u0001\u0000\u0000\u0000\u0137\u0134"+
		"\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u0152\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\n\u000f\u0000\u0000\u013a\u013b\u0005(\u0000\u0000\u013b\u0151\u0003"+
		">\u001f\u0010\u013c\u013d\n\u000e\u0000\u0000\u013d\u013e\u0005)\u0000"+
		"\u0000\u013e\u0151\u0003>\u001f\u000f\u013f\u0140\n\r\u0000\u0000\u0140"+
		"\u0141\u0005*\u0000\u0000\u0141\u0151\u0003>\u001f\u000e\u0142\u0143\n"+
		"\f\u0000\u0000\u0143\u0144\u0005+\u0000\u0000\u0144\u0151\u0003>\u001f"+
		"\r\u0145\u0146\n\u000b\u0000\u0000\u0146\u0147\u0005,\u0000\u0000\u0147"+
		"\u0151\u0003>\u001f\f\u0148\u0149\n\u0012\u0000\u0000\u0149\u0151\u0003"+
		",\u0016\u0000\u014a\u014b\n\u0011\u0000\u0000\u014b\u014c\u0005\u0010"+
		"\u0000\u0000\u014c\u0151\u0005\u001b\u0000\u0000\u014d\u014e\n\u0010\u0000"+
		"\u0000\u014e\u014f\u0005\u0010\u0000\u0000\u014f\u0151\u0003f3\u0000\u0150"+
		"\u0139\u0001\u0000\u0000\u0000\u0150\u013c\u0001\u0000\u0000\u0000\u0150"+
		"\u013f\u0001\u0000\u0000\u0000\u0150\u0142\u0001\u0000\u0000\u0000\u0150"+
		"\u0145\u0001\u0000\u0000\u0000\u0150\u0148\u0001\u0000\u0000\u0000\u0150"+
		"\u014a\u0001\u0000\u0000\u0000\u0150\u014d\u0001\u0000\u0000\u0000\u0151"+
		"\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u0001\u0000\u0000\u0000\u0153?\u0001\u0000\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0155\u015a\u0003>\u001f\u0000\u0156\u0157\u0005"+
		"\b\u0000\u0000\u0157\u0159\u0003>\u001f\u0000\u0158\u0156\u0001\u0000"+
		"\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015bA\u0001\u0000\u0000"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u001e\u0000"+
		"\u0000\u015e\u015f\u0005\u0004\u0000\u0000\u015f\u0160\u0005\u0005\u0000"+
		"\u0000\u0160C\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u001f\u0000\u0000"+
		"\u0162\u0163\u0005\u0004\u0000\u0000\u0163\u0164\u0005\u0005\u0000\u0000"+
		"\u0164E\u0001\u0000\u0000\u0000\u0165\u0166\u0003f3\u0000\u0166\u0168"+
		"\u0005\u0004\u0000\u0000\u0167\u0169\u0003@ \u0000\u0168\u0167\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0005\u0005\u0000\u0000\u016bG\u0001\u0000\u0000"+
		"\u0000\u016c\u016f\u0005 \u0000\u0000\u016d\u0170\u0003R)\u0000\u016e"+
		"\u0170\u0003f3\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u016e\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0003"+
		",\u0016\u0000\u0172I\u0001\u0000\u0000\u0000\u0173\u0174\u0005 \u0000"+
		"\u0000\u0174\u0175\u0003f3\u0000\u0175\u0177\u0005\n\u0000\u0000\u0176"+
		"\u0178\u0003L&\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0177\u0178\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0005"+
		"\u000b\u0000\u0000\u017aK\u0001\u0000\u0000\u0000\u017b\u017c\u0003f3"+
		"\u0000\u017c\u017d\u0005\u000e\u0000\u0000\u017d\u0185\u0003>\u001f\u0000"+
		"\u017e\u017f\u0005\b\u0000\u0000\u017f\u0180\u0003f3\u0000\u0180\u0181"+
		"\u0005\u000e\u0000\u0000\u0181\u0182\u0003>\u001f\u0000\u0182\u0184\u0001"+
		"\u0000\u0000\u0000\u0183\u017e\u0001\u0000\u0000\u0000\u0184\u0187\u0001"+
		"\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001"+
		"\u0000\u0000\u0000\u0186M\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0007\u0000\u0000\u0000\u0189O\u0001\u0000\u0000"+
		"\u0000\u018a\u018d\u0003R)\u0000\u018b\u018d\u0003T*\u0000\u018c\u018a"+
		"\u0001\u0000\u0000\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018dQ\u0001"+
		"\u0000\u0000\u0000\u018e\u0192\u0003V+\u0000\u018f\u0192\u0003X,\u0000"+
		"\u0190\u0192\u0003Z-\u0000\u0191\u018e\u0001\u0000\u0000\u0000\u0191\u018f"+
		"\u0001\u0000\u0000\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0192S\u0001"+
		"\u0000\u0000\u0000\u0193\u0199\u0003\\.\u0000\u0194\u0199\u0003^/\u0000"+
		"\u0195\u0199\u0003`0\u0000\u0196\u0199\u0003b1\u0000\u0197\u0199\u0003"+
		"d2\u0000\u0198\u0193\u0001\u0000\u0000\u0000\u0198\u0194\u0001\u0000\u0000"+
		"\u0000\u0198\u0195\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000"+
		"\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199U\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0005%\u0000\u0000\u019bW\u0001\u0000\u0000\u0000\u019c\u019d"+
		"\u0005&\u0000\u0000\u019dY\u0001\u0000\u0000\u0000\u019e\u019f\u0005\'"+
		"\u0000\u0000\u019f[\u0001\u0000\u0000\u0000\u01a0\u01a1\u0003f3\u0000"+
		"\u01a1]\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005!\u0000\u0000\u01a3_"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\"\u0000\u0000\u01a5a\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0005#\u0000\u0000\u01a7c\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0005$\u0000\u0000\u01a9e\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ab\u0005-\u0000\u0000\u01abg\u0001\u0000\u0000\u0000\u001fls}\u0088"+
		"\u0091\u009c\u00a3\u00ab\u00c6\u00d4\u00da\u00e1\u00e6\u00ea\u00f2\u00ff"+
		"\u0104\u0117\u011e\u0125\u0137\u0150\u0152\u015a\u0168\u016f\u0177\u0185"+
		"\u018c\u0191\u0198";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}