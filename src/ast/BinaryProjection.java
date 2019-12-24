package ast;

/**
 * 需要进行二元运算的投影
 */
public class BinaryProjection extends Projection {

    /**
     * 二元运算表达式
     */
    public BinaryExpression expression;

    public BinaryProjection(BinaryExpression expression) {
        this.expression = expression;
    }

    @Override
    public ProjectionType getType() {
        return ProjectionType.BINARY;
    }

    @Override
    public String toString() {
        return "BinaryProjection{" +
                "name='" + name + '\'' +
                ", expression=" + expression +
                '}';
    }
}
