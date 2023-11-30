import java.util.*

fun main(args: Array<String>) {
                    //2
//    var sc=Scanner(System.`in`)
//    var R=sc.nextDouble()
//
//    var π:Double =3.14159
//    var A = π*R*R
//
//    val formattedValue:String=String.format("%.4f",A)
//    println("A=${formattedValue}")

                    //3
//    var sc=Scanner(System.`in`)
//    var A=sc.nextInt()
//    var B=sc.nextInt()
//
//    var SOMA = A+B
//
//     println("SOMA = ${SOMA}")
                    //4
//    var sc=Scanner(System.`in`)
//    var A=sc.nextInt()
//    var B=sc.nextInt()
//
//    var PROD = A*B
//
//    println("PROD = ${PROD}")
                //5
//    var sc=Scanner(System.`in`)
//    var A=sc.nextFloat()
//    var B=sc.nextFloat()
//    var MEDIA =(A*3.5+B*7.5)/(3.5+7.5)
//
//    val formattedValue:String=String.format("%.5f",MEDIA)
//    println("MEDIA = ${formattedValue}")
    //6
//    var sc=Scanner(System.`in`)
//    var A=sc.nextDouble()
//    var B=sc.nextDouble()
//    var C=sc.nextDouble()
//    var MEDIA =(A*2+B*3+C*5)/3
//
//    val formattedValue:String=String.format("%.1f",MEDIA)
//    println("MEDIA = ${formattedValue}")
//                //7
//    var sc=Scanner(System.`in`)
//    var A=sc.nextInt()
//    var B=sc.nextInt()
//    var C=sc.nextInt()
//    var D=sc.nextInt()
//    var DIFERENCA =((A*B)-(C*D))
//
//    println("DIFERENCA = ${DIFERENCA}")

    //8
//    var sc=Scanner(System.`in`)
//    var number=sc.nextInt()
//    var hours =sc.nextInt()
//    var amount =sc.nextFloat()
//
//    var SALARY =(hours*amount)
//
//    val formattedValue:String=String.format("%.2f",SALARY)
//
//    println("NUMBER =  ${number}")
//    println("SALARY = U$ ${formattedValue}")
    //9
    var sc=Scanner(System.`in`)
    var name= sc.next()
    var salary  =sc.nextDouble()
    var sold  =sc.nextDouble()

    var soldPercentage =(sold*15)/100
    var total =soldPercentage+salary

//    val formattedValue:String=String.format("%.2f",total)

//    println("${name}")
//    println("TOTAL = R$ ${formattedValue}")
    println({"TOTAL = R$ %2f".format(total)})

}
