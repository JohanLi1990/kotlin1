package com.rsk.dataclass

/**
 * Data Class overrid toString
 * hashCode, equals
 */
data class Person(val name: String, val age: Int) {
//    var age:Int = 0
//
//    override  fun toString():String{
//        return "Person(nam= $name, age = $age)"
//    }
}

/**
 * if we rome age from property we change hashcode and equals
 */
fun main() {
    val sam = Person("Sam", 31)

    /**
     * copy with arguments override
     */
    val samuel = sam.copy(age = 32)

    println("$sam has ${sam.hashCode()}")
    println("$samuel, has hashCode ${samuel.hashCode()}")

    /**
     * Destructuring the Data Class
     */

    if (sam.equals(samuel)){
        println("they are the same")
    }

    println("Samuel jhas the ${samuel.name} and the age ${samuel.age}")
    /**
     * This is so javascript
     */
    val(name, age) = samuel
    println("Samuel has the name $name and the age $age")

    /**
     * strctural comparison
     * calls .equal under the hood
     */
    if (sam == samuel) {
        println("they are the same")
    }

    /**
     * reference compariosn
     */

    if (sam !== samuel) {
        println("not equal")
    }
}




