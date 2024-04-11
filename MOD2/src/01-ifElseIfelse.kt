fun main() {
    val number = 30
    val number2 = 20
    if (number<10 && number2<10){
        print("N1:${number} and N2:${number2}\nBoth numbers are less than 10")
    }else if (number<10 && number2>10){
        print("N1:${number} and N2:${number2}\nJust 1st number is less than 10")
    }else if (number>10 && number2>10){
        print("N1:${number} and N2:${number2}\nBoth are more than 10")
    }else{
        print("N1:${number} and N2:${number2}\nJust 2nd number is greater than 10")
    }
}