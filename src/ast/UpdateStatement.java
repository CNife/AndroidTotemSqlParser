package ast;

public class UpdateStatement implements Statement {
    public String className;
    public String propertyName;
    public SimpleExpression propertyValue;
    public WhereClause whereClause;

    @Override
    public StatementType getType() {
        return StatementType.UPDATE;
    }
}
