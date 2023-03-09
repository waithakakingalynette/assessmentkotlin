fun main() {
    var string1="I am awesome"
    var string2="My name is lynette "
    if (string1.equals(string2)){
        println(longArrayOf())
    }else
        println(shortArrayOf())
    word()
    var names="Gisemba ,Nathalie ,Lynette"
    var names2=names.plus("Pauline, Annet, Eunice")
    println(names2)
    numbers(12)



}

//1. Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
     fun stmt(string1:String,string2: String){
         var string1="I am awesome"
         var string2="My name is lynette "
    if (string1.equals(string2)){
        println(longArrayOf())
    }else
        println(shortArrayOf())
     }

//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun numbers(number: Int){
    var num = arrayOf(12,33,158,458,57)
    num.average()
    println(num.average())
    num.min()
    println(num.min())
    num.max()
    println(num.max())
}
//3. Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.
 fun word(){
     var stmt="awesome"
    println("awesome"[0])
    println("awesome"[1])
    println("awesome"[2])
    println("awesome"[3])
    println("awesome"[4])
    println("awesome"[5])
    println("awesome"[6])
 }
//4. Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
  fun array(names:String,names2:String):String{
      var names="Gisemba ,Nathalie ,Lynette"
    var names2=names.plus("Pauline, Annet, Eunice")
    println(names2)
    return names2
  }
//5. Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions
class calculator(var num1:Int,var num2:Int){
    var calc=calculator(30,24)
    fun addition(){
        var sum=num1+num2
    }
    fun subtraction(){
        var minus=num1-num2
    }
    fun average(){
        var ave=num1/num2
        println(average())
    }
    fun multiplication(){
        var multiply=num1*num2
        }
    }


