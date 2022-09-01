package com.example.interview
import java.util.*

/*
2. The video game machines at your local arcade output coupons according to how well you play the
game. You can redeem 10 coupons for a candy bar or 3 coupons for a gumball. You prefer candy bars
to gumballs. Write a program that defines a variable initially assigned to the number of coupons you
win. Next, the program should output how many candy bars and gumballs you can get if you spend all
of your coupons on candy bars first, and any remaining coupons on gumballs.
 */

fun main(){

    val read = Scanner(System.`in`)
    println("How many coupons do you have?")
    val couponsWon = read.nextInt()
    val candyBars = couponsWon/10
    val remainder = couponsWon % 10
    val gumBalls = remainder/3
    println("With your current coupons, you can redeem $candyBars candy bars and $gumBalls gumballs.")
}