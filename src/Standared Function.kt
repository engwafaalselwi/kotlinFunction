
      //apply
      class StandradFunction (){
          var name = ""
          var grade = 0

          fun ExplainApply () {
              if(grade >= 50){
                  println("Your name is  $name  Your are acceptable ")
              }
              else {
                  println("We Are Sorry We Cant Accept you")
              }
          }


          fun ExplainLet (){
              var num = arrayOf(1,2,3).last().let{

                  println(it + it)
              }
          }


          fun ExplainRun(){
              var text = run {
                  println("Kotlin Doveloper")
              }
          }

          fun ExplainAlso(){
              var num = 2
              num = num.also { it + 1 }.also { it + 1 }
              println(num)
          }


          fun ExplainWith(StuName:String ,StuAge :Int ){
              println("Student Name is $StuName    Student Age is $StuAge")
          }


        data class Student (var garde : Int ){


        }
      fun ExplainTakeIf(){
          Student(70).takeIf {
              it.garde <= 80
          }?.apply {
              println("Excelent Student ")
          }?:run {
              println("Study Hard")
          }


      }


      }