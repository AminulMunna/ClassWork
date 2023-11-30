fun main(args: Array<String>) {
    val num = readln().toInt()

    for (i in 1..10) {
        val product = num * i
        println("$num * $i = $product")
    }
}