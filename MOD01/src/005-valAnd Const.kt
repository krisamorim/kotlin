//1st point is: const must be outsite de function
const val PI = 3.14

fun main() {
    val pi = 3.14
}

//2nd point is: not assign a value to a const with a function that be after its execution. This is just possible to a val

//const val pi2 = getPiValue() //as you can see return an error
val pi3 = getPiValue() //as you can see to val pi2 we can call the function
fun getPiValue(): Double = 3.14