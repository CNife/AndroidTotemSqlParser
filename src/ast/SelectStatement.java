package ast;

import java.util.List;

/**
 * SELECT 语句
 */
public class SelectStatement implements Statement {

    /**
     * 投影的列表
     */
    public List<Projection> projectionList;

    /**
     * 查询的类名
     */
    public String className;

    /**
     * WHERE 子句
     */
    public WhereClause whereClause;

    public SelectStatement(List<Projection> projectionList, String className, WhereClause whereClause) {
        this.projectionList = projectionList;
        this.className = className;
        this.whereClause = whereClause;
    }

    @Override
    public StatementType getType() {
        return StatementType.SELECT;
    }

    @Override
    public String toString() {
        return "SelectStatement{" +
                "projectionList=" + projectionList +
                ", className='" + className + '\'' +
                ", whereClause=" + whereClause +
                '}';
    }
}
