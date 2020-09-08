class MemberFunction{
  //InLine function
    inline fun Wafaa(block: () -> Unit) {
        println("before")
        block()
        println("after")
    }


    //Lambda function

        fun Lambdacompare(a: String, b: String) {
            if (a.length < b.length) {
                println("true")
            }else{
                println("false")
            }
        }


// LocalFunction

    fun LocalFun(){

            println("Good LocalFun")

    }



}