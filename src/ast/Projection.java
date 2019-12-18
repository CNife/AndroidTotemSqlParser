package ast;

public abstract class Projection {

    public String name;

    public abstract Type getType();

    public enum Type {
        SIMPLE,
        BINARY,
        CROSS_CLASS,
    }
}
