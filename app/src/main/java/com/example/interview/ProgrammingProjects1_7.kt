package com.example.interview
/*
Write a program that outputs the number of hours, minutes, and seconds that
corresponds to 50,391 total seconds. The output should be 13 hours, 59 minutes,
and 51 seconds. Test your program with a different number of total seconds to
ensure that it works for other cases.
 */

fun main(){
    val totalSeconds = 50391
    val hours = totalSeconds/3600
    val minutes = (totalSeconds - (hours * 3600))/60
    val seconds = (totalSeconds - (hours * 3600) - (minutes * 60))

    println("$totalSeconds seconds are equivalent to $hours hours, $minutes minutes, and $seconds seconds")

}