package ast;

public enum PropertyType {
    UNKNOWN,
    INT,
    CHAR;

    public static PropertyType typeOf(String input) {
        switch (input.toLowerCase()) {
            case "int":
                return INT;
            case "char":
                return CHAR;
            default:
                return UNKNOWN;
        }
    }
}
