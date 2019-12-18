package ast;

public class WhereClause {

    public String left;
    public String right;
    public BooleanOperatorType operator;

    public enum BooleanOperatorType {
        EQUALS,
        LESS_THAN,
        GREATER_THAN,
        LESS_THAN_OR_EQUALS,
        GREATER_THAN_OR_EQUALS,
    }
}