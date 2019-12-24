package ast;

import java.util.List;

/**
 * UPDATE 语句
 */
public class UpdateStatement implements Statement {

    /**
     * 操作的类名
     */
    public String className;

    /**
     * 更新的属性列表
     */
    public List<String> propertyNameList;

    /**
     * 更新的属性值
     */
    public List<SimpleExpression> propertyValueList;

    /**
     * WHERE 子句
     */
    public WhereClause whereClause;

    public UpdateStatement(String className, List<String> propertyNameList, List<SimpleExpression> propertyValueList, WhereClause whereClause) {
        this.className = className;
        this.propertyNameList = propertyNameList;
        this.propertyValueList = propertyValueList;
        this.whereClause = whereClause;
    }

    @Override
    public StatementType getType() {
        return StatementType.UPDATE;
    }

    @Override
    public String toString() {
        return "UpdateStatement{" +
                "className='" + className + '\'' +
                ", propertyNameList=" + propertyNameList +
                ", propertyValueList=" + propertyValueList +
                ", whereClause=" + whereClause +
                '}';
    }
}
