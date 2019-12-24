package ast;

/**
 * WHERE 子句
 */
public class WhereClause {

    /**
     * 判断条件
     * 目前只支持单个逻辑二元表达式
     */
    public BinaryExpression expression;

    public WhereClause(BinaryExpression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "WhereClause{" +
                "expression=" + expression +
                '}';
    }
}
