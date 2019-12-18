package ast;

public class DropStatement implements Statement {
    public String className;

    @Override
    public StatementType getType() {
        return StatementType.DROP;
    }
}
