package com.example.interview

import java.util.*

/*
3. Write a program that reads in two numbers typed on the keyboard and divides
the first number by the second number. The program should output the dividend,
divisor, quotient, and remainder on the screen.
 */
fun main(){
    var read = Scanner(System.`in`)
    println("Enter your first number: ")
    val first = read.nextDouble()
    println("Great! Now enter your second number: ")
    val second = read.nextDouble()
    println("Awesome!\nThe dividend is ${first}, the divisor is ${second}.\n" +
            "The quotient is ${(first/second).toFloat()}, and the remainder is ${first%second}.")
}