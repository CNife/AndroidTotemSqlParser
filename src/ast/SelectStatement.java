package ast;

import java.util.List;

public class SelectStatement implements Statement {

    public List<Projection> projections;
    public String className;
    public WhereClause whereClause;

    @Override
    public StatementType getType() {
        return StatementType.SELECT;
    }
}
