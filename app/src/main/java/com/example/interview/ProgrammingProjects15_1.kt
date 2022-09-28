package com.example.interview
/* In an ancient land, the beautiful princess Eve had many suitors. She decided on the following
procedure to determine which suitor she would marry. First, all of the suitors would be lined up one
after the other and assigned numbers. The first suitor would be number 1, the second number 2, and
so on up to the last suitor, number n. Starting at the suitor in the first position, she would then
count three suitors down the line (because of the three letters in her name), and the third suitor
would be eliminated from winning her hand and removed from the line. Eve would then continue,
counting three more suitors, and eliminate every third suitor. When she reached the end of the line,
she would continue counting from the beginning. For example, if there were six suitors, the
elimination process would proceed as follows:

                         123456     Initial list of suitors; start counting from 1.
                         12456      Suitor 3 eliminated; continue counting from 4.
                         1245       Suitor 6 eliminated; continue counting from 1.
                         125        Suitor 4 eliminated; continue counting from 5.
                         15         Suitor 2 eliminated; continue counting from 5.
                         1          Suitor 5 eliminated; 1 is the lucky winner.

Write a program that creates a circular linked list of nodes to determine which position you should
stand in to marry the princess if there are n suitors. Your program should simulate the elimination
process by deleting the node that corresponds to the suitor that is eliminated for each step in the
process. */
class suitorsLinkedList<T>{
    private class Node<T>(var suitorNumber: T, var nextNode: Node<T>? = null){
     /*   override fun toString(): String {
          return if (nextNode != null){
                "$suitorNumber -> ${nextNode.toString()}"
            }else "$suitorNumber"
        }*/
    }

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size: Int = 0

   private fun linkedListEmpty(): Boolean{
        return size == 0
    }


    private fun push(value: T){
        head = Node(value, nextNode = head)
        if (tail == null){
            tail = head
        }
        size ++
    }

    fun addSuitor(value: T){
        if (linkedListEmpty()){
            push(value)
            return }
        tail?.nextNode = Node(value)
        tail = tail?.nextNode
        size ++
    }

    fun removeSuitor(value: Int){
        if (value == null){
            head = head?.nextNode
            return
        }
        var before = head
        repeat(value-1){
            before = before?.nextNode
        }
        var after = head
        repeat(value+1){
            after = after?.nextNode
        }
        before?.nextNode = after?.nextNode

    }
}

fun main(){
    val suitors = suitorsLinkedList<Int>()
    for ( i in 1 until 6){
        suitors.addSuitor(i)
    }
    println("Initial list of suitors: $suitors")


}