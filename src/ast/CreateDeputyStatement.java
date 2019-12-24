package ast;

import java.util.List;

/**
 * CREATE CLASS SELECTDEPUTY 语句
 */
public class CreateDeputyStatement implements Statement {

    /**
     * 代理类名
     */
    public String className;

    /**
     * 代理类的实属性列表
     */
    public List<Property> propertyList;

    /**
     * 源类名
     */
    public String originClassName;

    /**
     * 虚属性列表
     */
    public List<Projection> virtualPropertyRuleList;

    /**
     * WHERE 子句
     */
    public WhereClause whereClause;

    public CreateDeputyStatement(String className, List<Property> propertyList, SelectStatement selectFrom) {
        this.className = className;
        this.propertyList = propertyList;
        this.originClassName = selectFrom.className;
        this.virtualPropertyRuleList = selectFrom.projectionList;
        this.whereClause = selectFrom.whereClause;
    }

    @Override
    public StatementType getType() {
        return StatementType.CREATE_DEPUTY;
    }

    @Override
    public String toString() {
        return "CreateDeputyStatement{" +
                "className='" + className + '\'' +
                ", propertyList=" + propertyList +
                ", originClassName='" + originClassName + '\'' +
                ", virtualPropertyRuleList=" + virtualPropertyRuleList +
                ", whereClause=" + whereClause +
                '}';
    }
}
