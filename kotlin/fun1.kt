fun main(args: Array<String>) {
    sum()
    sub()
    mul()
    div()
    name()
    rec()


}


fun sum() {
    var num1 = 4
    var num2 = 3
    var add = num1 + num2
    println("sum=$add")
}

fun sub() {
    var num1 = 4
    var num2 = 3
    var sub = num1 - num2
    println("sub=$sub")
}

fun mul() {
    var num1 = 4
    var num2 = 3
    var mul = num1 * num2
    println("mul=$mul")
}

fun div() {
    var num1 = 4
    var num2 = 3
    var div = num1 / num2
    println("div=$div")
}
//fun name() {
//    var names = arrayOf("Aminul", "Islam","Munna")
//    var count = 0
//    while (count < names.size) {
//        println(names[count])
//        count++
//    }
//}

fun name() {
    var names = arrayOf("Aminul","Islam","Munna")
    for (i in names) {
        println(i)
    }
}
var count=0
fun rec(){
    count++
    if (count<=5){
        println("hello"+count)
        rec()
    }
}