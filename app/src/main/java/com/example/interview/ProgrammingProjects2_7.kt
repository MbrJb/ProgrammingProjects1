package com.example.interview

import java.util.*

/*
7. Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item. For example, a possible sample dialogue might be
the following:
Enter price of item
		 (from 25 cents to a dollar, in 5-cent increments):
		45
You bought an item for 45 cents and gave me a dollar,
so your change is
2 quarters,
0 dimes, and
1 nickels.
 */
fun main(){
    println("Enter price of item\n(from 25 cents to a dollar, in 5-cent increments):")
    val read =  Scanner(System.`in`)
    val itemValue = read.nextDouble()
    calc(itemValue)
}
fun calc(itemValue: Double){

    var remainder = 0.0
    var quarters = 0.0
    var dimes = 0.0
    var nickels = 0.0

    if (itemValue > 1) {
        remainder = (100.0 - itemValue)
        quarters = (remainder/25.0)
        dimes = (remainder - (quarters.toInt() * 25))/10
        nickels =( remainder - ((quarters.toInt() * 25) - (dimes.toInt() * 10)))/5

    println("You bought an item for ${itemValue.toInt()} cents and gave me a dollar,\n" +
            "so your change is:\n${quarters.toInt()} quarters\n${dimes.toInt()} dimes, and\n" +
            "${nickels.toInt()} nickels.")
    }else{
        println("You bought an item for $1 and gave me a dollar,\n" +
                "so your change is zero.")
    }
}