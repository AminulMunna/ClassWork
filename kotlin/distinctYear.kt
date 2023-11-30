import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    println("Enter Year: ")
    val year = sc.nextInt()

    if (year in 1000..9000) {
        var nextYear=year+1
        while(!isDistinct(nextYear)) {
            nextYear ++
        }
        println(nextYear)
    }
}
fun isDistinct(year: Int):Boolean{
    val digits=year.toString().toCharArray()
    for (i in digits.indices){
        for (j in i+1 until digits.size){
            if (digits[i]==digits[j]){
                return false
            }
        }
    }
    return true
}




