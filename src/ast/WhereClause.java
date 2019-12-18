package ast;

public class WhereClause {

    public String left;
    public Expression right;
    public BooleanOperatorType operator;

    public WhereClause(String left, Expression right, BooleanOperatorType operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public enum BooleanOperatorType {
        EQUALS,
        LESS_THAN,
        GREATER_THAN,
        LESS_THAN_OR_EQUALS,
        GREATER_THAN_OR_EQUALS,
    }
}
