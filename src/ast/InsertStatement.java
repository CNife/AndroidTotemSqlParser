package ast;

import java.util.List;

/**
 * INSERT 语句
 */
public class InsertStatement implements Statement {

    /**
     * 操作的类名
     */
    public String className;

    /**
     * 插入的属性名列表
     */
    public List<String> propertyList;

    /**
     * 插入的属性值列表
     */
    public List<SimpleExpression> valueList;

    public InsertStatement(String className, List<String> propertyList, List<SimpleExpression> valueList) {
        this.className = className;
        this.propertyList = propertyList;
        this.valueList = valueList;
    }

    @Override
    public StatementType getType() {
        return StatementType.INSERT;
    }

    @Override
    public String toString() {
        return "InsertStatement{" +
                "className='" + className + '\'' +
                ", propertyList=" + propertyList +
                ", valueList=" + valueList +
                '}';
    }
}
