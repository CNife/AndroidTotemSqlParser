package ast;

/**
 * SELECT 语句中的投影
 */
public abstract class Projection {

    /**
     * AS 子句定义的名字
     * 如果没有 AS 子句就为 null
     */
    public String name;

    public abstract ProjectionType getType();
}
