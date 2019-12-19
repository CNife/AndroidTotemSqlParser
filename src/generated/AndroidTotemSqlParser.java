/* AndroidTotemSqlParser.java */
/* Generated By:JavaCC: Do not edit this line. AndroidTotemSqlParser.java */
package generated;

import ast.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class AndroidTotemSqlParser implements AndroidTotemSqlParserConstants {
    public static List<Statement> parse(InputStream input) throws Exception {
        AndroidTotemSqlParser parser = new AndroidTotemSqlParser(input);
        return parser.statements();
    }

    static private int[] jj_la1_0;
    static private int[] jj_la1_1;

    static {
        jj_la1_init_0();
        jj_la1_init_1();
    }

    final private int[] jj_la1 = new int[10];
    final private JJCalls[] jj_2_rtns = new JJCalls[1];
    final private LookaheadSuccess jj_ls = new LookaheadSuccess();
    /**
     * Generated Token Manager.
     */
    public AndroidTotemSqlParserTokenManager token_source;
    /**
     * Current token.
     */
    public Token token;
    /**
     * Next token.
     */
    public Token jj_nt;
    SimpleCharStream jj_input_stream;
    private int jj_ntk;
    private Token jj_scanpos, jj_lastpos;
    private int jj_la;
    private int jj_gen;
    private boolean jj_rescan = false;
    private int jj_gc = 0;
    private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
    private int[] jj_expentry;
    private int jj_kind = -1;
    private int[] jj_lasttokens = new int[100];
    private int jj_endpos;
    private int trace_indent = 0;
    private boolean trace_enabled = true;

    /**
     * Constructor with InputStream.
     */
    public AndroidTotemSqlParser(java.io.InputStream stream) {
        this(stream, null);
    }

    /**
     * Constructor with InputStream and supplied encoding
     */
    public AndroidTotemSqlParser(java.io.InputStream stream, String encoding) {
        try {
            jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        token_source = new AndroidTotemSqlParserTokenManager(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 10; i++) jj_la1[i] = -1;
        for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
    }

    /**
     * Constructor.
     */
    public AndroidTotemSqlParser(java.io.Reader stream) {
        jj_input_stream = new SimpleCharStream(stream, 1, 1);
        token_source = new AndroidTotemSqlParserTokenManager(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 10; i++) jj_la1[i] = -1;
        for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
    }

    /**
     * Constructor with generated Token Manager.
     */
    public AndroidTotemSqlParser(AndroidTotemSqlParserTokenManager tm) {
        token_source = tm;
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 10; i++) jj_la1[i] = -1;
        for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
    }

    private static void jj_la1_init_0() {
        jj_la1_0 = new int[]{0x2080, 0x2080, 0x40000, 0x800000, 0x4000000, 0x0, 0x20, 0x0, 0x400000, 0x800000,};
    }

    private static void jj_la1_init_1() {
        jj_la1_1 = new int[]{0x0, 0x0, 0x0, 0x0, 0x0, 0x40, 0x0, 0xc0, 0x0, 0x0,};
    }

    final public List<Statement> statements() throws ParseException {
        trace_call("statements");
        try {
            List<Statement> statements = new ArrayList<Statement>();
            Statement s;
            label_1:
            while (true) {
                switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
                    case CREATE:
                    case SELECT: {
                        break;
                    }
                    default:
                        jj_la1[0] = jj_gen;
                        break label_1;
                }
                s = statement();
                statements.add(s);
            }
            jj_consume_token(0);
            {
                if ("" != null) return statements;
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("statements");
        }
    }

    final public Statement statement() throws ParseException {
        trace_call("statement");
        try {
            Statement s;
            switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
                case SELECT: {
                    s = selectStatement();
                    break;
                }
                case CREATE: {
                    s = createClassStatement();
                    break;
                }
                default:
                    jj_la1[1] = jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
            }
            jj_consume_token(SEMICOLON);
            {
                if ("" != null) return s;
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("statement");
        }
    }

    final public SelectStatement selectStatement() throws ParseException {
        trace_call("selectStatement");
        try {
            List<Projection> projectionList;
            String className;
            WhereClause whereClause = null;
            jj_consume_token(SELECT);
            projectionList = projectionList();
            jj_consume_token(FROM);
            className = identifier();
            switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
                case WHERE: {
                    jj_consume_token(WHERE);
                    whereClause = whereClause();
                    break;
                }
                default:
                    jj_la1[2] = jj_gen;
            }
            {
                if ("" != null) return new SelectStatement(projectionList, className, whereClause);
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("selectStatement");
        }
    }

    final public List<Projection> projectionList() throws ParseException {
        trace_call("projectionList");
        try {
            List<Projection> projectionList = new ArrayList<Projection>();
            Projection projection;
            projection = projection();
            projectionList.add(projection);
            label_2:
            while (true) {
                switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
                    case COMMA: {
                        break;
                    }
                    default:
                        jj_la1[3] = jj_gen;
                        break label_2;
                }
                jj_consume_token(COMMA);
                projection = projection();
                projectionList.add(projection);
            }
            {
                if ("" != null) return projectionList;
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("projectionList");
        }
    }

    final public Projection projection() throws ParseException {
        trace_call("projection");
        try {
            Projection projection;
            String name = null;
            switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
                case LEFT_BRACKET: {
                    projection = binaryProjection();
                    break;
                }
                default:
                    jj_la1[4] = jj_gen;
                    if (jj_2_1(2)) {
                        projection = crossClassProjection();
                    } else {
                        switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
                            case IDENTIFIER: {
                                projection = simpleProjection();
                                break;
                            }
                            default:
                                jj_la1[5] = jj_gen;
                                jj_consume_token(-1);
                                throw new ParseException();
                        }
                    }
            }
            switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
                case AS: {
                    jj_consume_token(AS);
                    name = identifier();
                    break;
                }
                default:
                    jj_la1[6] = jj_gen;
            }
            projection.name = name;
            {
                if ("" != null) return projection;
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("projection");
        }
    }

    final public BinaryProjection binaryProjection() throws ParseException {
        trace_call("binaryProjection");
        try {
            BinaryExpression expression;
            jj_consume_token(LEFT_BRACKET);
            expression = binaryExpression();
            jj_consume_token(RIGHT_BRACKET);
            {
                if ("" != null) return new BinaryProjection(expression);
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("binaryProjection");
        }
    }

    final public BinaryExpression binaryExpression() throws ParseException {
        trace_call("binaryExpression");
        try {
            SimpleExpression left, right;
            OperatorType operator;
            left = simpleExpression();
            operator = operator();
            right = simpleExpression();
            {
                if ("" != null) return new BinaryExpression(left, right, operator);
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("binaryExpression");
        }
    }

    final public SimpleExpression simpleExpression() throws ParseException {
        trace_call("simpleExpression");
        try {
            Object value;
            PropertyType type;
            switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
                case IDENTIFIER: {
                    value = identifier();
                    type = PropertyType.CHAR;
                    break;
                }
                case INTEGER_LITERAL: {
                    value = integer();
                    type = PropertyType.INT;
                    break;
                }
                default:
                    jj_la1[7] = jj_gen;
                    jj_consume_token(-1);
                    throw new ParseException();
            }
            {
                if ("" != null) return new SimpleExpression(value, type);
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("simpleExpression");
        }
    }

    final public int integer() throws ParseException {
        trace_call("integer");
        try {
            Token token;
            token = jj_consume_token(INTEGER_LITERAL);
            {
                if ("" != null) return Integer.parseInt(token.image);
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("integer");
        }
    }

    final public OperatorType operator() throws ParseException {
        trace_call("operator");
        try {
            Token token;
            token = jj_consume_token(BINARY_OPERATOR);
            {
                if ("" != null) return OperatorType.typeOf(token.image);
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("operator");
        }
    }

    final public CrossClassProjection crossClassProjection() throws ParseException {
        trace_call("crossClassProjection");
        try {
            List<String> classNames = new ArrayList<String>();
            String className;
            String propertyName;
            className = identifier();
            classNames.add(className);
            label_3:
            while (true) {
                jj_consume_token(ARROW);
                className = identifier();
                classNames.add(className);
                switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
                    case ARROW: {
                        break;
                    }
                    default:
                        jj_la1[8] = jj_gen;
                        break label_3;
                }
            }
            jj_consume_token(DOT);
            propertyName = identifier();
            {
                if ("" != null) return new CrossClassProjection(classNames, propertyName);
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("crossClassProjection");
        }
    }

    final public SimpleProjection simpleProjection() throws ParseException {
        trace_call("simpleProjection");
        try {
            String name;
            name = identifier();
            {
                if ("" != null) return new SimpleProjection(name);
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("simpleProjection");
        }
    }

    final public WhereClause whereClause() throws ParseException {
        trace_call("whereClause");
        try {
            BinaryExpression expression;
            expression = binaryExpression();
            {
                if ("" != null) return new WhereClause(expression);
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("whereClause");
        }
    }

    final public String identifier() throws ParseException {
        trace_call("identifier");
        try {
            Token token;
            token = jj_consume_token(IDENTIFIER);
            {
                if ("" != null) return token.image;
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("identifier");
        }
    }

    final public CreateClassStatement createClassStatement() throws ParseException {
        trace_call("createClassStatement");
        try {
            String className;
            List<Property> propertyList;
            jj_consume_token(CREATE);
            jj_consume_token(CLASS);
            className = identifier();
            propertyList = propertyList();
            {
                if ("" != null) return new CreateClassStatement(className, propertyList);
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("createClassStatement");
        }
    }

    final public List<Property> propertyList() throws ParseException {
        trace_call("propertyList");
        try {
            List<Property> propertyList = new ArrayList<Property>();
            Property property;
            jj_consume_token(LEFT_BRACKET);
            property = property();
            propertyList.add(property);
            label_4:
            while (true) {
                switch ((jj_ntk == -1) ? jj_ntk_f() : jj_ntk) {
                    case COMMA: {
                        break;
                    }
                    default:
                        jj_la1[9] = jj_gen;
                        break label_4;
                }
                jj_consume_token(COMMA);
                property = property();
                propertyList.add(property);
            }
            jj_consume_token(RIGHT_BRACKET);
            {
                if ("" != null) return propertyList;
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("propertyList");
        }
    }

    final public Property property() throws ParseException {
        trace_call("property");
        try {
            String name;
            PropertyType type;
            name = identifier();
            type = propertyType();
            {
                if ("" != null) return new Property(name, type);
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("property");
        }
    }

    final public PropertyType propertyType() throws ParseException {
        trace_call("propertyType");
        try {
            Token token;
            token = jj_consume_token(TYPE);
            {
                if ("" != null) return PropertyType.typeOf(token.image);
            }
            throw new Error("Missing return statement in function");
        } finally {
            trace_return("propertyType");
        }
    }

    private boolean jj_2_1(int xla) {
        jj_la = xla;
        jj_lastpos = jj_scanpos = token;
        try {
            return !jj_3_1();
        } catch (LookaheadSuccess ls) {
            return true;
        } finally {
            jj_save(0, xla);
        }
    }

    private boolean jj_3R_7() {
        return jj_scan_token(ARROW);
    }

    private boolean jj_3R_5() {
        if (jj_3R_6()) return true;
        Token xsp;
        if (jj_3R_7()) return true;
        while (true) {
            xsp = jj_scanpos;
            if (jj_3R_7()) {
                jj_scanpos = xsp;
                break;
            }
        }
        return false;
    }

    private boolean jj_3R_6() {
        return jj_scan_token(IDENTIFIER);
    }

    private boolean jj_3_1() {
        return jj_3R_5();
    }

    /**
     * Reinitialise.
     */
    public void ReInit(java.io.InputStream stream) {
        ReInit(stream, null);
    }

    /**
     * Reinitialise.
     */
    public void ReInit(java.io.InputStream stream, String encoding) {
        try {
            jj_input_stream.ReInit(stream, encoding, 1, 1);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        token_source.ReInit(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 10; i++) jj_la1[i] = -1;
        for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
    }

    /**
     * Reinitialise.
     */
    public void ReInit(java.io.Reader stream) {
        jj_input_stream.ReInit(stream, 1, 1);
        token_source.ReInit(jj_input_stream);
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 10; i++) jj_la1[i] = -1;
        for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
    }

    /**
     * Reinitialise.
     */
    public void ReInit(AndroidTotemSqlParserTokenManager tm) {
        token_source = tm;
        token = new Token();
        jj_ntk = -1;
        jj_gen = 0;
        for (int i = 0; i < 10; i++) jj_la1[i] = -1;
        for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
    }

    private Token jj_consume_token(int kind) throws ParseException {
        Token oldToken;
        if ((oldToken = token).next != null) token = token.next;
        else token = token.next = token_source.getNextToken();
        jj_ntk = -1;
        if (token.kind == kind) {
            jj_gen++;
            if (++jj_gc > 100) {
                jj_gc = 0;
                for (int i = 0; i < jj_2_rtns.length; i++) {
                    JJCalls c = jj_2_rtns[i];
                    while (c != null) {
                        if (c.gen < jj_gen) c.first = null;
                        c = c.next;
                    }
                }
            }
            trace_token(token, "");
            return token;
        }
        token = oldToken;
        jj_kind = kind;
        throw generateParseException();
    }

    private boolean jj_scan_token(int kind) {
        if (jj_scanpos == jj_lastpos) {
            jj_la--;
            if (jj_scanpos.next == null) {
                jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
            } else {
                jj_lastpos = jj_scanpos = jj_scanpos.next;
            }
        } else {
            jj_scanpos = jj_scanpos.next;
        }
        if (jj_rescan) {
            int i = 0;
            Token tok = token;
            while (tok != null && tok != jj_scanpos) {
                i++;
                tok = tok.next;
            }
            if (tok != null) jj_add_error_token(kind, i);
        }
        if (jj_scanpos.kind != kind) return true;
        if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
        return false;
    }

    /**
     * Get the next Token.
     */
    final public Token getNextToken() {
        if (token.next != null) token = token.next;
        else token = token.next = token_source.getNextToken();
        jj_ntk = -1;
        jj_gen++;
        trace_token(token, " (in getNextToken)");
        return token;
    }

    /**
     * Get the specific Token.
     */
    final public Token getToken(int index) {
        Token t = token;
        for (int i = 0; i < index; i++) {
            if (t.next != null) t = t.next;
            else t = t.next = token_source.getNextToken();
        }
        return t;
    }

    private int jj_ntk_f() {
        if ((jj_nt = token.next) == null)
            return (jj_ntk = (token.next = token_source.getNextToken()).kind);
        else
            return (jj_ntk = jj_nt.kind);
    }

    private void jj_add_error_token(int kind, int pos) {
        if (pos >= 100) return;
        if (pos == jj_endpos + 1) {
            jj_lasttokens[jj_endpos++] = kind;
        } else if (jj_endpos != 0) {
            jj_expentry = new int[jj_endpos];
            for (int i = 0; i < jj_endpos; i++) {
                jj_expentry[i] = jj_lasttokens[i];
            }
            jj_entries_loop:
            for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext(); ) {
                int[] oldentry = (int[]) (it.next());
                if (oldentry.length == jj_expentry.length) {
                    for (int i = 0; i < jj_expentry.length; i++) {
                        if (oldentry[i] != jj_expentry[i]) {
                            continue jj_entries_loop;
                        }
                    }
                    jj_expentries.add(jj_expentry);
                    break jj_entries_loop;
                }
            }
            if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
        }
    }

    /**
     * Generate ParseException.
     */
    public ParseException generateParseException() {
        jj_expentries.clear();
        boolean[] la1tokens = new boolean[43];
        if (jj_kind >= 0) {
            la1tokens[jj_kind] = true;
            jj_kind = -1;
        }
        for (int i = 0; i < 10; i++) {
            if (jj_la1[i] == jj_gen) {
                for (int j = 0; j < 32; j++) {
                    if ((jj_la1_0[i] & (1 << j)) != 0) {
                        la1tokens[j] = true;
                    }
                    if ((jj_la1_1[i] & (1 << j)) != 0) {
                        la1tokens[32 + j] = true;
                    }
                }
            }
        }
        for (int i = 0; i < 43; i++) {
            if (la1tokens[i]) {
                jj_expentry = new int[1];
                jj_expentry[0] = i;
                jj_expentries.add(jj_expentry);
            }
        }
        jj_endpos = 0;
        jj_rescan_token();
        jj_add_error_token(0, 0);
        int[][] exptokseq = new int[jj_expentries.size()][];
        for (int i = 0; i < jj_expentries.size(); i++) {
            exptokseq[i] = jj_expentries.get(i);
        }
        return new ParseException(token, exptokseq, tokenImage);
    }

    /**
     * Enable tracing.
     */
    final public void enable_tracing() {
        trace_enabled = true;
    }

    /**
     * Disable tracing.
     */
    final public void disable_tracing() {
        trace_enabled = false;
    }

    private void trace_call(String s) {
        if (trace_enabled) {
            for (int i = 0; i < trace_indent; i++) {
                System.out.print(" ");
            }
            System.out.println("Call:   " + s);
        }
        trace_indent = trace_indent + 2;
    }

    private void trace_return(String s) {
        trace_indent = trace_indent - 2;
        if (trace_enabled) {
            for (int i = 0; i < trace_indent; i++) {
                System.out.print(" ");
            }
            System.out.println("Return: " + s);
        }
    }

    private void trace_token(Token t, String where) {
        if (trace_enabled) {
            for (int i = 0; i < trace_indent; i++) {
                System.out.print(" ");
            }
            System.out.print("Consumed token: <" + tokenImage[t.kind]);
            if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
                System.out.print(": \"" + t.image + "\"");
            }
            System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
        }
    }

    private void trace_scan(Token t1, int t2) {
        if (trace_enabled) {
            for (int i = 0; i < trace_indent; i++) {
                System.out.print(" ");
            }
            System.out.print("Visited token: <" + tokenImage[t1.kind]);
            if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
                System.out.print(": \"" + t1.image + "\"");
            }
            System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
        }
    }

    private void jj_rescan_token() {
        jj_rescan = true;
        for (int i = 0; i < 1; i++) {
            try {
                JJCalls p = jj_2_rtns[i];
                do {
                    if (p.gen > jj_gen) {
                        jj_la = p.arg;
                        jj_lastpos = jj_scanpos = p.first;
                        switch (i) {
                            case 0:
                                jj_3_1();
                                break;
                        }
                    }
                    p = p.next;
                } while (p != null);
            } catch (LookaheadSuccess ls) {
            }
        }
        jj_rescan = false;
    }

    private void jj_save(int index, int xla) {
        JJCalls p = jj_2_rtns[index];
        while (p.gen > jj_gen) {
            if (p.next == null) {
                p = p.next = new JJCalls();
                break;
            }
            p = p.next;
        }
        p.gen = jj_gen + xla - jj_la;
        p.first = token;
        p.arg = xla;
    }

    @SuppressWarnings("serial")
    static private final class LookaheadSuccess extends java.lang.Error { }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
