package ast;

/**
 * 只选择列的简单投影
 */
public class SimpleProjection extends Projection {

    /**
     * 列名
     */
    public String columnName;

    public SimpleProjection(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public ProjectionType getType() {
        return ProjectionType.SIMPLE;
    }

    @Override
    public String toString() {
        return "SimpleProjection{" +
                "name='" + name + '\'' +
                ", columnName='" + columnName + '\'' +
                '}';
    }
}
