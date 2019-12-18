package ast;

public class BinaryProjection extends Projection {

    public String left;
    public Expression right;
    public OperatorType operator;

    public BinaryProjection(String left, Expression right, OperatorType operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public Projection.Type getType() {
        return Projection.Type.BINARY;
    }

    public enum OperatorType {
        ADD,
        MINUS,
        MULTIPLY,
        DIVIDE,
    }
}
