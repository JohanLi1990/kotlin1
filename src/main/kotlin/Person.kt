abstract class Person(var firstname:String, var lastname:String) {

    open fun getName() : String = "$firstname $lastname"
    abstract fun getAddress() : String

}

class Student(val id : Int, firstname: String, lastname: String, var tutor: String = "") : Person(firstname, lastname) {
    override fun getName(): String = ""
    override fun getAddress(): String {
        return "";
    }

    fun enroll(courseName: String) {
        val course = Courses.allCourses.firstOrNull { it.Title == courseName }

    }
}

fun main(args: Array<String>) {
    val kevin = Student(1, "Kevin", "Jones", "Chenyang");
    println(kevin.id)

    var st1 = Child(1, "cuy")
    var st2 = Child(1, "cuy")

    println(st1)
    if (st1 == st2) {
        println("Equal")
    }

    st2 = st2.copy(lastname = "Robert")
    println(st2)

}

data class Child(val id: Int, val lastname: String)
