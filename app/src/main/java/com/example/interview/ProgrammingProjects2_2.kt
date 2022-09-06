package com.example.interview

import java.util.*

/*
2. (This is a version with input of an exercise from Chapter 1.) Write a program that inputs two
string variables, first and last , which the user should enter with his or her name. First, convert
both strings to all lowercase. Your program should then create a new string that contains the full
name in pig latin with the first letter capitalized for the first and last name. Use only the pig
latin rule of moving the first letter to the end of the word and adding “ay.” Output the pig latin
name to the screen. Use the substring and toUpperCase methods to construct the new name. For
example, if the user inputs “Walt” for the first name and “Savitch” for the last name, then the
program should create a new string with the text “Altway Avitchsay” and print it.
 */
fun main() {

    var read = Scanner(System.`in`)
    println("Enter your first name: ")
    var first = read.next()
    println("Enter your last name: ")
    var last = read.next()
    println("Your new names are: ${moveFirstAndAddAyCh_Two(first)} ${moveFirstAndAddAyCh_Two(last)}")
}
fun moveFirstAndAddAyCh_Two(name: String): String {
    var nameToLower = name.lowercase()
    var firstLetter = nameToLower[0]
    var nameCut = nameToLower.substring(1)
    nameCut += firstLetter
    var newFirst = nameCut[0].uppercaseChar()
    nameCut = nameCut.substring(1)

    return newFirst + nameCut + "ay"

}
