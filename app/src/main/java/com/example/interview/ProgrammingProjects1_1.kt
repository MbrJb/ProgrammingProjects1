package com.example.interview
/*
1. Body Mass Index (BMI) helps in specifying the weight category a person belongs to, depending on
their body weight. BMI is estimated using the following formula:
BMI = Weight in kilograms/(Height in meters)^2
Write a program that calculates and outputs the BMI. Assume various input values wherever required.
 */
import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println("Enter weight in kilograms:")
    val w = read.nextFloat()
    println("Enter height in meters:")
    val h = read.nextFloat()
    println("Your BMI is ${bmi(w, h)}")
}

fun bmi(weight: Float, height: Float): Float {
    return weight / (height * height)
}
