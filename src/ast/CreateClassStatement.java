package ast;

import java.util.List;

/**
 * CREATE CLASS 语句
 */
public class CreateClassStatement implements Statement {

    /**
     * 类名
     */
    public String className;

    /**
     * 类属性列表
     */
    public List<Property> propertyList;

    public CreateClassStatement(String className, List<Property> propertyList) {
        this.className = className;
        this.propertyList = propertyList;
    }

    @Override
    public StatementType getType() {
        return StatementType.CREATE_CLASS;
    }

    @Override
    public String toString() {
        return "CreateClassStatement{" +
                "className='" + className + '\'' +
                ", propertyList=" + propertyList +
                '}';
    }
}
