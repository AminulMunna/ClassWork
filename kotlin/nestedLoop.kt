import java.util.Scanner

fun main(args: Array<String>) {
    var sc = Scanner(System.`in`)
    print("enter a year : ")
    var year = sc.nextInt()

    if (year % 2 == 0) {
        if (year % 400 == 0 || year !== 0 && year % 4 == 0) {
            println("${year} is leap year and even")
        } else {
            println("${year} is not leap year and even")
        }
    } else {
        if (year % 400 == 0 || year !== 0 && year % 4 == 0) {
            println("${year} is leap year and odd")
        } else {
            println("${year} is not leap year and odd")
        }
    }
}