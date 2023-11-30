fun main(args: Array<String>) {

    for(i in 1..7 step 2) {
        for(j in i..7  ) {
            print("#")
        }
        for(k in 1..i) {
                print("* ")
        }
        println()
    }
}
