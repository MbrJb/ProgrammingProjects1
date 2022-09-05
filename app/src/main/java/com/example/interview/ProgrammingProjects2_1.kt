package com.example.interview

import java.util.*

/*
1. The Babylonian algorithm to compute the square root of a positive number n is as
follows:
		1. Make a guess at the answer (you can pick n/2 as your initial guess).
		2. Compute r = n / guess
		3. Set guess = (guess +r)/ 2
		4. Go back to step 2 for as many iterations as necessary. The more you repeat steps
            2 and 3, the closer guess will become to the square root of n .

Write a program that inputs a double for n , iterates through the Babylonian algorithm five times,
and outputs the answer as a double to two decimal places. Your answer will be most accurate for
small values of n .
 */

fun main(){

    println("Enter the positive number you want the square root for: ")
    var read = Scanner(System.`in`)
    var n = read.nextDouble()

    var sqrt = stepThreeSetGuess((stepOneGuess(n)), stepTwoComputeR(n, stepOneGuess(n)))
    var guess = 0.0

    var i = 0
    while (i < 5){
        sqrt
        i++
        guess = sqrt
    }

    println("The guessed square root is: $guess")
}

fun stepOneGuess(input: Double): Double{
        return input/2
}
fun stepTwoComputeR(input: Double, guess: Double): Double{
    return input/guess
}
fun stepThreeSetGuess(guess: Double, r: Double): Double{
    return (guess +r)/ 2
}