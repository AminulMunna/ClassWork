import  java.util.Scanner

fun main(args: Array<String>) {
    cal()
}

fun cal() {
    val sc = Scanner(System.`in`)

    print("Enter a year to check : ")
    val year = sc.nextInt()

    if (year != 0) {
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            println("${year} is a leap year")
        } else {
            println("${year} is not a leap year")
        }
    } else {
        println("Please enter a valid year")
    }

}



