package ast;

public class Expression {
    public PropertyType type;
    private Object value;

    public Expression(Object value) {
        this.value = value;
    }

    public String getString() {
        return (String) value;
    }

    public int getInt() {
        return (Integer) value;
    }
}
