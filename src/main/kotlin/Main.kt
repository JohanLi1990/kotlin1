fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val q = Question()
    q.ans = "42"
    q.display()

    for (i in 1..10) {
        println(i)
    }

    /**
     * var can be reassigned, val is final cannot be reassigned
     */
    val a = 23
    val b = 24
    val c : Short = 12313
    val l : Long = 3_400_444_333
    val d = 30.12

    val n = 8L
    val h = 0xff
    val res = 48/23.toDouble()
    println(res)

    /*
    Array
     */

    val arr = intArrayOf(1, 2, 3, 4, 5)
    val arr1 = arrayOf("Kevin", "Jones") // type inference

    /*
    String Template
     */

    val name = "Kevin"
    val age = 47
    println("Name is $name and age is $age")
    println("Name is ${name.uppercase()} and age is $age")

    /*
    Conditionals
     */
    val count = 6
    // if else if else
    // no switch statement, using when expression

    when(count) {
        1 -> {
            println("Count is 1")
        }
        3 -> {
            println("Count is 3")
        }
        else -> {
            println("Count is unexpected")
        }
    }


}

class Question{
    var ans:String = ""

    fun display(){
        println("You said $ans")
    }

}