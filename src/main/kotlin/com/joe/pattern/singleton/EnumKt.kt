package com.joe.pattern.singleton

/**
 * @author joe ho
 * @date 2023/6/29 17:50
 */
enum class EnumKt {
    INSTANCE;

    fun doSomething() = println("$this :doSomething")
}

fun main() {
    EnumKt.INSTANCE.doSomething()
}