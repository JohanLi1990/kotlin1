package com.rsk.otherclass


/**
 * Nested classes and Inner Clasess
 *
 * class Outer {
 *  class Nested {
 *      val name : String = "Kevin"
 *      fun doSomething() {
 *          println(name)
 *      }
 *  }
 *
 * }
 * // nested has no acess to outer data
 * val nested = Outer.Nested()
 * nested.doSomething()
 */
class InnerClass {
}
/**
 * class Outer{
 *  val name: String = "Kevin"
 *      inner class Inner {
 *      }
 *  }
 *
 *  inner keyword, has access to out class
 */