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

fun main() {
    var first = "jabu"
    var last = "mbara"
    println("${moveFirstAndAddAy(first)} ${moveFirstAndAddAy(last)}")


}
fun moveFirstAndAddAy(name: String): String {
    var firstLetter = name[0]
    var nameCut = name.substring(1)
    nameCut += firstLetter
    var newFirst = nameCut[0].toUpperCase()
    nameCut = nameCut.substring(1)

    return newFirst + nameCut + "ay"

}

