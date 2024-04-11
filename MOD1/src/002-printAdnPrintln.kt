
fun main() {

    print("Hello ") //without break line
    println("World")
    println("---------------------------------------------------------")

    println("Hello ")//with break line
    println("world")
    println("---------------------------------------------------------")


    val name: String = "Kris"
    println("The name '$name' has ${name.length} letters\nThe 1st letter is '${name[0]}'")
    println("---------------------------------------------------------")

    val toPrint = """
        Hello
        World
    """.trimIndent()
    println(toPrint)
    println("---------------------------------------------------------")

    val toPrint2 = """
        Hello %s 
          How are you
    """.trimIndent()
    println(toPrint2.format("Ana"))
    println("---------------------------------------------------------")

}
