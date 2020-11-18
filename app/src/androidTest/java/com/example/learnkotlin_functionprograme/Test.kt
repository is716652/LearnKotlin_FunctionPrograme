package com.example.learnkotlin_functionprograme

fun foo(Int:Int) = println(Int)


fun main(){
    val sum:(Int,Int)->Int={x:Int,y:Int->x+y}

    println(sum(3,4))

    val f1 = {x:Int ->  val y = x+1
        y
    }

    println(f1(10))

    val xlist = listOf<Int>(12,13,14,15,16).forEach { foo(it) }

    val g1 = {x:Int , y:Int -> x+y}

    println(g1(1,22))

    fun sum(x:Int) = {y:Int -> {z:Int -> x+y+z}}
    println(sum(1)(2)(3))

}