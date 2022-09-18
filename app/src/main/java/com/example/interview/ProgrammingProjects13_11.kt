/* 11. Create a Student class that has instance variables for the student’s last name and ID number,
along with appropriate constructors, accessors, and mutators. Make the Student class implement the
Comparable interface. Define the compareTo method to order Student objects based on the student ID
number. In the main method, create an array of at least five Student objects, sort them using
Arrays.sort , and output the students. They should be listed by ascending student number.*/
package com.example.interview
fun main() {
    val studentsVar = arrayOf(Student("Bret", 6), Student("Adam", 2),
    Student("Cathy", 7), Student("Daisy", 4), Student("Elle", 5))
    studentsVar.sort()
    println("First order by studentID: ${studentsVar.contentToString()}")
    }

data class Student(val lastName: String, val studentID: Int): Comparable<Student>{

    override fun compareTo(other: Student): Int {
        return this.studentID.compareTo(other.studentID)

    }

}