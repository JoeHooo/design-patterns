package com.joe.pattern.singleton

/**
 * @author joe ho
 * @date 2023/6/29 17:12
 */
class Lazy private constructor() {
    companion object {
        val instance: Lazy by lazy(LazyThreadSafetyMode.PUBLICATION) { Lazy() }
    }

    fun doSomething() = println("${this.javaClass.simpleName} :doSomething")
}

fun main() {
    Lazy.instance.doSomething()
}