fun main(args: Array<String>) {




    println("enter a : ")
    var a = readln().toInt()
    println("enter b : ")
    var b = readln().toInt()

    var c = a
    a=b
    b=c
    println(a)
    println(b)

}