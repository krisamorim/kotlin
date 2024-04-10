fun main() {
    //in this 1st situation kotlin doesn't allow receiving a null value
    var name = "Kris"
//    name = null//return an error
    var name2: String? = "Ana"
    name2 = null
    println(name2)
//    println(name.uppercase())
}