package com.rsk

/**
 * val arg, is a short hand for constructor
 * the attribute defined will be final and public
 */

/**
 * Classes Lesssons:
 *
 * Classes are used to model "isA" relationships
 */
open class Planet(name: String, val diameter: Long, val logger: Logger): SpaceBody(name) {
    /*
    how do we run code as part of the construction process?
    how to do dynamic initializations
    in Java you can do {} or static{}
     */
    val radius: Long
    open var population: Long = 0
    init{
        // called after the constructor is done
        println("we've been created: $name")
        radius = diameter / 2
    }

    /*
    Secondary constructor
     */
//    constructor(name: String, diameter: Long, gaseous: Boolean) : this(name, diameter)

    /*
    getter and setter implicit with earth.name
     */

    /*
    Method
     */

    open fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int) : Long {
        logger.debug("Starting the model")
        initPopulationRun(startDate, endDate, startPopulation)
        return population
    }

    private fun initPopulationRun(startDate: Int, endDate: Int, startPopulation: Int) {
        println("Do some work")
    }
}

/**
 * In Java, methods, and classes are open by default, we can extend and override
 * in Kotlin, mehtods and classes are sealed by default, we need to explicitly set them to open
 * to override
 */
class HabitablePlanet(name: String, diameter: Long, logger: Logger) : Planet(name, diameter, logger) {
    override var population: Long = 0;
    override fun runPopulationModel(startDate: Int, endDate: Int, startPopulation: Int) : Long {
        super.runPopulationModel(startDate, endDate, startPopulation)
        return 0
    }
}
/**
 * public classes, cannot do it in java
 * they will be compiled into different class files by kotlin
 */
abstract class SpaceBody(val name:String) {
    /**
     * force the sub classes to implement the contract
     */
//    abstract fun calculateMotion()
}