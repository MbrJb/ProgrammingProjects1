package com.example.interview

import java.util.*

/*
10. Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
lethal overdose. Write a program with a variable that holds the number of milli-
grams of caffeine in a drink and outputs how many drinks it takes to kill a person.
A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup
of coffee has approximately 160 mg of caffeine.
 */

fun main(){
    println("How many milligrams of caffeine is in your drink?")
    val read = Scanner(System.`in`)
    val amnt = read.nextFloat()

    println("It would take you ${10000/amnt} drinks to be killed by the caffeine.")
}
