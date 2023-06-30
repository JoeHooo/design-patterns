package com.joe.pattern.singleton

/**
 * @author joe ho
 * @date 2023/6/29 17:35
 */
class DoubleCheckKt private constructor() {
    companion object {
        @Volatile
        private var instance: DoubleCheckKt? = null
        fun getInstance() = instance ?: synchronized(this) {
            instance ?: DoubleCheckKt().also { instance = it }
        }
        /*fun getInstance(): DoubleCheck {
            if (instance == null) {
                synchronized(this) {
                    if (instance == null) {
                        instance = DoubleCheck()
                    }
                }
            }
            return instance!!
        }*/
    }

    fun doSomething() {
        println("${this.javaClass.simpleName} :do something")
    }
}

fun main() {
    DoubleCheckKt.getInstance().doSomething()
}