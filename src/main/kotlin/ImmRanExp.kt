class ImmRanExp {

}

fun main() {
    /*
    If Statement
     */

    val a = 23
    val b = 10
    val min = if (a < b) a else b;

    /*
    Exceptions: RuntimeExceptions, Application Exceptions
    Unchecked : RuntimeException, cannot be monitored JVM
    Checked: App exception, you have to monitor JVM

    in Kotlin, all exceptions are unchecked
     */

    val nums :Array<Int> = arrayOf(5)
    try {
        val num = nums[1]
    } catch (t : Throwable) {
        println(t.message)
    }
    try {
        throwException()
    } catch (e : Throwable) {
        println(e.message)
    } finally {
        println("Inside finally")
    }

    /*
    Try Expressions
     */
    val nums1 = arrayOf(1)
    val ans = try {
        nums[1]
    } catch (t : Throwable) {
        0
    }
    println("answer is $ans")

    /*
    While loop
     */

    var count = 8;
    while(count > 2) {
        println(count--)
        // break and continue, straight forward
        if (count == 3) continue
    }

    do {
        println(count--)
    }while(count > 1)

    // while with label, useful
    var outer = 5
    var inner = 5
    outer@ while(outer > 1) {
        outer--
        while( inner > 1) {
            inner--
            if (outer == 3) {
                break@outer
            }
            println("Values are $outer and $inner")
        }
    }

    /*
    For Loop
     */
    val people = HashMap<String, Int>()
    people["sam"] = 31
    people["alex"] = 31

    for ((name, age) in people) {
        // no need to use entry like java, use destructuring
        println("$name is $age")
    }

    /*
    When statement
     */

    val num6 = 7;
    val isNumSix = when(num6) {
        6 -> true
        else -> false
    }
    val validNum = 1..5
    when(num6) {
        !in validNum -> println("Not in valid")
        in 1..10 -> println("Num is in range")
        else -> println("Num is not in range")
    }

    println("nums is $num6 and isNumSix is $isNumSix")

    val someBool = false
    when(someBool) {
        true -> println("true")
        false -> println("false")
    }

    val color = Colors.BLUE
    when(color) {
        Colors.BLUE -> println("Blue")
        Colors.RED -> println("RED")
        Colors.GREEN -> println("GREEN")
    }


}

enum class Colors{
    RED, GREEN, BLUE
}

private fun overArray(nums: Array<Int>) {
    /*
    For loop
     */

    var nums3 = arrayOf(1, 5, 6, 67, 7)
    for (num in nums3) {
        //
    }

    for ((index, num) in nums.withIndex()) {
        println("Number: $num at $index")
    }
}

private fun ranges() {
    /*
    For Loop Ranges
     */

    var numbers = 1..10
    var chars = 'a'..'b'
    for (i in 1..10) {
        println("i is $i")
    }
    for (i in 1..10 step 2) {
        println("(step)i is $i")
    }

    for (i in 10 downTo 1) {
        println("down i is $i")
    }

    for (i in 1 until 10) {
        println("until i is $i")
    }
}

fun throwException() {
    throw Exception()
}
