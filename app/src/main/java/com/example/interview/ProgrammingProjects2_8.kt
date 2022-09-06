package com.example.interview
/*
8. Write a program that reads in a string containing three words separated by commas
and then outputs that string with each word in a different line.
 */
fun main(){
    val str = "Jabu, Peter, Mbara"
    calc(str)
}
fun calc(str: String){
    val firstComma = str.indexOf(',')
    var firstWord = str.substring(0, firstComma)
    val middleStr = str.substring(firstWord.length + 2)
    val secondComma = middleStr.indexOf(',')
    var secondWord = middleStr.substring(0, secondComma)
    var lastSpace = middleStr.indexOf(' ')
    var finalStr = middleStr.substring(lastSpace + 1)
    println("$firstWord\n$secondWord\n$finalStr")
}
