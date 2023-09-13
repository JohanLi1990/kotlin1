package com.rsk.functions

class demo {

}

// return nothing
fun padding(original : String, numberToReplace: Int, replacementChar: Char) : String{

    val strToAdd = replacementChar.toString().repeat(numberToReplace)
    return original + strToAdd
}

fun main() {
    val original = "Kevin"
    val newStr = padding(original, 5, '&')
    println(newStr);
}
