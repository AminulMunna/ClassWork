import java.util.Scanner

fun main(args: Array<String>) {
    grade()
}
fun grade(){
    var inp = Scanner(System.`in`)

    print("enter your number : ")
    val yourGrade: Double = inp.nextDouble()

    if (yourGrade >= 90 && yourGrade <= 100) {
        println("you got GPA 5 and grade is A+")
    } else if (yourGrade >= 80 && yourGrade <= 89) {
        println("you got GPA 4.5 and grade is A")
    } else if (yourGrade >= 70 && yourGrade <= 79) {
        println("you got GPA 4 and grade is B")
    } else if (yourGrade >= 60 && yourGrade <= 69) {
        println("you got GPA 3.5 and grade is C")
    } else if (yourGrade >= 50 && yourGrade <= 59) {
        println("you got GPA 3.00 and grade is D")
    } else if (yourGrade >= 40 && yourGrade <= 49) {
        println("you got GPA 2.5 and grade is E")
    } else if (yourGrade <= 39 && yourGrade >= 0) {
        println("you have failed")
    } else {
        println("Error number!Enter a valid number between 0 to 100")
    }
}