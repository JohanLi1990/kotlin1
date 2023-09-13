package com.rsk

import java.lang.IllegalArgumentException

fun main() {
    println("Started...")
    val logger = StdoutLogger()
//    val logger = NullLogger() --- will do nothing
    val earth = Planet("Earth", 123123, logger)

    println("Planet created. Name is ${earth.name} " +
            "and its diameter is ${earth.radius} ")

    earth.population = 7_000_000_000
    println("Planet created. Name is ${earth.name} " +
            "and its diameter is ${earth.radius} " +
            "and its population is ${earth.population}")

    val newPopulation = earth.runPopulationModel(0, 1000, 100)

    /*
    Inline Classes
     */
    var exam = Exam();

    exam.score("luca", Score(-1))

}

/**
 * Sometimes it is necessary for business logic to create a wrapper around some type. However, it introduces runtime overhead due to additional heap allocations. Moreover, if the wrapped type is primitive, the performance hit is terrible, because primitive types are usually heavily optimized by the runtime, while their wrappers don't get any special treatment.
 *
 * To solve such issues, Kotlin introduces a special kind of class called an inline class. Inline classes are a subset of value-based classes. They don't have an identity and can only hold values.
 *
 * To declare an inline class, use the value modifier before the name of the class:
 *
 * see link: https://kotlinlang.org/docs/inline-classes.html
 */
@JvmInline
value class Score(val score: Int){
    init {
        if (score < 0 || score > 100) throw IllegalArgumentException("score cannot be $score")
    }
}
class Exam {
    fun score(name: String, studentScore: Score) {

    }

    fun amendScore(id: Int, newScore: Score) {

    }
}