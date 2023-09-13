package com.rsk.objectscompanions

class companionObject {
}

class Invoice {

    companion object Logger {
        fun debug(message: String) {
            println("$this  $message")
        }
    }

    fun calculate() {
//        Logger.debug("Calculating invoice")
        debug("Calculating invoice")
    }
}

fun main() {
    val invoice = Invoice()
    invoice.calculate()

    val invoice2 = Invoice()
    invoice2.calculate()

    /*
    Companion object looks like static, but it is not really static. if
    static , needs to use JvnStatic annotations
     */
    Invoice.debug("Like a static")
}