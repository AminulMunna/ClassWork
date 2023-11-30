import java.util.Scanner

fun main(args: Array<String>) {

//    var a:Int=10
//    println(a)
//
//    var b=a.toDouble()
//    println(b)
//

//    var str:String="10"
//    println(str.toInt())
//    var ch:Char='a'
//    println(ch.toInt())

//    var bytee:Int=59000
//    var newByte:Byte=bytee.toByte()
//    println(newByte)

//    print("Enter Your first number a = ")
//    var a:Double= readLine()!!.toDouble()
//    print("Enter Your first number b = ")
//    var b:Double= readLine()!!.toDouble()
//
//    var sum=(a+b)
//    var sub=(a-b)
//    var mul=(a*b)
//    var div=(a-b)
//
//    println("Addition of a+b is = ${sum}")
//    println("Substraction of a=b is = ${sub}")
//    println("Multipliacation of a*b is = ${mul}")
//    println("Division of a/b is = ${div}")

    var reader = Scanner(System.`in`)
//
//        print("Enter Your first number a and b = ")
//    var a:Double=reader.nextDouble()
//    var b:Double= reader.nextDouble()
//
//    var sum=(a+b)
//
//    println("The sum of a and b is = ${sum}")

    print("enter a = ")
    var a = reader.nextInt()
    print("enter b = ")
    var b = reader.nextInt()
    print("enter c = ")
    var c = reader.nextInt()


//    if (a > b && a > c) {
//        println("a = ${a} is greater than b and c")
//    } else if (b > a && b > c) {
//        println("b = ${b} is grater than a and c")
//    } else if (a == b && a > c) {
//        println("a and b is grater than c ")
//    } else if (a == c && a > b) {
//        println("a and c is grater than b ")
//    } else if (b == c && b > a) {
//        println("b and c is grater than a ")
//    }else{
//        println("c = ${c} is grater than a and b")
//    }


    if (a > b && a > c) {
        println(" a is greater than b and c")
    } else if (b > a && b > c) {
        println("b is grater than a and c")
    } else if (c > a && c > b) {
        println("c is grater than a and b")
    } else if (a == b && a > c) {
        println("a and b are greater")
    } else if (a == c && b > a) {
        println("b and c are greater")
    } else {
        println("every item is equal")
    }


}