package ast;

public class BinaryProjection extends Projection {

    public String left;
    public Expression right;
    public OperatorType operator;

    @Override
    public Type getType() {
        return Type.BINARY;
    }

    public enum OperatorType {
        ADD,
        MINUS,
        MULTIPLY,
        DIVIDE,
    }
}
