import java.util.Scanner

fun main(args: Array<String>) {

    val sc=Scanner(System.`in`)
    var N=sc.nextInt()

    var rem = N % 3600
    var temp = N - rem
    val hours = temp /3600
    N = rem

    rem = N % 60
    temp = N - rem
    val min = temp /60
    N = rem

    val sec = rem

    println("${hours}:${min}:${sec}")
    //18

}