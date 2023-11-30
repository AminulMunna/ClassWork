fun main(args: Array<String>) {
    sumWithPar(10,5)
    sumWithPar(10,20)
    sumWithOutPar()
    println(returnTypeFunc(10,30))

}
fun sumWithPar(a:Int,b:Int){

    var sum=a+b
    println("$sum")

}
fun sumWithOutPar(){
    var a=10
    var b=50
    var sum=a+b
    println("$sum")

}
fun returnTypeFunc(x:Int,y:Int):Int{
    return x+y
}