package com.example.interview
/*
4.John travels a distance of 55 miles at an average speed of 15 miles per hour. Write
a program to calculate the total number of hours John takes to cover this distance.
The program should print the total time taken in hours and minutes. Use the fol-
lowing formula for calculations.
Time = Distance/Speed
 */

fun main(){
    val d = 55.0
    val sp = 15.0
    calcHr(d, sp)
}
fun calcHr(d: Double, sp: Double){
    val hr = d/sp
    val minutes = ((hr * 60) % 60)
    print("John took ${hr.toInt()} hours and ${minutes.toInt()} minutes.")
}