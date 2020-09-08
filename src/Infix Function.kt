class InfixFunction {
      fun StandradInfixFunction () {
          infix fun Int.add(b: Int): Int = this + b
          val x = 10.add(20)
          val y = 10 add 20

          println("The value of X is : $x   The value of Y is : $y")
      }

      fun UserDefinedInfixFunction(x: Int) {
          println( 2 * x )
      }

}