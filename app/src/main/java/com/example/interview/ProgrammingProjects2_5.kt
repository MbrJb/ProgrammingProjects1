package com.example.interview

import java.util.*

/*
5. Grade point average (GPA) in a 4-point scale is calculated by using the following formula:
GPA = (Percentage/ 100) * 4
Write a program that takes as input the percentage from a user. The program
should then output the user’s GPA on the screen. The format of the output should
be as follows, assuming the user’s percentage is 85: (85/100) * 4 = 3
 */
fun main(){
    val read = Scanner(System.`in`)
    println("What is your overall percentage?")
    val percent = read.nextFloat()
    GPA(percent)
}
fun GPA(percent: Float){
    val gpa = ((percent/100) * 4)
    println("($percent/100) * 4 = ${gpa.toInt()}")
}