fun main() {
    val name: String = "Kris"
    val nameAna = "Ana"
    val nameJhon = "Jhon"
    val nameOtherJhon = "Jhon"
    val nameJhontoCharArr = String("Jhon".toCharArray())

    println("The name '$name' has ${name.length} letters\nThe 1st letter is '${name[0]}'")
    println(name.uppercase())
    println(name.lowercase())
    println("---------------------------------------------------------------------\n")

    //compare strings
    println("Using ==: ${nameAna == nameJhon}")
    println("Using ==: ${nameJhon == nameOtherJhon}")
    println("Using ===: ${nameJhon === nameOtherJhon}")
    println("Using equals: ${nameJhon.equals(nameOtherJhon)}")
    println("---------------------------------------------------------------------\n")

    println("==: ${nameJhon} is equals to ${nameJhontoCharArr}: ${nameJhon == nameJhontoCharArr}")
    println("===: ${nameJhon} is equals to ${nameJhontoCharArr}: ${nameJhon === nameJhontoCharArr}") // === compare memory position





}