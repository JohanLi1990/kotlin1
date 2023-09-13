package com.rsk

/**
 *  Interface lessons
 *  - Similar to Abstract Classes
 *  - Generally purly abstract
 *      - although can have default implementations
 *  - Cannot store state
 *
 *  IMPORTANT:
 *  Interface used to model Actions,
 *  it is used to model "hasA" relationships
 *  e.g.
 *  - A Person 'hasA' Logger calls
 *  - A Planet 'hasA' DatabaseConnection
 *
 */
interface Logger {
    fun debug(message: String)

    fun info(message: String)
}

class StdoutLogger : Logger {
    override fun debug(message: String) {
        println(message)
    }

    override fun info(message: String) {
        println(message)
    }

}

class NullLogger : Logger {
    override fun debug(message: String) {
        TODO("Not yet implemented")
    }

    override fun info(message: String) {
        TODO("Not yet implemented")
    }

}