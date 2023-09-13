package com.rsk.otherclass


/**
 * Sealed Classes
 * - Used to create restricted class hierarchies
 * - Provide more control over inheritance
 * - All subclasses are known at compile time
 * - All subclasses in same module as sealed class
 * Similar to enums
 * - But can have instances of sealed class
 * - With its own state
 */
sealed class PersonEvents(val id : Int){

    class Awake(id: Int) : PersonEvents(id)
    class Asleep(id: Int) : PersonEvents(id)
    class Eating(val food:String, id: Int) : PersonEvents(id)
}
class Cooking(id:Int):PersonEvents(id)

fun main() {
    var evt = PersonEvents.Asleep(1)
    var evt1 = PersonEvents.Eating("Nuts",23)
    handlePersonEvent(evt);
}

fun handlePersonEvent(evt: PersonEvents) {
    when(evt){
        is PersonEvents.Asleep -> {
            println("Asleep: ${evt.id}")
        }
        is PersonEvents.Awake -> {}
        is Cooking -> {}
        is PersonEvents.Eating -> {
            // compiler knows evet is Eating
            println("Eating: ${evt.id}, ${evt.food}")
        }
    }
}