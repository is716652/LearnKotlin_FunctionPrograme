package com.example.learnkotlin_functionprograme

fun main(){

    var sum = 0;
    listOf(1,2,3).filter { it>0 }.forEach {
        sum +=it
    }

    println(sum)
}