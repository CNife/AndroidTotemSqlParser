import generated.AndroidTotemSqlParser
import java.io.BufferedInputStream
import java.io.FileInputStream
import kotlin.system.exitProcess

fun testParse(name: String) {
    val fileName = "./sql/$name.sql"
    val inputStream = BufferedInputStream(FileInputStream(fileName))
    try {
        val statements = AndroidTotemSqlParser.parse(inputStream)!!
        for (statement in statements) {
            println(statement)
        }
    } catch (e: Exception) {
        e.printStackTrace()
        exitProcess(1)
    }
}

fun main() {
    testParse("select")
}