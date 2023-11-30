fun main(args: Array<String>) {

    print("enter a number  : ")
    var a = readln().toInt()

    var fact=1
    for (i in 1 .. a){

        fact*=i
    }
    println("Factoral of ${a} is ${fact}")

}