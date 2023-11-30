fun main(args: Array<String>) {
fabCal()
}
fun fabCal(){
    var a = 0
    var b = 1
    var n = 10

    for (i in 1..n) {
        print("$a ")//0---1--2
        var next = a + b//0+1=1---2--3
        a = b//a=1--2
        b = next//1--2
    }
}