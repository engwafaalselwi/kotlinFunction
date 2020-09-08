fun main(){
    //Standrd Function
    // apply
    println("The OutPut Standrad Functions")
    println("***********************************")
    StandradFunction().apply{
        name = "Ali"
        grade =90
        ExplainApply()
    }

    //let
    var info = StandradFunction()
    info.ExplainLet()

    //run
    info.ExplainRun()

    //also
    info.ExplainAlso()

    //With
    with(info){
        ExplainWith("Wafaa" , 25)
    }

    //TakeIf
     var Stu = StandradFunction.Student(80)
    info.ExplainTakeIf()

    println("The OutPut Infix Functions")
    println("***********************************")
    //Infix Standrd Function
     var Infix = InfixFunction()
    Infix.StandradInfixFunction()
    Infix.UserDefinedInfixFunction(20)

    println("The OutPut Member Functions")
    println("***********************************")

    // MemberLine Function
    var member = MemberFunction()
    member.Wafaa {"In line Function"}

    //MemerlambdaFunction
    member.Lambdacompare("wafaa","ali")

    //MemberLocalFunction
    member.LocalFun()

    //Anonymous Function
     var UserDefind = Anonymous ()
    UserDefind.Explicit("Ahmed")

    UserDefind.TypeInterface()


}