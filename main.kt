class op(){
    fun add(n1:Int,n2:Int){
        println(n1+n2)
    }

    fun sub(n1:Int,n2:Int){
        println(n1-n2)
    }

    fun div(n1:Int,n2:Int){
        println(n1/n2)
    }

    fun mul(n1:Int,n2:Int){
        println(n1*n2)
    }

}
fun main(args:Array<String>){
    println("Enter operation + - / * ")
    var opt:String = readLine()!!.toString()
    var op = op()
    if(opt == "+"){
        print("Enter num1: ")
        var num1:Int = readLine()!!.toInt()
        print("Enter num2: ")
        var num2:Int = readLine()!!.toInt()
        op.add(num1,num2)
    }else if(opt == "-"){
        print("Enter num1: ")
        var num1:Int = readLine()!!.toInt()
        print("Enter num2: ")
        var num2:Int = readLine()!!.toInt()
        op.sub(num1,num2)
    }else if(opt == "/"){
        print("Enter num1: ")
        var num1:Int = readLine()!!.toInt()
        print("Enter num2: ")
        var num2:Int = readLine()!!.toInt()
        op.div(num1,num2)
    }else if(opt == "*"){
        print("Enter num1: ")
        var num1:Int = readLine()!!.toInt()
        print("Enter num2: ")
        var num2:Int = readLine()!!.toInt()
        op.mul(num1,num2)
    }else{
        println("Idiot use some human operation next time")
    }
}
