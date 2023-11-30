import java.util.*

fun main(args: Array<String>) {

    var sc = Scanner(System.`in`)
    print("a(0 to 9) = ")
    var a = sc.nextInt()
    print("b(0 to 9) = ")
    var b = sc.nextInt()
    print("c (0 to 9) = ")
    var c = sc.nextInt()

    if (a>=0 && a<=10 && b>=0 && b<=10 && c>=0 && c<=10){
        var l = (a + b * c)
        var m = a * (b + c)
        var n = (a * b * c)
        var o = (a + b) * c

        if (l > m && l > n && l > o) {
            println(("a + b * c)= ${l}"))
        } else if (m > l && m > n && m > o) {
            println(" a * (b + c) = ${m}")
        } else if (n > l && n > m && n > o) {
            println("(a * b * c) = ${n}")
        } else {
            println("(a + b) * c = ${o}")
        }

    }else{
        println("Error Number")
    }



//    println(l)
//    println(m)
//    println(n)
//    println(o)



}