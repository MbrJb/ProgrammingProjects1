package com.example.interview
/*
16. Suppose a text file contains the following verse from the Bible:
		Let us fix our eyes on Jesus, the author and perfecter of our faith, who for the joy set
        before him endured the cross, scorning its shame, and sat down at the right hand of the
        throne of God.
Write a program that takes one of the five vowels (a, e, i, o, and u) as input from
the user and checks each word of the text file to determine whether or not it starts
with that vowel. Then, it should also display those words on the screen, one word
per line.
 */
import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val read = Scanner(System.`in`)
    val verseMain = "Let us fix our eyes on Jesus, the author and perfecter of our faith, who for the joy set\n" +
            "        before him endured the cross, scorning its shame, and sat down at the right hand of the\n" +
            "        throne of God."
    println("Enter any of the five vowels: A, E, I, O, U")
    var inputVowel = read.nextLine()
    println("Here are all the words beginning with ${inputVowel.uppercase()}")
    calc(verseMain, inputVowel)
}
fun calc(verse: String, vowel: String) {
    val allWordsArray: ArrayList<String> = verse.split(" ") as ArrayList<String>
    for (i in allWordsArray) {
        if (vowel.startsWith("a")||vowel.startsWith("A")){
            if (i.startsWith("a") || i.startsWith("A")) {
                println(i)} }
        if (vowel.startsWith("e")||vowel.startsWith("E")){
            if (i.startsWith("e") || i.startsWith("E")) {
                println(i)} }
        if (vowel.startsWith("i")||vowel.startsWith("I")){
            if (i.startsWith("i") || i.startsWith("I")) {
                println(i)} }
        if (vowel.startsWith("o")||vowel.startsWith("O")){
            if (i.startsWith("o") || i.startsWith("O")) {
                println(i)} }
        if (vowel.startsWith("u")||vowel.startsWith("U")){
            if (i.startsWith("u") || i.startsWith("U")) {
                println(i)} }
    }
}



