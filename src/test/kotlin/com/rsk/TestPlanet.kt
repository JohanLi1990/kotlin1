package com.rsk

class TestPlanet {
    // Promising lateinit to define planet before any use
    lateinit var planet: Planet

    fun setup() {

    }

    fun test() {
        planet.population
    }
}