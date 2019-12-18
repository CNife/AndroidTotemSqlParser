package ast;

import java.util.List;

public class InsertStatement implements Statement {
    public String className;
    public List<String> propertyList;
    public List<Expression> valueList;

    @Override
    public StatementType getType() {
        return StatementType.INSERT;
    }
}
