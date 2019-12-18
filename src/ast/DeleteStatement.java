package ast;

public class DeleteStatement implements Statement {
    public String className;
    public WhereClause whereClause;

    @Override
    public StatementType getType() {
        return StatementType.DELETE;
    }
}
