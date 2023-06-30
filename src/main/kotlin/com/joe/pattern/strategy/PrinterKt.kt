package com.joe.pattern.strategy

fun lowerPrintKt(arg: String) {
    println(arg.lowercase())
}

fun upperPrintKt(arg: String) {
    println(arg.uppercase())
}

/**
 * @author joe ho
 * @date 2023/6/29 17:12
 */
class PrinterKt(private val strategy: (arg: String) -> Unit) {
    fun print(arg: String) {
        strategy(arg)
    }
}

fun main() {
    val arg = "Hello World!"
    PrinterKt(::lowerPrintKt).print(arg)
    PrinterKt(::upperPrintKt).print(arg)
}