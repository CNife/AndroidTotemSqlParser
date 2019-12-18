package ast;

import java.util.List;

public class CreateClassStatement implements Statement {
    public String className;
    public List<Property> propertyList;

    @Override
    public StatementType getType() {
        return StatementType.CREATE_CLASS;
    }
}
