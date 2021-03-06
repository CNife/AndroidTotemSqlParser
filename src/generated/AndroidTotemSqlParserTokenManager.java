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
            "", null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, "\55\76", "\54", "\56", "\73",
            "\50", "\51", "\47", null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null,};
    /**
     * Lexer state names.
     */
    public static final String[] lexStateNames = {
            "DEFAULT",
    };
    /**
     * Lex State array.
     */
    public static final int[] jjnewLexState = {
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
    };
    static final long[] jjbitVec0 = {
            0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
    };
    static final int[] jjnextStates = {0
    };
    static final long[] jjtoToken = {
            0x11803fcfffe1L,
    };
    static final long[] jjtoSkip = {
            0x1eL,
    };
    static final long[] jjtoSpecial = {
            0x0L,
    };
    static final long[] jjtoMore = {
            0x0L,
    };
    private final int[] jjrounds = new int[20];
    private final int[] jjstateSet = new int[2 * 20];
    private final StringBuilder jjimage = new StringBuilder();
    /**
     * Debug output.
     */
    public java.io.PrintStream debugStream = System.out;
    protected SimpleCharStream input_stream;
    protected int curChar;
    int curLexState = 0;
    int defaultLexState = 0;
    int jjnewStateCnt;
    int jjround;
    int jjmatchedPos;
    int jjmatchedKind;
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;

    /**
     * Constructor.
     */
    public AndroidTotemSqlParserTokenManager(SimpleCharStream stream) {

        if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

        input_stream = stream;
    }

    /** Constructor. */
    public AndroidTotemSqlParserTokenManager(SimpleCharStream stream, int lexState) {
        ReInit(stream);
        SwitchTo(lexState);
    }

    /** Set debug output. */
    public void setDebugStream(java.io.PrintStream ds) {
        debugStream = ds;
    }

    private final int jjStopStringLiteralDfa_0(int pos, long active0) {
        switch (pos) {
            case 0:
                if ((active0 & 0xc0L) != 0L) {
                    jjmatchedKind = 39;
                    return 5;
                }
                if ((active0 & 0x7e720L) != 0L) {
                    jjmatchedKind = 39;
                    return 14;
                }
                if ((active0 & 0x10000000L) != 0L)
                    return 20;
                if ((active0 & 0x1800L) != 0L) {
                    jjmatchedKind = 39;
                    return 1;
                }
                if ((active0 & 0x400000L) != 0L) {
                    jjmatchedKind = 29;
                    return -1;
                }
                return -1;
            case 1:
                if ((active0 & 0x1800L) != 0L) {
                    jjmatchedKind = 39;
                    jjmatchedPos = 1;
                    return 0;
                }
                if ((active0 & 0x20L) != 0L)
                    return 14;
                if ((active0 & 0x7e7c0L) != 0L) {
                    jjmatchedKind = 39;
                    jjmatchedPos = 1;
                    return 14;
                }
                if ((active0 & 0x400000L) != 0L) {
                    if (jjmatchedPos == 0) {
                        jjmatchedKind = 29;
                        jjmatchedPos = 0;
                    }
                    return -1;
                }
                return -1;
            case 2:
                if ((active0 & 0x8000L) != 0L)
                    return 14;
                if ((active0 & 0x1000L) != 0L) {
                    jjmatchedKind = 19;
                    jjmatchedPos = 2;
                    return 14;
                }
                if ((active0 & 0x76fc0L) != 0L) {
                    jjmatchedKind = 39;
                    jjmatchedPos = 2;
                    return 14;
                }
                return -1;
            case 3:
                if ((active0 & 0x769c0L) != 0L) {
                    jjmatchedKind = 39;
                    jjmatchedPos = 3;
                    return 14;
                }
                if ((active0 & 0x1600L) != 0L)
                    return 14;
                return -1;
            case 4:
                if ((active0 & 0x40040L) != 0L)
                    return 14;
                if ((active0 & 0x36980L) != 0L) {
                    jjmatchedKind = 39;
                    jjmatchedPos = 4;
                    return 14;
                }
                return -1;
            case 5:
                if ((active0 & 0x36980L) != 0L)
                    return 14;
                return -1;
            case 6:
                if ((active0 & 0x4000L) != 0L) {
                    jjmatchedKind = 39;
                    jjmatchedPos = 6;
                    return 14;
                }
                return -1;
            case 7:
                if ((active0 & 0x4000L) != 0L) {
                    jjmatchedKind = 39;
                    jjmatchedPos = 7;
                    return 14;
                }
                return -1;
            case 8:
                if ((active0 & 0x4000L) != 0L) {
                    jjmatchedKind = 39;
                    jjmatchedPos = 8;
                    return 14;
                }
                return -1;
            case 9:
                if ((active0 & 0x4000L) != 0L) {
                    jjmatchedKind = 39;
                    jjmatchedPos = 9;
                    return 14;
                }
                return -1;
            case 10:
                if ((active0 & 0x4000L) != 0L) {
                    jjmatchedKind = 39;
                    jjmatchedPos = 10;
                    return 14;
                }
                return -1;
            default:
                return -1;
        }
    }

    private final int jjStartNfa_0(int pos, long active0) {
        return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
    }

    private int jjStopAtPos(int pos, int kind) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        return pos + 1;
    }

    private int jjMoveStringLiteralDfa0_0() {
        switch (curChar) {
            case 39:
                return jjStartNfaWithStates_0(0, 28, 20);
            case 40:
                return jjStopAtPos(0, 26);
            case 41:
                return jjStopAtPos(0, 27);
            case 44:
                return jjStopAtPos(0, 23);
            case 45:
                return jjMoveStringLiteralDfa1_0(0x400000L);
            case 46:
                return jjStopAtPos(0, 24);
            case 59:
                return jjStopAtPos(0, 25);
            case 65:
            case 97:
                return jjMoveStringLiteralDfa1_0(0x20L);
            case 67:
            case 99:
                return jjMoveStringLiteralDfa1_0(0xc0L);
            case 68:
            case 100:
                return jjMoveStringLiteralDfa1_0(0x300L);
            case 70:
            case 102:
                return jjMoveStringLiteralDfa1_0(0x400L);
            case 73:
            case 105:
                return jjMoveStringLiteralDfa1_0(0x1800L);
            case 83:
            case 115:
                return jjMoveStringLiteralDfa1_0(0xe000L);
            case 85:
            case 117:
                return jjMoveStringLiteralDfa1_0(0x10000L);
            case 86:
            case 118:
                return jjMoveStringLiteralDfa1_0(0x20000L);
            case 87:
            case 119:
                return jjMoveStringLiteralDfa1_0(0x40000L);
            default:
                return jjMoveNfa_0(2, 0);
        }
    }

    private int jjMoveStringLiteralDfa1_0(long active0) {
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(0, active0);
            return 1;
        }
        switch (curChar) {
            case 62:
                if ((active0 & 0x400000L) != 0L)
                    return jjStopAtPos(1, 22);
                break;
            case 65:
            case 97:
                return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
            case 69:
            case 101:
                return jjMoveStringLiteralDfa2_0(active0, 0xe100L);
            case 72:
            case 104:
                return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
            case 76:
            case 108:
                return jjMoveStringLiteralDfa2_0(active0, 0x40L);
            case 78:
            case 110:
                return jjMoveStringLiteralDfa2_0(active0, 0x1800L);
            case 80:
            case 112:
                return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
            case 82:
            case 114:
                return jjMoveStringLiteralDfa2_0(active0, 0x680L);
            case 83:
            case 115:
                if ((active0 & 0x20L) != 0L)
                    return jjStartNfaWithStates_0(1, 5, 14);
                break;
            default:
                break;
        }
        return jjStartNfa_0(0, active0);
    }

    private int jjMoveStringLiteralDfa2_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(0, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(1, active0);
            return 2;
        }
        switch (curChar) {
            case 65:
            case 97:
                return jjMoveStringLiteralDfa3_0(active0, 0x40L);
            case 68:
            case 100:
                return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
            case 69:
            case 101:
                return jjMoveStringLiteralDfa3_0(active0, 0x40080L);
            case 76:
            case 108:
                return jjMoveStringLiteralDfa3_0(active0, 0x26100L);
            case 79:
            case 111:
                return jjMoveStringLiteralDfa3_0(active0, 0x600L);
            case 83:
            case 115:
                return jjMoveStringLiteralDfa3_0(active0, 0x800L);
            case 84:
            case 116:
                if ((active0 & 0x8000L) != 0L)
                    return jjStartNfaWithStates_0(2, 15, 14);
                return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
            default:
                break;
        }
        return jjStartNfa_0(1, active0);
    }

    private int jjMoveStringLiteralDfa3_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(1, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(2, active0);
            return 3;
        }
        switch (curChar) {
            case 65:
            case 97:
                return jjMoveStringLiteralDfa4_0(active0, 0x10080L);
            case 69:
            case 101:
                return jjMoveStringLiteralDfa4_0(active0, 0x6900L);
            case 77:
            case 109:
                if ((active0 & 0x400L) != 0L)
                    return jjStartNfaWithStates_0(3, 10, 14);
                break;
            case 79:
            case 111:
                if ((active0 & 0x1000L) != 0L)
                    return jjStartNfaWithStates_0(3, 12, 14);
                break;
            case 80:
            case 112:
                if ((active0 & 0x200L) != 0L)
                    return jjStartNfaWithStates_0(3, 9, 14);
                break;
            case 82:
            case 114:
                return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
            case 83:
            case 115:
                return jjMoveStringLiteralDfa4_0(active0, 0x40L);
            case 85:
            case 117:
                return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
            default:
                break;
        }
        return jjStartNfa_0(2, active0);
    }

    private int jjMoveStringLiteralDfa4_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(2, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(3, active0);
            return 4;
        }
        switch (curChar) {
            case 67:
            case 99:
                return jjMoveStringLiteralDfa5_0(active0, 0x6000L);
            case 69:
            case 101:
                if ((active0 & 0x40000L) != 0L)
                    return jjStartNfaWithStates_0(4, 18, 14);
                return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
            case 82:
            case 114:
                return jjMoveStringLiteralDfa5_0(active0, 0x800L);
            case 83:
            case 115:
                if ((active0 & 0x40L) != 0L)
                    return jjStartNfaWithStates_0(4, 6, 14);
                break;
            case 84:
            case 116:
                return jjMoveStringLiteralDfa5_0(active0, 0x10180L);
            default:
                break;
        }
        return jjStartNfa_0(3, active0);
    }

    private int jjMoveStringLiteralDfa5_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(3, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(4, active0);
            return 5;
        }
        switch (curChar) {
            case 69:
            case 101:
                if ((active0 & 0x80L) != 0L)
                    return jjStartNfaWithStates_0(5, 7, 14);
                else if ((active0 & 0x100L) != 0L)
                    return jjStartNfaWithStates_0(5, 8, 14);
                else if ((active0 & 0x10000L) != 0L)
                    return jjStartNfaWithStates_0(5, 16, 14);
                break;
            case 83:
            case 115:
                if ((active0 & 0x20000L) != 0L)
                    return jjStartNfaWithStates_0(5, 17, 14);
                break;
            case 84:
            case 116:
                if ((active0 & 0x800L) != 0L)
                    return jjStartNfaWithStates_0(5, 11, 14);
                else if ((active0 & 0x2000L) != 0L) {
                    jjmatchedKind = 13;
                    jjmatchedPos = 5;
                }
                return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
            default:
                break;
        }
        return jjStartNfa_0(4, active0);
    }

    private int jjMoveStringLiteralDfa6_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(4, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(5, active0);
            return 6;
        }
        switch (curChar) {
            case 68:
            case 100:
                return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
            default:
                break;
        }
        return jjStartNfa_0(5, active0);
    }

    private int jjMoveStringLiteralDfa7_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(5, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(6, active0);
            return 7;
        }
        switch (curChar) {
            case 69:
            case 101:
                return jjMoveStringLiteralDfa8_0(active0, 0x4000L);
            default:
                break;
        }
        return jjStartNfa_0(6, active0);
    }

    private int jjMoveStringLiteralDfa8_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(6, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(7, active0);
            return 8;
        }
        switch (curChar) {
            case 80:
            case 112:
                return jjMoveStringLiteralDfa9_0(active0, 0x4000L);
            default:
                break;
        }
        return jjStartNfa_0(7, active0);
    }

    private int jjMoveStringLiteralDfa9_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(7, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(8, active0);
            return 9;
        }
        switch (curChar) {
            case 85:
            case 117:
                return jjMoveStringLiteralDfa10_0(active0, 0x4000L);
            default:
                break;
        }
        return jjStartNfa_0(8, active0);
    }

    private int jjMoveStringLiteralDfa10_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(8, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(9, active0);
            return 10;
        }
        switch (curChar) {
            case 84:
            case 116:
                return jjMoveStringLiteralDfa11_0(active0, 0x4000L);
            default:
                break;
        }
        return jjStartNfa_0(9, active0);
    }

    private int jjMoveStringLiteralDfa11_0(long old0, long active0) {
        if (((active0 &= old0)) == 0L)
            return jjStartNfa_0(9, old0);
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            jjStopStringLiteralDfa_0(10, active0);
            return 11;
        }
        switch (curChar) {
            case 89:
            case 121:
                if ((active0 & 0x4000L) != 0L)
                    return jjStartNfaWithStates_0(11, 14, 14);
                break;
            default:
                break;
        }
        return jjStartNfa_0(10, active0);
    }

    private int jjStartNfaWithStates_0(int pos, int kind, int state) {
        jjmatchedKind = kind;
        jjmatchedPos = pos;
        try {
            curChar = input_stream.readChar();
        } catch (java.io.IOException e) {
            return pos + 1;
        }
        return jjMoveNfa_0(state, pos + 1);
    }

    private int jjMoveNfa_0(int startState, int curPos) {
        int startsAt = 0;
        jjnewStateCnt = 20;
        int i = 1;
        jjstateSet[0] = startState;
        int kind = 0x7fffffff;
        for (; ; ) {
            if (++jjround == 0x7fffffff)
                ReInitRounds();
            if (curChar < 64) {
                long l = 1L << curChar;
                do {
                    switch (jjstateSet[--i]) {
                        case 2:
                            if ((0x3fe000000000000L & l) != 0L) {
                                if (kind > 40)
                                    kind = 40;
                                {
                                    jjCheckNAdd(16);
                                }
                            } else if ((0x7000a40000000000L & l) != 0L) {
                                if (kind > 29)
                                    kind = 29;
                            } else if (curChar == 39) {
                                jjCheckNAddTwoStates(18, 19);
                            }
                            if (curChar == 62)
                                jjstateSet[jjnewStateCnt++] = 10;
                            else if (curChar == 60)
                                jjstateSet[jjnewStateCnt++] = 8;
                            break;
                        case 5:
                        case 14:
                            if ((0x3ff000000000000L & l) == 0L)
                                break;
                            if (kind > 39)
                                kind = 39;
                        {
                            jjCheckNAdd(14);
                        }
                        break;
                        case 1:
                            if ((0x3ff000000000000L & l) == 0L)
                                break;
                            if (kind > 39)
                                kind = 39;
                        {
                            jjCheckNAdd(14);
                        }
                        break;
                        case 0:
                            if ((0x3ff000000000000L & l) == 0L)
                                break;
                            if (kind > 39)
                                kind = 39;
                        {
                            jjCheckNAdd(14);
                        }
                        break;
                        case 20:
                            if ((0xffffff7fffffffffL & l) != 0L) {
                                jjCheckNAddTwoStates(18, 19);
                            } else if (curChar == 39) {
                                if (kind > 44)
                                    kind = 44;
                            }
                            break;
                        case 7:
                            if ((0x7000a40000000000L & l) != 0L && kind > 29)
                                kind = 29;
                            break;
                        case 8:
                            if (curChar == 61 && kind > 29)
                                kind = 29;
                            break;
                        case 9:
                            if (curChar == 60)
                                jjstateSet[jjnewStateCnt++] = 8;
                            break;
                        case 10:
                            if (curChar == 61)
                                jjstateSet[jjnewStateCnt++] = 11;
                            break;
                        case 11:
                            if (curChar == 43 && kind > 29)
                                kind = 29;
                            break;
                        case 12:
                            if (curChar == 62)
                                jjstateSet[jjnewStateCnt++] = 10;
                            break;
                        case 15:
                            if ((0x3fe000000000000L & l) == 0L)
                                break;
                            if (kind > 40)
                                kind = 40;
                        {
                            jjCheckNAdd(16);
                        }
                        break;
                        case 16:
                            if ((0x3ff000000000000L & l) == 0L)
                                break;
                            if (kind > 40)
                                kind = 40;
                        {
                            jjCheckNAdd(16);
                        }
                        break;
                        case 17:
                            if (curChar == 39) {
                                jjCheckNAddTwoStates(18, 19);
                            }
                            break;
                        case 18:
                            if ((0xffffff7fffffffffL & l) != 0L) {
                                jjCheckNAddTwoStates(18, 19);
                            }
                            break;
                        case 19:
                            if (curChar == 39 && kind > 44)
                                kind = 44;
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else if (curChar < 128) {
                long l = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                        case 2:
                            if ((0x7fffffe07fffffeL & l) != 0L) {
                                if (kind > 39)
                                    kind = 39;
                                {
                                    jjCheckNAdd(14);
                                }
                            }
                            if ((0x800000008L & l) != 0L)
                                jjstateSet[jjnewStateCnt++] = 5;
                            else if ((0x20000000200L & l) != 0L)
                                jjstateSet[jjnewStateCnt++] = 1;
                            break;
                        case 5:
                            if ((0x7fffffe07fffffeL & l) != 0L) {
                                if (kind > 39)
                                    kind = 39;
                                {
                                    jjCheckNAdd(14);
                                }
                            }
                            if ((0x10000000100L & l) != 0L)
                                jjstateSet[jjnewStateCnt++] = 4;
                            break;
                        case 1:
                            if ((0x7fffffe07fffffeL & l) != 0L) {
                                if (kind > 39)
                                    kind = 39;
                                {
                                    jjCheckNAdd(14);
                                }
                            }
                            if ((0x400000004000L & l) != 0L)
                                jjstateSet[jjnewStateCnt++] = 0;
                            break;
                        case 0:
                            if ((0x7fffffe07fffffeL & l) != 0L) {
                                if (kind > 39)
                                    kind = 39;
                                {
                                    jjCheckNAdd(14);
                                }
                            }
                            if ((0x10000000100000L & l) != 0L) {
                                if (kind > 19)
                                    kind = 19;
                            }
                            break;
                        case 20:
                        case 18: {
                            jjCheckNAddTwoStates(18, 19);
                        }
                        break;
                        case 3:
                            if ((0x4000000040000L & l) != 0L && kind > 19)
                                kind = 19;
                            break;
                        case 4:
                            if ((0x200000002L & l) != 0L)
                                jjstateSet[jjnewStateCnt++] = 3;
                            break;
                        case 6:
                            if ((0x800000008L & l) != 0L)
                                jjstateSet[jjnewStateCnt++] = 5;
                            break;
                        case 13:
                            if ((0x7fffffe07fffffeL & l) == 0L)
                                break;
                            if (kind > 39)
                                kind = 39;
                        {
                            jjCheckNAdd(14);
                        }
                        break;
                        case 14:
                            if ((0x7fffffe07fffffeL & l) == 0L)
                                break;
                            if (kind > 39)
                                kind = 39;
                        {
                            jjCheckNAdd(14);
                        }
                        break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            } else {
                int i2 = (curChar & 0xff) >> 6;
                long l2 = 1L << (curChar & 077);
                do {
                    switch (jjstateSet[--i]) {
                        case 20:
                        case 18:
                            if ((jjbitVec0[i2] & l2) != 0L) {
                                jjCheckNAddTwoStates(18, 19);
                            }
                            break;
                        default:
                            break;
                    }
                } while (i != startsAt);
            }
            if (kind != 0x7fffffff) {
                jjmatchedKind = kind;
                jjmatchedPos = curPos;
                kind = 0x7fffffff;
            }
            ++curPos;
            if ((i = jjnewStateCnt) == (startsAt = 20 - (jjnewStateCnt = startsAt)))
                return curPos;
            try {
                curChar = input_stream.readChar();
            } catch (java.io.IOException e) {
                return curPos;
            }
        }
    }

    protected Token jjFillToken() {
        final Token t;
        final String curTokenImage;
        final int beginLine;
        final int endLine;
        final int beginColumn;
        final int endColumn;
        String im = jjstrLiteralImages[jjmatchedKind];
        curTokenImage = (im == null) ? input_stream.GetImage() : im;
        beginLine = input_stream.getBeginLine();
        beginColumn = input_stream.getBeginColumn();
        endLine = input_stream.getEndLine();
        endColumn = input_stream.getEndColumn();
        t = Token.newToken(jjmatchedKind);
        t.kind = jjmatchedKind;
        t.image = curTokenImage;

        t.beginLine = beginLine;
        t.endLine = endLine;
        t.beginColumn = beginColumn;
        t.endColumn = endColumn;

        return t;
    }

    /**
     * Get the next Token.
     */
    public Token getNextToken() {
        Token matchedToken;
        int curPos = 0;

        EOFLoop:
        for (; ; ) {
            try {
                curChar = input_stream.BeginToken();
            } catch (Exception e) {
                jjmatchedKind = 0;
                jjmatchedPos = -1;
                matchedToken = jjFillToken();
                return matchedToken;
            }

            try {
                input_stream.backup(0);
                while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
                    curChar = input_stream.BeginToken();
            } catch (java.io.IOException e1) {
                continue EOFLoop;
            }
            jjmatchedKind = 0x7fffffff;
            jjmatchedPos = 0;
            curPos = jjMoveStringLiteralDfa0_0();
            if (jjmatchedKind != 0x7fffffff) {
                if (jjmatchedPos + 1 < curPos)
                    input_stream.backup(curPos - jjmatchedPos - 1);
                if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
                    matchedToken = jjFillToken();
                    return matchedToken;
                } else {
                    continue EOFLoop;
                }
            }
            int error_line = input_stream.getEndLine();
            int error_column = input_stream.getEndColumn();
            String error_after = null;
            boolean EOFSeen = false;
            try {
                input_stream.readChar();
                input_stream.backup(1);
            } catch (java.io.IOException e1) {
                EOFSeen = true;
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
                if (curChar == '\n' || curChar == '\r') {
                    error_line++;
                    error_column = 0;
                } else
                    error_column++;
            }
            if (!EOFSeen) {
                input_stream.backup(1);
                error_after = curPos <= 1 ? "" : input_stream.GetImage();
            }
            throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
        }
    }

    void SkipLexicalActions(Token matchedToken) {
        switch (jjmatchedKind) {
            default:
                break;
        }
    }

    void MoreLexicalActions() {
        jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
        switch (jjmatchedKind) {
            default:
                break;
        }
    }

    void TokenLexicalActions(Token matchedToken) {
        switch (jjmatchedKind) {
            default:
                break;
        }
    }

    private void jjCheckNAdd(int state) {
        if (jjrounds[state] != jjround) {
            jjstateSet[jjnewStateCnt++] = state;
            jjrounds[state] = jjround;
        }
    }

    private void jjAddStates(int start, int end) {
        do {
            jjstateSet[jjnewStateCnt++] = jjnextStates[start];
        } while (start++ != end);
    }

    private void jjCheckNAddTwoStates(int state1, int state2) {
        jjCheckNAdd(state1);
        jjCheckNAdd(state2);
    }

    /**
     * Reinitialise parser.
     */

    public void ReInit(SimpleCharStream stream) {


        jjmatchedPos =
                jjnewStateCnt =
                        0;
        curLexState = defaultLexState;
        input_stream = stream;
        ReInitRounds();
    }

    private void ReInitRounds() {
        int i;
        jjround = 0x80000001;
        for (i = 20; i-- > 0; )
            jjrounds[i] = 0x80000000;
    }

    /**
     * Reinitialise parser.
     */
    public void ReInit(SimpleCharStream stream, int lexState) {
        ReInit(stream);
        SwitchTo(lexState);
    }

    /**
     * Switch to specified lex state.
     */
    public void SwitchTo(int lexState) {
        if (lexState >= 1 || lexState < 0)
            throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
        else
            curLexState = lexState;
    }
}
