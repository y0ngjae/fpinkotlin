package com.fpinkotlin.functions.exercise02


fun square(n: Int) = n * n

fun triple(n: Int) = n * 3

// Define a generic compose. The exercise dos not consist in writing the implementation, but the signature.
// 처음에 생각한 답은 이겁니다
fun <T> compose(f: (T) -> T, g: (T) -> T): (T) -> T = { f(g(it)) }

// 3번을 보니 원하는 솔루션은 이거인듯
//fun <T, U, V> compose(f: (U) -> V, g: (T) -> U): (T) -> V = { f(g(it)) }