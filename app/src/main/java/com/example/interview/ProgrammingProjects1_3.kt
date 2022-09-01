package com.example.interview
/*
Write a program that starts with the string variable first set to your first name and the string
variable last set to your last name. Both names should be all lower-case. Your program should then
create a new string that contains your full name in pig latin with the first letter capitalized
for the first and last name. Use only the pig latin rule of moving the first letter to the end of
the word and adding “ay.” Output the pig latin name to the screen. Use the substring and toUpperCase
methods to construct the new name. For example, given first = "walt";
		                                              last = "savitch"
the program should create a new string with the text “Altway Avitchsay” and print it.
*/

fun main(){
    var first = "jabu"
    var last = "mbara"
    val ay = "ay"

    val firstLetter = first[0]
    first = first.substring(1)
    first += firstLetter
    val newFirst = first[0].toUpperCase()
    first = first.substring(1)

    val firstLetterLastName = last[0]
    last = last.substring(1)
    last += firstLetterLastName
    val newFirstLastName = last[0].toUpperCase()
    last = last.substring(1)


    println("First: ${newFirst+first+ay} Last: ${newFirstLastName+last+ay}")
}