package com.fpinkotlin.functions.exercise04


class Functions

fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

fun <T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V = { f(g(it)) }

val add: (Int) -> (Int) -> Int = { a -> { b -> a + b} }

typealias IntFuncType = (Int) -> Int

// 굳이 길게 풀어 써보자면
val compose: (IntFuncType) -> (IntFuncType) -> IntFuncType = { outerArg: IntFuncType ->
    val outerRet: (IntFuncType) -> IntFuncType = { innerArg: IntFuncType ->
        val innerRet: IntFuncType = { intArg: Int ->
            outerArg.invoke(innerArg.invoke(intArg))
        }
        innerRet
    }
    outerRet
}

//짧게하면 이렇게..
//val compose: (IntFuncType) -> (IntFuncType) -> IntFuncType = { a -> { b -> { c -> a(b(c)) } } }