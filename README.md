# Android 端 Totem 数据库 SQL 解析器

蔡涛，2019 年 12 月

`AndroidTotemSqlParser.jj` 是 JavaCC 语法规则文件。

`javacc.ps1` 是编译 JavaCC 规则文件的脚本，需要把第 3 行中的 JavaCC 路径改成本地实际的路径。

`src/ast` 定义接口。

`src/generated` JavaCC 生成的解析器。

`src/test/TestParseStatements.kt` 是测试代码。