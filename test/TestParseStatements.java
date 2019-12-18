import generated.AndroidTotemSqlParser;

import java.io.ByteArrayInputStream;

public class TestParseStatements {
    public static void main(String[] args) {
        String[] cases = {
                "SELECT\n  id,\n  name,\n  price\nFROM product;",
                "SELECT\n  name AS name,\n  (price / 7) AS usprice\nFROM product\nWHERE\n  price > 5000;",
                "SELECT\n  id AS id,\n  (price * 15) AS jpprice\nFROM product\nWHERE\n  price <= 7000;",
                "SELECT\n  jpproduct -> product -> usproduct.sales,\n  jpproduct -> product -> usproduct.name\nFROM jpproduct\nWHERE\n  id = 2;"
        };
        for (String ts : cases) {
            ByteArrayInputStream in = new ByteArrayInputStream(ts.getBytes());
            try {
                AndroidTotemSqlParser.parse(in);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
