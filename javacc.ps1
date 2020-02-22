Remove-Item -Path ".\src\generated\*.java"

java -classpath "./lib/javacc-7.0.5.jar"`
    javacc `
        -JDK_VERSION="1.8" `
        -OUTPUT_DIRECTORY="./src/generated" `
        -IGNORE_CASE=true `
        -STATIC=false `
        AndroidTotemSqlParser.jj