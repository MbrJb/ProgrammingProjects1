package com.example.interview

import java.util.*

/*
9. A simple rule to estimate your ideal body weight is to allow 110 pounds for the first 5
feet of height and 5 pounds for each additional inch. Write a program with a variable
for the height of a person in feet and another variable for the additional inches. Assume
the person is at least 5 feet tall. For example, a person that is 6 feet and 3 inches tall
would be represented with a variable that stores the number 6 and another variable that
stores the number 3. Based on these values, calculate and output the ideal body weight.
 */

fun main(){
    val read = Scanner(System.`in`)
    println("What is your height in feet and inches?\n\t\tEnter feet first")
    val feet = read.nextInt()
    println("Now enter inches")
    val inches = read.nextInt()

    val totalHeight = (feet * 12) + inches
    val remaining = totalHeight - 60
    val idealWeight = 110 + (remaining * 5)
    println("Your ideal weight is $idealWeight pounds")
}