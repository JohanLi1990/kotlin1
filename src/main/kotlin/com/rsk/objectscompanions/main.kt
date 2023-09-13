package com.rsk.objectscompanions

fun main() {
    val windows = Window()
    windows.addMouseListener(object : MouseListener{
        override fun mouseClicked(e: MouseEvent) {

        }

        override fun mouseEntered(e: MouseEvent) {
        }

    })
}

class Window {
    fun addMouseListener(Listener : MouseListener) {}

}

interface MouseListener {
    fun mouseClicked(e: MouseEvent)
    fun mouseEntered(e: MouseEvent)
}

class MouseEvent {

}