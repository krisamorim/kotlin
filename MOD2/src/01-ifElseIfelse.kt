fun main() {
    val number = 30
    val number2 = 20
    val value = if (number<10 && number2<10){
        "N1:${number} and N2:${number2}\nBoth numbers are less than 10"
    }else if (number<10 && number2>10){
        "N1:${number} and N2:${number2}\nJust 1st number is less than 10"
    }else if (number>10 && number2>10){
        "N1:${number} and N2:${number2}\nBoth are more than 10"
    }else{
        "N1:${number} and N2:${number2}\nJust 2nd number is greater than 10"
    }
    println(value)
}