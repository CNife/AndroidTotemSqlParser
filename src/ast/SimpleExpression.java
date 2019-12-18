package ast;

public class SimpleExpression {
    int intValue;
    String stringValue;

    public SimpleExpression(int value) {
        this.intValue = value;
    }

    public SimpleExpression(String value) {
        this.stringValue = value;
    }
}
