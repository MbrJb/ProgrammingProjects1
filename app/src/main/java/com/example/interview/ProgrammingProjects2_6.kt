package com.example.interview

import java.util.*

/*
6. (This is a better version of an exercise from Chapter 1.) A government research lab has concluded
that an artificial sweetener commonly used in diet soda pop causes death in laboratory mice. A
friend of yours is desperate to lose weight but cannot give up soda pop. Your friend wants to know
how much diet soda pop it is possible to drink without dying as a result. Write a program to supply
the answer. The input to the program is the amount of artificial sweetener needed to kill a mouse,
the weight of the mouse, and the desired weight of the dieter. Assume that diet soda contains 1/10th
of 1% artificial sweetener. Use a named constant for this fraction. You may want to express the
percent as the double value 0.001 .
 */
fun main() {
    val read = Scanner(System.`in`)
    println("Enter weight of the mouse: ")
    val mouseWeight = read.nextFloat()
    println("Enter the amount of soda needed to kill the mouse: ")
    val amtToKillMouse = read.nextFloat()
    println("Enter your desired weight: ")
    val desiredWeight = read.nextFloat()
    println("Lastly, enter your current weight: ")
    val startWeight = read.nextFloat()

    val sweetnerInSoda = 0.001
    val roomForSafety = 3

    val amtToKillFriend = ((startWeight/mouseWeight) * amtToKillMouse)/sweetnerInSoda
    val weightToStop = ((amtToKillFriend - 1) * startWeight)/amtToKillFriend
    println("With a desired weight of $desiredWeight kg and current weight of $startWeight kg,\n" +
            "you need to stop drinking diet soda pop at ${(weightToStop-roomForSafety).toInt()} kg")
}