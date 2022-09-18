package com.example.interview
import java.util.Random
/*
9. The following is a short snippet of code that simulates rolling a 6-sided dice 100 times. There
is an equal chance of rolling any digit from 1 to 6.
    public static void printDiceRolls(Random randGenerator){
        for (int i = 0; i < 100; i++){System.out.println(randGenerator.nextInt(6) + 1);}}
    public static void com.example.interview.main(String[] args){Random randGenerator = new Random();
    printDiceRolls(randGenerator);}
Create your own class, LoadedDice , that is derived from Random .
The constructor for LoadedDice needs to only invoke Random ’s constructor.
Override the public int nextInt(int num) method so that with a 50% chance, your new method always
returns the largest number possible (i.e., num – 1), and with a 50% chance,
it returns what Random ’s nextInt method would return. Test your class by replacing the com.example.interview.main method
 with the following:
    LoadedDice myDice = new LoadedDice();
    printDiceRolls(myDice);
You do not need to change the printDiceRolls method even though it takes
a parameter of type Random . Polymorphism tells Java to invoke LoadedDice ’s nextInt() method
instead of Random ’s nextInt() method.
 */
fun main(){
    val myDice = LoadedDice()
    printDiceRolls(myDice)

}

fun printDiceRolls(randGenerator: Random) {
    for (i in 0..99) {
        println(randGenerator.nextInt(6) + 1)
    }
}

class LoadedDice: Random() {
    override fun nextInt(): Int {
        return super.nextInt(6+1-1)+1
    }

}

