Remove-Item -Path ".\src\generated\*.java"

java -classpath "C:\Code\javacc-6.0\bin\lib\javacc.jar" `
    javacc `
        -JDK_VERSION="1.8" `
        -OUTPUT_DIRECTORY="./src/generated" `
        -IGNORE_CASE=true `
        -STATIC=false `
        -DEBUG_PARSER=true `
        AndroidTotemSqlParser.jj