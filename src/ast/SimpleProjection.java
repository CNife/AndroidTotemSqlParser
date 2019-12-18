package ast;

public class SimpleProjection extends Projection {
    public String columnName;

    @Override
    public Type getType() {
        return Type.SIMPLE;
    }
}
