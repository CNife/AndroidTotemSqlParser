package ast;

import java.util.List;

public class CreateDeputyStatement implements Statement {
    public String className;
    public List<Property> propertyList;
    public SelectStatement selectFrom;

    @Override
    public StatementType getType() {
        return StatementType.CREATE_DEPUTY;
    }
}
