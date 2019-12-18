/* AndroidTotemSqlParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. AndroidTotemSqlParserTokenManager.java */
package generated;

/**
 * Token Manager.
 */
@SuppressWarnings("unused")
public class AndroidTotemSqlParserTokenManager implements AndroidTotemSqlParserConstants {

    /**
     * Token literal values.
     */
    public static final String[] jjstrLiteralImages = {
            "", null, null, null, null, "\73", "\50", "\51",};
    /**
     * Lexer state names.
     */
    public static final String[] lexStateNames = {
            "DEFAULT",
    };
    static final int[] jjnextStates = {
    };
    static final long[] jjtoToken = {
            0xe1L,
    };
    static final long[] jjtoSkip = {
            0x1eL,
    };
    static private final int[] jjrounds = new int[0];
    static private final int[] jjstateSet = new int[2 * 0];
    /**
     * Debug output.
     */
    public static java.io.PrintStream debugStream = System.out;
    static protected SimpleCharStream input_stream;
    static protected char curChar;
    static int curLexState = 0;
    static int defaultLexState = 0;
    static int jjnewStateCnt;
    static int jjround;
    static int jjmatchedPos;
    static int jjmatchedKind;

    /**
     * Constructor.
     */
    public AndroidTotemSqlParserTokenManager(SimpleCharStream stream) {

        if (input_stream != null)
            throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

        input_stream = stream;
    }

    /**
     * Constructor.
     */
    public AndroidTotemSqlParserTokenManager(SimpleCharStream stream, int lexState) {
        ReInit(stream);
        SwitchTo(lexState);
    }

    /**
     * Set debug output.
     */
    public static void setDebugStream(java.io.PrintStream ds) {
        debugStream = ds;
    }

    static private int jjStopAtPos(int pos, int kind) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        return pos + 1;
    }

    static private int jjMoveStringLiteralDfa0_0() {
        switch (curChar) {
            case 40:
                return jjStopAtPos(0, 6);
            case 41:
                return jjStopAtPos(0, 7);
            case 59:
                return jjStopAtPos(0, 5);
            default:
                return 1;
        }
    }

    static protected Token jjFillToken() {
        final Token t;
        final String curTokenImage;
        final int beginLine;
        final int endLine;
        final int beginColumn;
        final int endColumn;
        String im = jjstrLiteralImages[jjmatchedKind];
        curTokenImage = (im == null) ? SimpleCharStream.GetImage() : im;
        beginLine = SimpleCharStream.getBeginLine();
        beginColumn = SimpleCharStream.getBeginColumn();
        endLine = SimpleCharStream.getEndLine();
        endColumn = SimpleCharStream.getEndColumn();
        t = Token.newToken(jjmatchedKind, curTokenImage);

        t.beginLine = beginLine;
        t.endLine = endLine;
        t.beginColumn = beginColumn;
        t.endColumn = endColumn;

        return t;
    }

    /**
     * Get the next Token.
     */
    public static Token getNextToken() {
        Token matchedToken;
        int curPos = 0;

        EOFLoop:
        for (; ; ) {
            try {
                curChar = SimpleCharStream.BeginToken();
            } catch (java.io.IOException e) {
                jjmatchedKind = 0;
                jjmatchedPos = -1;
                matchedToken = jjFillToken();
                return matchedToken;
            }

            try {
                SimpleCharStream.backup(0);
                while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
                    curChar = SimpleCharStream.BeginToken();
            } catch (java.io.IOException e1) {
                continue EOFLoop;
            }
            jjmatchedKind = 0x7fffffff;
            jjmatchedPos = 0;
            curPos = jjMoveStringLiteralDfa0_0();
            if (jjmatchedKind != 0x7fffffff) {
                if (jjmatchedPos + 1 < curPos)
                    SimpleCharStream.backup(curPos - jjmatchedPos - 1);
                if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
                    matchedToken = jjFillToken();
                    return matchedToken;
                } else {
                    continue EOFLoop;
                }
            }
            int error_line = SimpleCharStream.getEndLine();
            int error_column = SimpleCharStream.getEndColumn();
            String error_after = null;
            boolean EOFSeen = false;
            try {
                SimpleCharStream.readChar();
                SimpleCharStream.backup(1);
            } catch (java.io.IOException e1) {
                EOFSeen = true;
                error_after = curPos <= 1 ? "" : SimpleCharStream.GetImage();
                if (curChar == '\n' || curChar == '\r') {
                    error_line++;
                    error_column = 0;
                } else
                    error_column++;
            }
            if (!EOFSeen) {
                SimpleCharStream.backup(1);
                error_after = curPos <= 1 ? "" : SimpleCharStream.GetImage();
            }
            throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
        }
    }

    static private void jjCheckNAdd(int state) {
        if (jjrounds[state] != jjround) {
            jjstateSet[jjnewStateCnt++] = state;
            jjrounds[state] = jjround;
        }
    }

    static private void jjAddStates(int start, int end) {
        do {
            jjstateSet[jjnewStateCnt++] = jjnextStates[start];
        } while (start++ != end);
    }

    static private void jjCheckNAddTwoStates(int state1, int state2) {
        jjCheckNAdd(state1);
        jjCheckNAdd(state2);
    }

    /**
     * Reinitialise parser.
     */
    static public void ReInit(SimpleCharStream stream) {
        jjmatchedPos = jjnewStateCnt = 0;
        curLexState = defaultLexState;
        input_stream = stream;
        ReInitRounds();
    }

    static private void ReInitRounds() {
        int i;
        jjround = 0x80000001;
        for (i = 0; i-- > 0; )
            jjrounds[i] = 0x80000000;
    }

    /**
     * Reinitialise parser.
     */
    static public void ReInit(SimpleCharStream stream, int lexState) {
        ReInit(stream);
        SwitchTo(lexState);
    }

    /**
     * Switch to specified lex state.
     */
    static public void SwitchTo(int lexState) {
        if (lexState >= 1 || lexState < 0)
            throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
        else
            curLexState = lexState;
    }
}