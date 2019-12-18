package ast;

import java.util.List;

public class CrossClassProjection extends Projection {
    public List<String> classList;
    public String propertyName;

    public CrossClassProjection(List<String> classList, String propertyName) {
        this.classList = classList;
        this.propertyName = propertyName;
    }

    @Override
    public Type getType() {
        return Type.CROSS_CLASS;
    }
}
