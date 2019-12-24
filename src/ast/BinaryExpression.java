package ast;

/**
 * 二元表达式
 */
public class BinaryExpression {

    /**
     * 表达式的左边
     */
    public SimpleExpression left;

    /**
     * 表达式的右边
     */
    public SimpleExpression right;

    /**
     * 运算符
     */
    public OperatorType operator;

    public BinaryExpression(SimpleExpression left, SimpleExpression right, OperatorType operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "BinaryExpression{" +
                "left=" + left +
                ", right=" + right +
                ", operator=" + operator +
                '}';
    }
}
