package com.example.interview
/*
Write a program for calculating the simple interest on a loan when the initial principal amount
(princi_amnt) is $1000, the initial interest rate (int_rate) is 5.0%, and the number of years
(no_of_yrs) is 5. Use suitable data types to declare these variables. Simple interest is calculated
using the following equation:
        	Simple interest =(Principal amount * Interest rate * Number of years)/100
 */

fun main(){
    val princi_amnt = 1000
    val int_rate = 0.05
    val no_of_yrs = 5
    val SimpleInterest = (princi_amnt * int_rate * no_of_yrs) / 100
    println("Simple Interest is $SimpleInterest")
}