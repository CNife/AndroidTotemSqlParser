package ast;

import java.util.List;

/**
 * 跨类查询投影
 */
public class CrossClassProjection extends Projection {

    /**
     * 跨类查询的各个类
     * 按语句中声明的顺序排列
     */
    public List<String> classList;

    /**
     * 查询的属性
     */
    public String propertyName;

    public CrossClassProjection(List<String> classList, String propertyName) {
        this.classList = classList;
        this.propertyName = propertyName;
    }

    @Override
    public ProjectionType getType() {
        return ProjectionType.CROSS_CLASS;
    }

    @Override
    public String toString() {
        return "CrossClassProjection{" +
                "name='" + name + '\'' +
                ", classList=" + classList +
                ", propertyName='" + propertyName + '\'' +
                '}';
    }
}
