package ast;

/**
 * DROP 语句
 */
public class DropStatement implements Statement {

    /**
     * 删除的表名
     */
    public String className;

    public DropStatement(String className) {
        this.className = className;
    }

    @Override
    public StatementType getType() {
        return StatementType.DROP;
    }

    @Override
    public String toString() {
        return "DropStatement{" +
                "className='" + className + '\'' +
                '}';
    }
}
