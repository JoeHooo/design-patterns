package com.joe.pattern.singleton

/**
 * @author joe ho
 * @date 2023/6/29 17:07
 */
object EagerKt {
    fun doSomething() = println("${this.javaClass.simpleName} :doSomething")
}

fun main(){
    EagerKt.doSomething()
}