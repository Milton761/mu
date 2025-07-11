// Generated from D:/Github/mu/src/grammar/dohko_v1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class dohko_v1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, IDENTIFIER=16, 
		STRING=17, NUMBER=18, BOOLEAN=19, COLOR=20, DIMENSION=21, ACTION=22, WS=23, 
		COMMENT=24, BLOCK_COMMENT=25;
	public static final int
		RULE_root = 0, RULE_layout = 1, RULE_box = 2, RULE_column = 3, RULE_attributeList = 4, 
		RULE_contentList = 5, RULE_contentItem = 6, RULE_composable = 7, RULE_materialComponent = 8, 
		RULE_componentName = 9, RULE_attribute = 10, RULE_value = 11, RULE_templateExpression = 12, 
		RULE_array = 13, RULE_arrayElements = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "layout", "box", "column", "attributeList", "contentList", "contentItem", 
			"composable", "materialComponent", "componentName", "attribute", "value", 
			"templateExpression", "array", "arrayElements"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Box'", "'('", "')'", "'{'", "'}'", "'Column'", "'Text'", "'Image'", 
			"'Button'", "':'", "','", "'${'", "'.'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "IDENTIFIER", "STRING", "NUMBER", "BOOLEAN", 
			"COLOR", "DIMENSION", "ACTION", "WS", "COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "dohko_v1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dohko_v1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ComposableContext composable() {
			return getRuleContext(ComposableContext.class,0);
		}
		public LayoutContext layout() {
			return getRuleContext(LayoutContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				composable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				layout();
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
	public static class LayoutContext extends ParserRuleContext {
		public BoxContext box() {
			return getRuleContext(BoxContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public LayoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterLayout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitLayout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitLayout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutContext layout() throws RecognitionException {
		LayoutContext _localctx = new LayoutContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_layout);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				box();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				column();
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
	public static class BoxContext extends ParserRuleContext {
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public ContentListContext contentList() {
			return getRuleContext(ContentListContext.class,0);
		}
		public BoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_box; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitBox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitBox(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxContext box() throws RecognitionException {
		BoxContext _localctx = new BoxContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_box);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			match(T__1);
			setState(40);
			attributeList();
			setState(41);
			match(T__2);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(42);
				match(T__3);
				setState(43);
				contentList();
				setState(44);
				match(T__4);
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
	public static class ColumnContext extends ParserRuleContext {
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public ContentListContext contentList() {
			return getRuleContext(ContentListContext.class,0);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__5);
			setState(49);
			match(T__1);
			setState(50);
			attributeList();
			setState(51);
			match(T__2);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(52);
				match(T__3);
				setState(53);
				contentList();
				setState(54);
				match(T__4);
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
	public static class AttributeListContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attributeList);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				attribute();
				setState(60);
				attributeList();
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
	public static class ContentListContext extends ParserRuleContext {
		public ContentItemContext contentItem() {
			return getRuleContext(ContentItemContext.class,0);
		}
		public ContentListContext contentList() {
			return getRuleContext(ContentListContext.class,0);
		}
		public ContentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterContentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitContentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitContentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentListContext contentList() throws RecognitionException {
		ContentListContext _localctx = new ContentListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_contentList);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__0:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				contentItem();
				setState(66);
				contentList();
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
	public static class ContentItemContext extends ParserRuleContext {
		public ComposableContext composable() {
			return getRuleContext(ComposableContext.class,0);
		}
		public ContentItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterContentItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitContentItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitContentItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentItemContext contentItem() throws RecognitionException {
		ContentItemContext _localctx = new ContentItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contentItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			composable();
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
	public static class ComposableContext extends ParserRuleContext {
		public MaterialComponentContext materialComponent() {
			return getRuleContext(MaterialComponentContext.class,0);
		}
		public LayoutContext layout() {
			return getRuleContext(LayoutContext.class,0);
		}
		public ComposableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterComposable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitComposable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitComposable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComposableContext composable() throws RecognitionException {
		ComposableContext _localctx = new ComposableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_composable);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				materialComponent();
				}
				break;
			case T__0:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				layout();
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
	public static class MaterialComponentContext extends ParserRuleContext {
		public ComponentNameContext componentName() {
			return getRuleContext(ComponentNameContext.class,0);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public ContentListContext contentList() {
			return getRuleContext(ContentListContext.class,0);
		}
		public MaterialComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterMaterialComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitMaterialComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitMaterialComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialComponentContext materialComponent() throws RecognitionException {
		MaterialComponentContext _localctx = new MaterialComponentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_materialComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			componentName();
			setState(77);
			match(T__1);
			setState(78);
			attributeList();
			setState(79);
			match(T__2);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(80);
				match(T__3);
				setState(81);
				contentList();
				setState(82);
				match(T__4);
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
	public static class ComponentNameContext extends ParserRuleContext {
		public ComponentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterComponentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitComponentName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitComponentName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentNameContext componentName() throws RecognitionException {
		ComponentNameContext _localctx = new ComponentNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_componentName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(dohko_v1Parser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IDENTIFIER);
			setState(89);
			match(T__9);
			setState(90);
			value();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(91);
				match(T__10);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(dohko_v1Parser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(dohko_v1Parser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(dohko_v1Parser.BOOLEAN, 0); }
		public TerminalNode COLOR() { return getToken(dohko_v1Parser.COLOR, 0); }
		public TerminalNode DIMENSION() { return getToken(dohko_v1Parser.DIMENSION, 0); }
		public TerminalNode ACTION() { return getToken(dohko_v1Parser.ACTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(dohko_v1Parser.IDENTIFIER, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TemplateExpressionContext templateExpression() {
			return getRuleContext(TemplateExpressionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(BOOLEAN);
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(COLOR);
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				match(DIMENSION);
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				match(ACTION);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				match(IDENTIFIER);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(101);
				array();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 9);
				{
				setState(102);
				templateExpression();
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
	public static class TemplateExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(dohko_v1Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(dohko_v1Parser.IDENTIFIER, i);
		}
		public TemplateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterTemplateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitTemplateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitTemplateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateExpressionContext templateExpression() throws RecognitionException {
		TemplateExpressionContext _localctx = new TemplateExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_templateExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__11);
			setState(106);
			match(IDENTIFIER);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(107);
				match(T__12);
				setState(108);
				match(IDENTIFIER);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
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
	public static class ArrayContext extends ParserRuleContext {
		public ArrayElementsContext arrayElements() {
			return getRuleContext(ArrayElementsContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__13);
			setState(117);
			arrayElements();
			setState(118);
			match(T__14);
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
	public static class ArrayElementsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).enterArrayElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dohko_v1Listener ) ((dohko_v1Listener)listener).exitArrayElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dohko_v1Visitor ) return ((dohko_v1Visitor<? extends T>)visitor).visitArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementsContext arrayElements() throws RecognitionException {
		ArrayElementsContext _localctx = new ArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayElements);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__11:
			case T__13:
			case IDENTIFIER:
			case STRING:
			case NUMBER:
			case BOOLEAN:
			case COLOR:
			case DIMENSION:
			case ACTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				value();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(122);
					match(T__10);
					setState(123);
					value();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u0084\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0003\u0000!\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001%\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u00039\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004?\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005E\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007K\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\bU\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n]\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"h\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\fn\b\f\n\f\f\fq\t\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e}\b\u000e\n\u000e\f\u000e\u0080\t\u000e"+
		"\u0003\u000e\u0082\b\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0001"+
		"\u0001\u0000\u0007\t\u0088\u0000 \u0001\u0000\u0000\u0000\u0002$\u0001"+
		"\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000"+
		"\u0000\b>\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000\fF\u0001"+
		"\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010L\u0001\u0000\u0000"+
		"\u0000\u0012V\u0001\u0000\u0000\u0000\u0014X\u0001\u0000\u0000\u0000\u0016"+
		"g\u0001\u0000\u0000\u0000\u0018i\u0001\u0000\u0000\u0000\u001at\u0001"+
		"\u0000\u0000\u0000\u001c\u0081\u0001\u0000\u0000\u0000\u001e!\u0003\u000e"+
		"\u0007\u0000\u001f!\u0003\u0002\u0001\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" \u001f\u0001\u0000\u0000\u0000!\u0001\u0001\u0000\u0000\u0000\"%\u0003"+
		"\u0004\u0002\u0000#%\u0003\u0006\u0003\u0000$\"\u0001\u0000\u0000\u0000"+
		"$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0005\u0001"+
		"\u0000\u0000\'(\u0005\u0002\u0000\u0000()\u0003\b\u0004\u0000).\u0005"+
		"\u0003\u0000\u0000*+\u0005\u0004\u0000\u0000+,\u0003\n\u0005\u0000,-\u0005"+
		"\u0005\u0000\u0000-/\u0001\u0000\u0000\u0000.*\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/\u0005\u0001\u0000\u0000\u000001\u0005\u0006"+
		"\u0000\u000012\u0005\u0002\u0000\u000023\u0003\b\u0004\u000038\u0005\u0003"+
		"\u0000\u000045\u0005\u0004\u0000\u000056\u0003\n\u0005\u000067\u0005\u0005"+
		"\u0000\u000079\u0001\u0000\u0000\u000084\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009\u0007\u0001\u0000\u0000\u0000:?\u0001\u0000\u0000"+
		"\u0000;<\u0003\u0014\n\u0000<=\u0003\b\u0004\u0000=?\u0001\u0000\u0000"+
		"\u0000>:\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000?\t\u0001\u0000"+
		"\u0000\u0000@E\u0001\u0000\u0000\u0000AB\u0003\f\u0006\u0000BC\u0003\n"+
		"\u0005\u0000CE\u0001\u0000\u0000\u0000D@\u0001\u0000\u0000\u0000DA\u0001"+
		"\u0000\u0000\u0000E\u000b\u0001\u0000\u0000\u0000FG\u0003\u000e\u0007"+
		"\u0000G\r\u0001\u0000\u0000\u0000HK\u0003\u0010\b\u0000IK\u0003\u0002"+
		"\u0001\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u000f"+
		"\u0001\u0000\u0000\u0000LM\u0003\u0012\t\u0000MN\u0005\u0002\u0000\u0000"+
		"NO\u0003\b\u0004\u0000OT\u0005\u0003\u0000\u0000PQ\u0005\u0004\u0000\u0000"+
		"QR\u0003\n\u0005\u0000RS\u0005\u0005\u0000\u0000SU\u0001\u0000\u0000\u0000"+
		"TP\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0011\u0001\u0000"+
		"\u0000\u0000VW\u0007\u0000\u0000\u0000W\u0013\u0001\u0000\u0000\u0000"+
		"XY\u0005\u0010\u0000\u0000YZ\u0005\n\u0000\u0000Z\\\u0003\u0016\u000b"+
		"\u0000[]\u0005\u000b\u0000\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]\u0015\u0001\u0000\u0000\u0000^h\u0005\u0011\u0000\u0000"+
		"_h\u0005\u0012\u0000\u0000`h\u0005\u0013\u0000\u0000ah\u0005\u0014\u0000"+
		"\u0000bh\u0005\u0015\u0000\u0000ch\u0005\u0016\u0000\u0000dh\u0005\u0010"+
		"\u0000\u0000eh\u0003\u001a\r\u0000fh\u0003\u0018\f\u0000g^\u0001\u0000"+
		"\u0000\u0000g_\u0001\u0000\u0000\u0000g`\u0001\u0000\u0000\u0000ga\u0001"+
		"\u0000\u0000\u0000gb\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000\u0000"+
		"gd\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000"+
		"\u0000h\u0017\u0001\u0000\u0000\u0000ij\u0005\f\u0000\u0000jo\u0005\u0010"+
		"\u0000\u0000kl\u0005\r\u0000\u0000ln\u0005\u0010\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"rs\u0005\u0005\u0000\u0000s\u0019\u0001\u0000\u0000\u0000tu\u0005\u000e"+
		"\u0000\u0000uv\u0003\u001c\u000e\u0000vw\u0005\u000f\u0000\u0000w\u001b"+
		"\u0001\u0000\u0000\u0000x\u0082\u0001\u0000\u0000\u0000y~\u0003\u0016"+
		"\u000b\u0000z{\u0005\u000b\u0000\u0000{}\u0003\u0016\u000b\u0000|z\u0001"+
		"\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0081x\u0001\u0000\u0000\u0000\u0081y"+
		"\u0001\u0000\u0000\u0000\u0082\u001d\u0001\u0000\u0000\u0000\r $.8>DJ"+
		"T\\go~\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}