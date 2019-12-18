package ast;

import java.util.List;

public class CrossClassProjection extends Projection {
    public List<String> classList;
    public String propertyName;

    @Override
    public Type getType() {
        return Type.CROSS_CLASS;
    }
}
