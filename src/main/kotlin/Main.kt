fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val q = Question()
    q.ans = "42"
    q.display()

    for (i in 1..10) {
        println(i);
    }
}

class Question{
    var ans:String = ""

    fun display(){
        println("You said $ans")
    }

}