fun main(args: Array<String>) {
   print("enter a : ")
    var a = readln().toInt()
    print("enter b : ")
    var b = readln().toInt()

    println("choose your operator + - * / % : ")
    var operator = readln()

    var result = when (operator){
        "+"->{
            a+b
        }
         "-" ->{
            a-b
        }
        "*"->{
            a*b
        }
        "/"->{
            a/b
        }
        "%"->{
            a%b
        }
        else ->{
            "$operator is not valid"
        }
    }
    println("$result")


}