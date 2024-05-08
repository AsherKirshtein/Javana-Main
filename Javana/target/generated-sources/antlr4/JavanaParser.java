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
		None=32, INT_ARR_TYPE=33, BOOL_ARR_TYPE=34, STR_ARR_TYPE=35, REC_ARR_TYPE=36, 
		INT_TYPE=37, BOOL_TYPE=38, STR_TYPE=39, HIGHER_ARITH_OP=40, ARITH_OP=41, 
		REL_OP=42, EQ_OP=43, COND_OP=44, BOOL=45, NULL_VALUE=46, IDENT=47, STRING=48, 
		INTEGER=49, NEWLINE=50, WS=51, COMMENT=52, LINE_COMMENT=53;
	public static final int
		RULE_program = 0, RULE_programHeader = 1, RULE_mainMethod = 2, RULE_mainArg = 3, 
		RULE_globalDefinitions = 4, RULE_funcDefinition = 5, RULE_funcPrototype = 6, 
		RULE_funcArgList = 7, RULE_funcArgument = 8, RULE_returnType = 9, RULE_recordDecl = 10, 
		RULE_variableDecl = 11, RULE_typeAssoc = 12, RULE_variableDef = 13, RULE_constantDef = 14, 
		RULE_nameList = 15, RULE_statement = 16, RULE_blockStatement = 17, RULE_nameDeclStatement = 18, 
		RULE_nameDeclDefStatement = 19, RULE_assignmentStatement = 20, RULE_variable = 21, 
		RULE_varModifier = 22, RULE_arrIdxSpecifier = 23, RULE_ifStatement = 24, 
		RULE_forStatement = 25, RULE_whileStatement = 26, RULE_expressionStatement = 27, 
		RULE_returnStatement = 28, RULE_printStatement = 29, RULE_printLineStatement = 30, 
		RULE_printArgument = 31, RULE_expression = 32, RULE_exprList = 33, RULE_readCharCall = 34, 
		RULE_readLineCall = 35, RULE_functionCall = 36, RULE_newArray = 37, RULE_newRecord = 38, 
		RULE_fieldInitList = 39, RULE_fieldInit = 40, RULE_literal = 41, RULE_type = 42, 
		RULE_scalarType = 43, RULE_compositeType = 44, RULE_integerType = 45, 
		RULE_booleanType = 46, RULE_stringType = 47, RULE_recordType = 48, RULE_integerArrType = 49, 
		RULE_booleanArrType = 50, RULE_stringArrType = 51, RULE_recordArrType = 52, 
		RULE_identifier = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programHeader", "mainMethod", "mainArg", "globalDefinitions", 
			"funcDefinition", "funcPrototype", "funcArgList", "funcArgument", "returnType", 
			"recordDecl", "variableDecl", "typeAssoc", "variableDef", "constantDef", 
			"nameList", "statement", "blockStatement", "nameDeclStatement", "nameDeclDefStatement", 
			"assignmentStatement", "variable", "varModifier", "arrIdxSpecifier", 
			"ifStatement", "forStatement", "whileStatement", "expressionStatement", 
			"returnStatement", "printStatement", "printLineStatement", "printArgument", 
			"expression", "exprList", "readCharCall", "readLineCall", "functionCall", 
			"newArray", "newRecord", "fieldInitList", "fieldInit", "literal", "type", 
			"scalarType", "compositeType", "integerType", "booleanType", "stringType", 
			"recordType", "integerArrType", "booleanArrType", "stringArrType", "recordArrType", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Javana'", "':'", "'@main'", "'('", "')'", "'func'", "'->'", "','", 
			"'record'", "'{'", "'}'", "'decl'", "'var'", "'='", "'const'", "'.'", 
			"'['", "']'", "'if'", "'else'", "'for'", "';'", "'while'", "'return'", 
			"'print'", "'println'", "'length'", "'!'", "'readch'", "'readln'", "'@'", 
			null, null, null, null, null, "'int'", "'bool'", "'string'", null, null, 
			null, null, null, null, "'None'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "None", "INT_ARR_TYPE", 
			"BOOL_ARR_TYPE", "STR_ARR_TYPE", "REC_ARR_TYPE", "INT_TYPE", "BOOL_TYPE", 
			"STR_TYPE", "HIGHER_ARITH_OP", "ARITH_OP", "REL_OP", "EQ_OP", "COND_OP", 
			"BOOL", "NULL_VALUE", "IDENT", "STRING", "INTEGER", "NEWLINE", "WS", 
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
		public ProgramHeaderContext hdr;
		public GlobalDefinitionsContext globalDefinitions;
		public List<GlobalDefinitionsContext> defs = new ArrayList<GlobalDefinitionsContext>();
		public MainMethodContext main;
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
			setState(108);
			((ProgramContext)_localctx).hdr = programHeader();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 45632L) != 0)) {
				{
				{
				setState(109);
				((ProgramContext)_localctx).globalDefinitions = globalDefinitions();
				((ProgramContext)_localctx).defs.add(((ProgramContext)_localctx).globalDefinitions);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			((ProgramContext)_localctx).main = mainMethod();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 45632L) != 0)) {
				{
				{
				setState(116);
				((ProgramContext)_localctx).globalDefinitions = globalDefinitions();
				((ProgramContext)_localctx).defs.add(((ProgramContext)_localctx).globalDefinitions);
				}
				}
				setState(121);
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
		public IdentifierContext name;
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
			setState(122);
			match(T__0);
			setState(123);
			((ProgramHeaderContext)_localctx).name = identifier();
			setState(124);
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
		public MainArgContext args;
		public BlockStatementContext body;
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
			setState(126);
			match(T__2);
			setState(127);
			match(T__3);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(128);
				((MainMethodContext)_localctx).args = mainArg();
				}
			}

			setState(131);
			match(T__4);
			setState(132);
			((MainMethodContext)_localctx).body = blockStatement();
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
		public IdentifierContext name;
		public StringArrTypeContext stringArrType() {
			return getRuleContext(StringArrTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
			setState(134);
			((MainArgContext)_localctx).name = identifier();
			setState(135);
			match(T__1);
			setState(136);
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
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				nameDeclStatement();
				}
				break;
			case T__5:
			case T__12:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
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
		public FuncPrototypeContext proto;
		public BlockStatementContext body;
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
			setState(142);
			((FuncDefinitionContext)_localctx).proto = funcPrototype();
			setState(143);
			((FuncDefinitionContext)_localctx).body = blockStatement();
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
		public IdentifierContext name;
		public FuncArgListContext funcArgList;
		public List<FuncArgListContext> argList = new ArrayList<FuncArgListContext>();
		public ReturnTypeContext return_;
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
			setState(145);
			match(T__5);
			setState(146);
			((FuncPrototypeContext)_localctx).name = identifier();
			setState(147);
			match(T__3);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(148);
				((FuncPrototypeContext)_localctx).funcArgList = funcArgList();
				((FuncPrototypeContext)_localctx).argList.add(((FuncPrototypeContext)_localctx).funcArgList);
				}
			}

			setState(151);
			match(T__4);
			setState(152);
			match(T__6);
			setState(153);
			((FuncPrototypeContext)_localctx).return_ = returnType();
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
		public FuncArgumentContext funcArgument;
		public List<FuncArgumentContext> args = new ArrayList<FuncArgumentContext>();
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
			setState(155);
			((FuncArgListContext)_localctx).funcArgument = funcArgument();
			((FuncArgListContext)_localctx).args.add(((FuncArgListContext)_localctx).funcArgument);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(156);
				match(T__7);
				setState(157);
				((FuncArgListContext)_localctx).funcArgument = funcArgument();
				((FuncArgListContext)_localctx).args.add(((FuncArgListContext)_localctx).funcArgument);
				}
				}
				setState(162);
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
			setState(163);
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
		public TerminalNode None() { return getToken(JavanaParser.None, 0); }
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
			setState(167);
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
				setState(165);
				type();
				}
				break;
			case None:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(None);
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
		public IdentifierContext name;
		public TypeAssocContext typeAssoc;
		public List<TypeAssocContext> fields = new ArrayList<TypeAssocContext>();
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
			setState(169);
			match(T__8);
			setState(170);
			((RecordDeclContext)_localctx).name = identifier();
			setState(171);
			match(T__9);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(172);
				((RecordDeclContext)_localctx).typeAssoc = typeAssoc();
				((RecordDeclContext)_localctx).fields.add(((RecordDeclContext)_localctx).typeAssoc);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
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
		public TypeAssocContext assoc;
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
			setState(180);
			match(T__11);
			setState(181);
			((VariableDeclContext)_localctx).assoc = typeAssoc();
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
		public NameListContext namelst;
		public TypeContext t;
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
			setState(183);
			((TypeAssocContext)_localctx).namelst = nameList();
			setState(184);
			match(T__1);
			setState(185);
			((TypeAssocContext)_localctx).t = type();
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
		public NameListContext namelst;
		public ExpressionContext expr;
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
			setState(187);
			match(T__12);
			setState(188);
			((VariableDefContext)_localctx).namelst = nameList();
			setState(189);
			match(T__13);
			setState(190);
			((VariableDefContext)_localctx).expr = expression(0);
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
		public NameListContext namelst;
		public ExpressionContext expr;
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
			setState(192);
			match(T__14);
			setState(193);
			((ConstantDefContext)_localctx).namelst = nameList();
			setState(194);
			match(T__13);
			setState(195);
			((ConstantDefContext)_localctx).expr = expression(0);
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
		public IdentifierContext identifier;
		public List<IdentifierContext> names = new ArrayList<IdentifierContext>();
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
			setState(197);
			((NameListContext)_localctx).identifier = identifier();
			((NameListContext)_localctx).names.add(((NameListContext)_localctx).identifier);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(198);
				match(T__7);
				setState(199);
				((NameListContext)_localctx).identifier = identifier();
				((NameListContext)_localctx).names.add(((NameListContext)_localctx).identifier);
				}
				}
				setState(204);
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
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				blockStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				nameDeclStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				nameDeclDefStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				assignmentStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				whileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(212);
				expressionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(213);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(214);
				printStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(215);
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
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
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
			setState(218);
			match(T__9);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1020355240572496L) != 0)) {
				{
				{
				setState(219);
				((BlockStatementContext)_localctx).statement = statement();
				((BlockStatementContext)_localctx).stmts.add(((BlockStatementContext)_localctx).statement);
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
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
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				variableDecl();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
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
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				variableDef();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				constantDef();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
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
		public VariableContext var;
		public ExpressionContext expr;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			((AssignmentStatementContext)_localctx).var = variable();
			setState(237);
			match(T__13);
			setState(238);
			((AssignmentStatementContext)_localctx).expr = expression(0);
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
	public static class VariableContext extends ParserRuleContext {
		public IdentifierContext name;
		public VarModifierContext varModifier;
		public List<VarModifierContext> modifiers = new ArrayList<VarModifierContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VarModifierContext> varModifier() {
			return getRuleContexts(VarModifierContext.class);
		}
		public VarModifierContext varModifier(int i) {
			return getRuleContext(VarModifierContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			((VariableContext)_localctx).name = identifier();
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(241);
					((VariableContext)_localctx).varModifier = varModifier();
					((VariableContext)_localctx).modifiers.add(((VariableContext)_localctx).varModifier);
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class VarModifierContext extends ParserRuleContext {
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
	 
		public VarModifierContext() { }
		public void copyFrom(VarModifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarArrayIndexModfierContext extends VarModifierContext {
		public ArrIdxSpecifierContext arrIdxSpecifier() {
			return getRuleContext(ArrIdxSpecifierContext.class,0);
		}
		public VarArrayIndexModfierContext(VarModifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitVarArrayIndexModfier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarRecordFieldModifierContext extends VarModifierContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarRecordFieldModifierContext(VarModifierContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitVarRecordFieldModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varModifier);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new VarArrayIndexModfierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				arrIdxSpecifier();
				}
				break;
			case T__15:
				_localctx = new VarRecordFieldModifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__15);
				setState(249);
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
		public ExpressionContext expr;
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
		enterRule(_localctx, 46, RULE_arrIdxSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__16);
			setState(253);
			((ArrIdxSpecifierContext)_localctx).expr = expression(0);
			setState(254);
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
		public ExpressionContext condition;
		public BlockStatementContext thenStmt;
		public BlockStatementContext elseStmt;
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
		enterRule(_localctx, 48, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__18);
			setState(257);
			match(T__3);
			setState(258);
			((IfStatementContext)_localctx).condition = expression(0);
			setState(259);
			match(T__4);
			setState(260);
			((IfStatementContext)_localctx).thenStmt = blockStatement();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(261);
				match(T__19);
				setState(262);
				((IfStatementContext)_localctx).elseStmt = blockStatement();
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
		public VariableDefContext init;
		public ExpressionContext condition;
		public ExpressionContext updateExpr;
		public BlockStatementContext body;
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
		enterRule(_localctx, 50, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__20);
			setState(266);
			match(T__3);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(267);
				((ForStatementContext)_localctx).init = variableDef();
				}
			}

			setState(270);
			match(T__21);
			setState(271);
			((ForStatementContext)_localctx).condition = expression(0);
			setState(272);
			match(T__21);
			setState(273);
			((ForStatementContext)_localctx).updateExpr = expression(0);
			setState(274);
			match(T__4);
			setState(275);
			((ForStatementContext)_localctx).body = blockStatement();
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
		public ExpressionContext condition;
		public BlockStatementContext body;
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
		enterRule(_localctx, 52, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__22);
			setState(278);
			match(T__3);
			setState(279);
			((WhileStatementContext)_localctx).condition = expression(0);
			setState(280);
			match(T__4);
			setState(281);
			((WhileStatementContext)_localctx).body = blockStatement();
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
		public ExpressionContext expr;
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
		enterRule(_localctx, 54, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			((ExpressionStatementContext)_localctx).expr = expression(0);
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
		public ExpressionContext expr;
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
		enterRule(_localctx, 56, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__23);
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(286);
				((ReturnStatementContext)_localctx).expr = expression(0);
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
		public PrintArgumentContext arg;
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
		enterRule(_localctx, 58, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__24);
			setState(290);
			((PrintStatementContext)_localctx).arg = printArgument();
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
		public PrintArgumentContext arg;
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
		enterRule(_localctx, 60, RULE_printLineStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__25);
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(293);
				((PrintLineStatementContext)_localctx).arg = printArgument();
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
		public PrintArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArgument; }
	 
		public PrintArgumentContext() { }
		public void copyFrom(PrintArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintSingleValueContext extends PrintArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintSingleValueContext(PrintArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitPrintSingleValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormattedPrintContext extends PrintArgumentContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FormattedPrintContext(PrintArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitFormattedPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintArgumentContext printArgument() throws RecognitionException {
		PrintArgumentContext _localctx = new PrintArgumentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_printArgument);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new PrintSingleValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				expression(0);
				}
				break;
			case 2:
				_localctx = new FormattedPrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__3);
				setState(298);
				exprList();
				setState(299);
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
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprConditionalContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COND_OP() { return getToken(JavanaParser.COND_OP, 0); }
		public ExprConditionalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNewRecordContext extends ExpressionContext {
		public NewRecordContext newRecord() {
			return getRuleContext(NewRecordContext.class,0);
		}
		public ExprNewRecordContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprNewRecord(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRecordFieldContext extends ExpressionContext {
		public ExpressionContext expr;
		public IdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprRecordFieldContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprRecordField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNotContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprReadCharContext extends ExpressionContext {
		public ReadCharCallContext readCharCall() {
			return getRuleContext(ReadCharCallContext.class,0);
		}
		public ExprReadCharContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprReadChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprHigherArithContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode HIGHER_ARITH_OP() { return getToken(JavanaParser.HIGHER_ARITH_OP, 0); }
		public ExprHigherArithContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprHigherArith(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelationalContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode REL_OP() { return getToken(JavanaParser.REL_OP, 0); }
		public ExprRelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprReadLineContext extends ExpressionContext {
		public ReadLineCallContext readLineCall() {
			return getRuleContext(ReadLineCallContext.class,0);
		}
		public ExprReadLineContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprReadLine(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprArrayElementContext extends ExpressionContext {
		public ExpressionContext expr;
		public ArrIdxSpecifierContext arrIdx;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrIdxSpecifierContext arrIdxSpecifier() {
			return getRuleContext(ArrIdxSpecifierContext.class,0);
		}
		public ExprArrayElementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFunctionCallContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprArrayLengthContext extends ExpressionContext {
		public ExpressionContext expr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprArrayLengthContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprArrayLength(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprGroupContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprGroupContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNewArrayContext extends ExpressionContext {
		public NewArrayContext newArray() {
			return getRuleContext(NewArrayContext.class,0);
		}
		public ExprNewArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprNewArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLiteralContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExprLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprArithContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ARITH_OP() { return getToken(JavanaParser.ARITH_OP, 0); }
		public ExprArithContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprArith(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprEqualityContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Token op;
		public ExpressionContext rhs;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ_OP() { return getToken(JavanaParser.EQ_OP, 0); }
		public ExprEqualityContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprVariableContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprVariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitExprVariable(this);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(304);
				match(T__27);
				setState(305);
				expression(9);
				}
				break;
			case 2:
				{
				_localctx = new ExprGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(T__3);
				setState(307);
				expression(0);
				setState(308);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new ExprReadCharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				readCharCall();
				}
				break;
			case 4:
				{
				_localctx = new ExprReadLineContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311);
				readLineCall();
				}
				break;
			case 5:
				{
				_localctx = new ExprFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312);
				functionCall();
				}
				break;
			case 6:
				{
				_localctx = new ExprVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				variable();
				}
				break;
			case 7:
				{
				_localctx = new ExprLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				literal();
				}
				break;
			case 8:
				{
				_localctx = new ExprNewArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				newArray();
				}
				break;
			case 9:
				{
				_localctx = new ExprNewRecordContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				newRecord();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprHigherArithContext(new ExpressionContext(_parentctx, _parentState));
						((ExprHigherArithContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(320);
						((ExprHigherArithContext)_localctx).op = match(HIGHER_ARITH_OP);
						setState(321);
						((ExprHigherArithContext)_localctx).rhs = expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprArithContext(new ExpressionContext(_parentctx, _parentState));
						((ExprArithContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(323);
						((ExprArithContext)_localctx).op = match(ARITH_OP);
						setState(324);
						((ExprArithContext)_localctx).rhs = expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelationalContext(new ExpressionContext(_parentctx, _parentState));
						((ExprRelationalContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(326);
						((ExprRelationalContext)_localctx).op = match(REL_OP);
						setState(327);
						((ExprRelationalContext)_localctx).rhs = expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprEqualityContext(new ExpressionContext(_parentctx, _parentState));
						((ExprEqualityContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(328);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(329);
						((ExprEqualityContext)_localctx).op = match(EQ_OP);
						setState(330);
						((ExprEqualityContext)_localctx).rhs = expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprConditionalContext(new ExpressionContext(_parentctx, _parentState));
						((ExprConditionalContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(331);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(332);
						((ExprConditionalContext)_localctx).op = match(COND_OP);
						setState(333);
						((ExprConditionalContext)_localctx).rhs = expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprArrayElementContext(new ExpressionContext(_parentctx, _parentState));
						((ExprArrayElementContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(335);
						((ExprArrayElementContext)_localctx).arrIdx = arrIdxSpecifier();
						}
						break;
					case 7:
						{
						_localctx = new ExprArrayLengthContext(new ExpressionContext(_parentctx, _parentState));
						((ExprArrayLengthContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(336);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(337);
						match(T__15);
						setState(338);
						match(T__26);
						}
						break;
					case 8:
						{
						_localctx = new ExprRecordFieldContext(new ExpressionContext(_parentctx, _parentState));
						((ExprRecordFieldContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(340);
						match(T__15);
						setState(341);
						((ExprRecordFieldContext)_localctx).name = identifier();
						}
						break;
					}
					} 
				}
				setState(346);
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
		public ExpressionContext expression;
		public List<ExpressionContext> exprs = new ArrayList<ExpressionContext>();
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
		enterRule(_localctx, 66, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			((ExprListContext)_localctx).expression = expression(0);
			((ExprListContext)_localctx).exprs.add(((ExprListContext)_localctx).expression);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(348);
				match(T__7);
				setState(349);
				((ExprListContext)_localctx).expression = expression(0);
				((ExprListContext)_localctx).exprs.add(((ExprListContext)_localctx).expression);
				}
				}
				setState(354);
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
		enterRule(_localctx, 68, RULE_readCharCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__28);
			setState(356);
			match(T__3);
			setState(357);
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
		enterRule(_localctx, 70, RULE_readLineCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__29);
			setState(360);
			match(T__3);
			setState(361);
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
		public IdentifierContext name;
		public ExprListContext args;
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
		enterRule(_localctx, 72, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			((FunctionCallContext)_localctx).name = identifier();
			setState(364);
			match(T__3);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1020355112075280L) != 0)) {
				{
				setState(365);
				((FunctionCallContext)_localctx).args = exprList();
				}
			}

			setState(368);
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
		enterRule(_localctx, 74, RULE_newArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__30);
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case BOOL_TYPE:
			case STR_TYPE:
				{
				setState(371);
				scalarType();
				}
				break;
			case IDENT:
				{
				setState(372);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(375);
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
		public FieldInitListContext init;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FieldInitListContext fieldInitList() {
			return getRuleContext(FieldInitListContext.class,0);
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
		enterRule(_localctx, 76, RULE_newRecord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__30);
			setState(378);
			identifier();
			setState(379);
			match(T__9);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(380);
				((NewRecordContext)_localctx).init = fieldInitList();
				}
			}

			setState(383);
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
	public static class FieldInitListContext extends ParserRuleContext {
		public FieldInitContext fieldInit;
		public List<FieldInitContext> init = new ArrayList<FieldInitContext>();
		public List<FieldInitContext> fieldInit() {
			return getRuleContexts(FieldInitContext.class);
		}
		public FieldInitContext fieldInit(int i) {
			return getRuleContext(FieldInitContext.class,i);
		}
		public FieldInitListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldInitList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitFieldInitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldInitListContext fieldInitList() throws RecognitionException {
		FieldInitListContext _localctx = new FieldInitListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_fieldInitList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			((FieldInitListContext)_localctx).fieldInit = fieldInit();
			((FieldInitListContext)_localctx).init.add(((FieldInitListContext)_localctx).fieldInit);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(386);
				match(T__7);
				setState(387);
				((FieldInitListContext)_localctx).fieldInit = fieldInit();
				((FieldInitListContext)_localctx).init.add(((FieldInitListContext)_localctx).fieldInit);
				}
				}
				setState(392);
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
	public static class FieldInitContext extends ParserRuleContext {
		public IdentifierContext field;
		public ExpressionContext expr;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FieldInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitFieldInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldInitContext fieldInit() throws RecognitionException {
		FieldInitContext _localctx = new FieldInitContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fieldInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			((FieldInitContext)_localctx).field = identifier();
			setState(394);
			match(T__13);
			setState(395);
			((FieldInitContext)_localctx).expr = expression(0);
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
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(JavanaParser.STRING, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneValueContext extends LiteralContext {
		public TerminalNode None() { return getToken(JavanaParser.None, 0); }
		public NoneValueContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitNoneValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends LiteralContext {
		public TerminalNode BOOL() { return getToken(JavanaParser.BOOL, 0); }
		public BooleanLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends LiteralContext {
		public TerminalNode INTEGER() { return getToken(JavanaParser.INTEGER, 0); }
		public IntegerLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_literal);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(INTEGER);
				}
				break;
			case BOOL:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(BOOL);
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(STRING);
				}
				break;
			case None:
				_localctx = new NoneValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				match(None);
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeScalarContext extends TypeContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public TypeScalarContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitTypeScalar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCompositeContext extends TypeContext {
		public CompositeTypeContext compositeType() {
			return getRuleContext(CompositeTypeContext.class,0);
		}
		public TypeCompositeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavanaVisitor ) return ((JavanaVisitor<? extends T>)visitor).visitTypeComposite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_type);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case BOOL_TYPE:
			case STR_TYPE:
				_localctx = new TypeScalarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				scalarType();
				}
				break;
			case INT_ARR_TYPE:
			case BOOL_ARR_TYPE:
			case STR_ARR_TYPE:
			case REC_ARR_TYPE:
			case IDENT:
				_localctx = new TypeCompositeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
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
		enterRule(_localctx, 86, RULE_scalarType);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				integerType();
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				booleanType();
				}
				break;
			case STR_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
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
		enterRule(_localctx, 88, RULE_compositeType);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				recordType();
				}
				break;
			case INT_ARR_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				integerArrType();
				}
				break;
			case BOOL_ARR_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				booleanArrType();
				}
				break;
			case STR_ARR_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				stringArrType();
				}
				break;
			case REC_ARR_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(416);
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
		enterRule(_localctx, 90, RULE_integerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
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
		enterRule(_localctx, 92, RULE_booleanType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
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
		enterRule(_localctx, 94, RULE_stringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
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
		enterRule(_localctx, 96, RULE_recordType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
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
		enterRule(_localctx, 98, RULE_integerArrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		enterRule(_localctx, 100, RULE_booleanArrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		enterRule(_localctx, 102, RULE_stringArrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		enterRule(_localctx, 104, RULE_recordArrType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		enterRule(_localctx, 106, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		case 32:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u01b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u0001\u0000\u0001\u0000"+
		"\u0005\u0000o\b\u0000\n\u0000\f\u0000r\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000v\b\u0000\n\u0000\f\u0000y\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0082\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u008d\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0096\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u009f\b\u0007"+
		"\n\u0007\f\u0007\u00a2\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t"+
		"\u00a8\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ae\b\n\n\n\f\n\u00b1"+
		"\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00c9\b\u000f\n\u000f\f\u000f\u00cc\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d9"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u00dd\b\u0011\n\u0011\f\u0011"+
		"\u00e0\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00e6\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00eb\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u00f3\b\u0015\n\u0015\f\u0015\u00f6\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u00fb\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0108\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u010d\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u0120\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0127\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u012e\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u013e\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0005 \u0157\b \n \f \u015a\t \u0001!\u0001!\u0001!\u0005!\u015f"+
		"\b!\n!\f!\u0162\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0003$\u016f\b$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0003%\u0176\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u017e\b&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0005\'\u0185\b\'\n\'"+
		"\f\'\u0188\t\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u0192\b)\u0001*\u0001*\u0003*\u0196\b*\u0001+\u0001+\u0001+\u0003"+
		"+\u019b\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u01a2\b,\u0001-\u0001"+
		"-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u00011\u00012\u0001"+
		"2\u00013\u00013\u00014\u00014\u00015\u00015\u00015\u0000\u0001@6\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhj\u0000\u0000\u01bc\u0000"+
		"l\u0001\u0000\u0000\u0000\u0002z\u0001\u0000\u0000\u0000\u0004~\u0001"+
		"\u0000\u0000\u0000\u0006\u0086\u0001\u0000\u0000\u0000\b\u008c\u0001\u0000"+
		"\u0000\u0000\n\u008e\u0001\u0000\u0000\u0000\f\u0091\u0001\u0000\u0000"+
		"\u0000\u000e\u009b\u0001\u0000\u0000\u0000\u0010\u00a3\u0001\u0000\u0000"+
		"\u0000\u0012\u00a7\u0001\u0000\u0000\u0000\u0014\u00a9\u0001\u0000\u0000"+
		"\u0000\u0016\u00b4\u0001\u0000\u0000\u0000\u0018\u00b7\u0001\u0000\u0000"+
		"\u0000\u001a\u00bb\u0001\u0000\u0000\u0000\u001c\u00c0\u0001\u0000\u0000"+
		"\u0000\u001e\u00c5\u0001\u0000\u0000\u0000 \u00d8\u0001\u0000\u0000\u0000"+
		"\"\u00da\u0001\u0000\u0000\u0000$\u00e5\u0001\u0000\u0000\u0000&\u00ea"+
		"\u0001\u0000\u0000\u0000(\u00ec\u0001\u0000\u0000\u0000*\u00f0\u0001\u0000"+
		"\u0000\u0000,\u00fa\u0001\u0000\u0000\u0000.\u00fc\u0001\u0000\u0000\u0000"+
		"0\u0100\u0001\u0000\u0000\u00002\u0109\u0001\u0000\u0000\u00004\u0115"+
		"\u0001\u0000\u0000\u00006\u011b\u0001\u0000\u0000\u00008\u011d\u0001\u0000"+
		"\u0000\u0000:\u0121\u0001\u0000\u0000\u0000<\u0124\u0001\u0000\u0000\u0000"+
		">\u012d\u0001\u0000\u0000\u0000@\u013d\u0001\u0000\u0000\u0000B\u015b"+
		"\u0001\u0000\u0000\u0000D\u0163\u0001\u0000\u0000\u0000F\u0167\u0001\u0000"+
		"\u0000\u0000H\u016b\u0001\u0000\u0000\u0000J\u0172\u0001\u0000\u0000\u0000"+
		"L\u0179\u0001\u0000\u0000\u0000N\u0181\u0001\u0000\u0000\u0000P\u0189"+
		"\u0001\u0000\u0000\u0000R\u0191\u0001\u0000\u0000\u0000T\u0195\u0001\u0000"+
		"\u0000\u0000V\u019a\u0001\u0000\u0000\u0000X\u01a1\u0001\u0000\u0000\u0000"+
		"Z\u01a3\u0001\u0000\u0000\u0000\\\u01a5\u0001\u0000\u0000\u0000^\u01a7"+
		"\u0001\u0000\u0000\u0000`\u01a9\u0001\u0000\u0000\u0000b\u01ab\u0001\u0000"+
		"\u0000\u0000d\u01ad\u0001\u0000\u0000\u0000f\u01af\u0001\u0000\u0000\u0000"+
		"h\u01b1\u0001\u0000\u0000\u0000j\u01b3\u0001\u0000\u0000\u0000lp\u0003"+
		"\u0002\u0001\u0000mo\u0003\b\u0004\u0000nm\u0001\u0000\u0000\u0000or\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000sw\u0003\u0004\u0002"+
		"\u0000tv\u0003\b\u0004\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0001\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\u0001\u0000\u0000"+
		"{|\u0003j5\u0000|}\u0005\u0002\u0000\u0000}\u0003\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\u0003\u0000\u0000\u007f\u0081\u0005\u0004\u0000\u0000\u0080"+
		"\u0082\u0003\u0006\u0003\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005\u0005\u0000\u0000\u0084\u0085\u0003\"\u0011\u0000\u0085\u0005"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0003j5\u0000\u0087\u0088\u0005\u0002"+
		"\u0000\u0000\u0088\u0089\u0003f3\u0000\u0089\u0007\u0001\u0000\u0000\u0000"+
		"\u008a\u008d\u0003$\u0012\u0000\u008b\u008d\u0003&\u0013\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\t\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0003\f\u0006\u0000\u008f\u0090\u0003\""+
		"\u0011\u0000\u0090\u000b\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0006"+
		"\u0000\u0000\u0092\u0093\u0003j5\u0000\u0093\u0095\u0005\u0004\u0000\u0000"+
		"\u0094\u0096\u0003\u000e\u0007\u0000\u0095\u0094\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005\u0005\u0000\u0000\u0098\u0099\u0005\u0007\u0000\u0000"+
		"\u0099\u009a\u0003\u0012\t\u0000\u009a\r\u0001\u0000\u0000\u0000\u009b"+
		"\u00a0\u0003\u0010\b\u0000\u009c\u009d\u0005\b\u0000\u0000\u009d\u009f"+
		"\u0003\u0010\b\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u000f\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0003\u0018\f\u0000\u00a4\u0011\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a8\u0003T*\u0000\u00a6\u00a8\u0005 \u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u0013\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\t\u0000\u0000\u00aa"+
		"\u00ab\u0003j5\u0000\u00ab\u00af\u0005\n\u0000\u0000\u00ac\u00ae\u0003"+
		"\u0018\f\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005\u000b\u0000\u0000\u00b3\u0015\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0005\f\u0000\u0000\u00b5\u00b6\u0003\u0018\f"+
		"\u0000\u00b6\u0017\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u001e\u000f"+
		"\u0000\u00b8\u00b9\u0005\u0002\u0000\u0000\u00b9\u00ba\u0003T*\u0000\u00ba"+
		"\u0019\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\r\u0000\u0000\u00bc\u00bd"+
		"\u0003\u001e\u000f\u0000\u00bd\u00be\u0005\u000e\u0000\u0000\u00be\u00bf"+
		"\u0003@ \u0000\u00bf\u001b\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u000f"+
		"\u0000\u0000\u00c1\u00c2\u0003\u001e\u000f\u0000\u00c2\u00c3\u0005\u000e"+
		"\u0000\u0000\u00c3\u00c4\u0003@ \u0000\u00c4\u001d\u0001\u0000\u0000\u0000"+
		"\u00c5\u00ca\u0003j5\u0000\u00c6\u00c7\u0005\b\u0000\u0000\u00c7\u00c9"+
		"\u0003j5\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u001f\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d9\u0003\"\u0011\u0000\u00ce\u00d9\u0003$\u0012"+
		"\u0000\u00cf\u00d9\u0003&\u0013\u0000\u00d0\u00d9\u0003(\u0014\u0000\u00d1"+
		"\u00d9\u00030\u0018\u0000\u00d2\u00d9\u00032\u0019\u0000\u00d3\u00d9\u0003"+
		"4\u001a\u0000\u00d4\u00d9\u00036\u001b\u0000\u00d5\u00d9\u00038\u001c"+
		"\u0000\u00d6\u00d9\u0003:\u001d\u0000\u00d7\u00d9\u0003<\u001e\u0000\u00d8"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d8\u00ce\u0001\u0000\u0000\u0000\u00d8"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d8\u00d0\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d8\u00d2\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9!\u0001\u0000\u0000\u0000\u00da\u00de"+
		"\u0005\n\u0000\u0000\u00db\u00dd\u0003 \u0010\u0000\u00dc\u00db\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"\u000b\u0000\u0000\u00e2#\u0001\u0000\u0000\u0000\u00e3\u00e6\u0003\u0016"+
		"\u000b\u0000\u00e4\u00e6\u0003\u0014\n\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6%\u0001\u0000\u0000\u0000"+
		"\u00e7\u00eb\u0003\u001a\r\u0000\u00e8\u00eb\u0003\u001c\u000e\u0000\u00e9"+
		"\u00eb\u0003\n\u0005\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00ea\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\'\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0003*\u0015\u0000\u00ed\u00ee\u0005\u000e"+
		"\u0000\u0000\u00ee\u00ef\u0003@ \u0000\u00ef)\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f4\u0003j5\u0000\u00f1\u00f3\u0003,\u0016\u0000\u00f2\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5+\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00fb\u0003"+
		".\u0017\u0000\u00f8\u00f9\u0005\u0010\u0000\u0000\u00f9\u00fb\u0003j5"+
		"\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fb-\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0011\u0000\u0000"+
		"\u00fd\u00fe\u0003@ \u0000\u00fe\u00ff\u0005\u0012\u0000\u0000\u00ff/"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0013\u0000\u0000\u0101\u0102"+
		"\u0005\u0004\u0000\u0000\u0102\u0103\u0003@ \u0000\u0103\u0104\u0005\u0005"+
		"\u0000\u0000\u0104\u0107\u0003\"\u0011\u0000\u0105\u0106\u0005\u0014\u0000"+
		"\u0000\u0106\u0108\u0003\"\u0011\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u01081\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0005\u0015\u0000\u0000\u010a\u010c\u0005\u0004\u0000\u0000\u010b"+
		"\u010d\u0003\u001a\r\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0005\u0016\u0000\u0000\u010f\u0110\u0003@ \u0000\u0110\u0111\u0005\u0016"+
		"\u0000\u0000\u0111\u0112\u0003@ \u0000\u0112\u0113\u0005\u0005\u0000\u0000"+
		"\u0113\u0114\u0003\"\u0011\u0000\u01143\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0005\u0017\u0000\u0000\u0116\u0117\u0005\u0004\u0000\u0000\u0117"+
		"\u0118\u0003@ \u0000\u0118\u0119\u0005\u0005\u0000\u0000\u0119\u011a\u0003"+
		"\"\u0011\u0000\u011a5\u0001\u0000\u0000\u0000\u011b\u011c\u0003@ \u0000"+
		"\u011c7\u0001\u0000\u0000\u0000\u011d\u011f\u0005\u0018\u0000\u0000\u011e"+
		"\u0120\u0003@ \u0000\u011f\u011e\u0001\u0000\u0000\u0000\u011f\u0120\u0001"+
		"\u0000\u0000\u0000\u01209\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0019"+
		"\u0000\u0000\u0122\u0123\u0003>\u001f\u0000\u0123;\u0001\u0000\u0000\u0000"+
		"\u0124\u0126\u0005\u001a\u0000\u0000\u0125\u0127\u0003>\u001f\u0000\u0126"+
		"\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"=\u0001\u0000\u0000\u0000\u0128\u012e\u0003@ \u0000\u0129\u012a\u0005"+
		"\u0004\u0000\u0000\u012a\u012b\u0003B!\u0000\u012b\u012c\u0005\u0005\u0000"+
		"\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u0128\u0001\u0000\u0000"+
		"\u0000\u012d\u0129\u0001\u0000\u0000\u0000\u012e?\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0006 \uffff\uffff\u0000\u0130\u0131\u0005\u001c\u0000\u0000"+
		"\u0131\u013e\u0003@ \t\u0132\u0133\u0005\u0004\u0000\u0000\u0133\u0134"+
		"\u0003@ \u0000\u0134\u0135\u0005\u0005\u0000\u0000\u0135\u013e\u0001\u0000"+
		"\u0000\u0000\u0136\u013e\u0003D\"\u0000\u0137\u013e\u0003F#\u0000\u0138"+
		"\u013e\u0003H$\u0000\u0139\u013e\u0003*\u0015\u0000\u013a\u013e\u0003"+
		"R)\u0000\u013b\u013e\u0003J%\u0000\u013c\u013e\u0003L&\u0000\u013d\u012f"+
		"\u0001\u0000\u0000\u0000\u013d\u0132\u0001\u0000\u0000\u0000\u013d\u0136"+
		"\u0001\u0000\u0000\u0000\u013d\u0137\u0001\u0000\u0000\u0000\u013d\u0138"+
		"\u0001\u0000\u0000\u0000\u013d\u0139\u0001\u0000\u0000\u0000\u013d\u013a"+
		"\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013c"+
		"\u0001\u0000\u0000\u0000\u013e\u0158\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\n\u000e\u0000\u0000\u0140\u0141\u0005(\u0000\u0000\u0141\u0157\u0003"+
		"@ \u000f\u0142\u0143\n\r\u0000\u0000\u0143\u0144\u0005)\u0000\u0000\u0144"+
		"\u0157\u0003@ \u000e\u0145\u0146\n\f\u0000\u0000\u0146\u0147\u0005*\u0000"+
		"\u0000\u0147\u0157\u0003@ \r\u0148\u0149\n\u000b\u0000\u0000\u0149\u014a"+
		"\u0005+\u0000\u0000\u014a\u0157\u0003@ \f\u014b\u014c\n\n\u0000\u0000"+
		"\u014c\u014d\u0005,\u0000\u0000\u014d\u0157\u0003@ \u000b\u014e\u014f"+
		"\n\u0011\u0000\u0000\u014f\u0157\u0003.\u0017\u0000\u0150\u0151\n\u0010"+
		"\u0000\u0000\u0151\u0152\u0005\u0010\u0000\u0000\u0152\u0157\u0005\u001b"+
		"\u0000\u0000\u0153\u0154\n\u000f\u0000\u0000\u0154\u0155\u0005\u0010\u0000"+
		"\u0000\u0155\u0157\u0003j5\u0000\u0156\u013f\u0001\u0000\u0000\u0000\u0156"+
		"\u0142\u0001\u0000\u0000\u0000\u0156\u0145\u0001\u0000\u0000\u0000\u0156"+
		"\u0148\u0001\u0000\u0000\u0000\u0156\u014b\u0001\u0000\u0000\u0000\u0156"+
		"\u014e\u0001\u0000\u0000\u0000\u0156\u0150\u0001\u0000\u0000\u0000\u0156"+
		"\u0153\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158"+
		"\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"A\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u0160"+
		"\u0003@ \u0000\u015c\u015d\u0005\b\u0000\u0000\u015d\u015f\u0003@ \u0000"+
		"\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000"+
		"\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u0161C\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0005\u001d\u0000\u0000\u0164\u0165\u0005\u0004\u0000\u0000\u0165"+
		"\u0166\u0005\u0005\u0000\u0000\u0166E\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0005\u001e\u0000\u0000\u0168\u0169\u0005\u0004\u0000\u0000\u0169\u016a"+
		"\u0005\u0005\u0000\u0000\u016aG\u0001\u0000\u0000\u0000\u016b\u016c\u0003"+
		"j5\u0000\u016c\u016e\u0005\u0004\u0000\u0000\u016d\u016f\u0003B!\u0000"+
		"\u016e\u016d\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000"+
		"\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0005\u0005\u0000\u0000"+
		"\u0171I\u0001\u0000\u0000\u0000\u0172\u0175\u0005\u001f\u0000\u0000\u0173"+
		"\u0176\u0003V+\u0000\u0174\u0176\u0003j5\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0003.\u0017\u0000\u0178K\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0005\u001f\u0000\u0000\u017a\u017b\u0003j5\u0000\u017b\u017d"+
		"\u0005\n\u0000\u0000\u017c\u017e\u0003N\'\u0000\u017d\u017c\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0005\u000b\u0000\u0000\u0180M\u0001\u0000\u0000"+
		"\u0000\u0181\u0186\u0003P(\u0000\u0182\u0183\u0005\b\u0000\u0000\u0183"+
		"\u0185\u0003P(\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0188\u0001"+
		"\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187O\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0003j5\u0000\u018a\u018b\u0005\u000e\u0000\u0000"+
		"\u018b\u018c\u0003@ \u0000\u018cQ\u0001\u0000\u0000\u0000\u018d\u0192"+
		"\u00051\u0000\u0000\u018e\u0192\u0005-\u0000\u0000\u018f\u0192\u00050"+
		"\u0000\u0000\u0190\u0192\u0005 \u0000\u0000\u0191\u018d\u0001\u0000\u0000"+
		"\u0000\u0191\u018e\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000"+
		"\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0192S\u0001\u0000\u0000\u0000"+
		"\u0193\u0196\u0003V+\u0000\u0194\u0196\u0003X,\u0000\u0195\u0193\u0001"+
		"\u0000\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196U\u0001\u0000"+
		"\u0000\u0000\u0197\u019b\u0003Z-\u0000\u0198\u019b\u0003\\.\u0000\u0199"+
		"\u019b\u0003^/\u0000\u019a\u0197\u0001\u0000\u0000\u0000\u019a\u0198\u0001"+
		"\u0000\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019bW\u0001\u0000"+
		"\u0000\u0000\u019c\u01a2\u0003`0\u0000\u019d\u01a2\u0003b1\u0000\u019e"+
		"\u01a2\u0003d2\u0000\u019f\u01a2\u0003f3\u0000\u01a0\u01a2\u0003h4\u0000"+
		"\u01a1\u019c\u0001\u0000\u0000\u0000\u01a1\u019d\u0001\u0000\u0000\u0000"+
		"\u01a1\u019e\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2Y\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a4\u0005%\u0000\u0000\u01a4[\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005"+
		"&\u0000\u0000\u01a6]\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\'\u0000"+
		"\u0000\u01a8_\u0001\u0000\u0000\u0000\u01a9\u01aa\u0003j5\u0000\u01aa"+
		"a\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005!\u0000\u0000\u01acc\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u0005\"\u0000\u0000\u01aee\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0005#\u0000\u0000\u01b0g\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0005$\u0000\u0000\u01b2i\u0001\u0000\u0000\u0000\u01b3\u01b4"+
		"\u0005/\u0000\u0000\u01b4k\u0001\u0000\u0000\u0000 pw\u0081\u008c\u0095"+
		"\u00a0\u00a7\u00af\u00ca\u00d8\u00de\u00e5\u00ea\u00f4\u00fa\u0107\u010c"+
		"\u011f\u0126\u012d\u013d\u0156\u0158\u0160\u016e\u0175\u017d\u0186\u0191"+
		"\u0195\u019a\u01a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}