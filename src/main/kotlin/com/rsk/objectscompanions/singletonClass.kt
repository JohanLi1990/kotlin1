package com.rsk.objectscompanions

class singletonClass {
}

object Logger {
    fun debug(message : String) {
        println("** debug :$this $message")
    }

    fun info(message : String) {
        println("** info: $message")
    }
}

class Person {
    fun doWork() {
        Logger.debug("some message")
    }
}

fun main() {
    val Kevin = Person()
    Kevin.doWork()

    val Terry = Person()
    Terry.doWork()
}