package ast;

public class SimpleProjection extends Projection {
    public String columnName;

    public SimpleProjection(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public Type getType() {
        return Type.SIMPLE;
    }
}
