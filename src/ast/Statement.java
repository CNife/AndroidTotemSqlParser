package ast;

public interface Statement {

    StatementType getType();

    enum StatementType {
        CREATE_CLASS,
        CREATE_DEPUTY,
        DELETE,
        DROP,
        INSERT,
        SELECT,
        UPDATE,
    }
}
