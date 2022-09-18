/* 11. Create a Student class that has instance variables for the student’s last name and ID number,
along with appropriate constructors, accessors, and mutators. Make the Student class implement the
Comparable interface. Define the compareTo method to order Student objects based on the student ID
number. In the main method, create an array of at least five Student objects, sort them using
Arrays.sort , and output the students. They should be listed by ascending student number. Next,
modify the compareTo method so it orders Student objects based on the lexicographic ordering of
their last name. Without modification to the main method, the program should now output the students
ordered by name. */
package com.example.interview
fun main(){

    val studentsVar = arrayOf(Student("Bret", 6), Student("Adam", 2),
    Student("Cathy", 3), Student("Daisy", 4), Student("Elle", 5))
    println("Array before sort: ${studentsVar.contentToString()}")
    studentsVar.sort()
    println("After: ${studentsVar.contentToString()}")

// Line 15 doesn't do anything
}

data class Student(val lastName: String, val studentID: Int): Comparable<Student>{

    //How do compare last name against itself?
    override fun compareTo(other: Student): Int {
        var result = 0
        if (lastName < other.toString()){ result = 1}
        return result
    }

}