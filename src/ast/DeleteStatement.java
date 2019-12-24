package ast;

/**
 * DELETE 语句
 */
public class DeleteStatement implements Statement {

    /**
     * 要操作的类名
     */
    public String className;

    /**
     * WHERE 子句
     */
    public WhereClause whereClause;

    public DeleteStatement(String className, WhereClause whereClause) {
        this.className = className;
        this.whereClause = whereClause;
    }

    @Override
    public StatementType getType() {
        return StatementType.DELETE;
    }

    @Override
    public String toString() {
        return "DeleteStatement{" +
                "className='" + className + '\'' +
                ", whereClause=" + whereClause +
                '}';
    }
}
