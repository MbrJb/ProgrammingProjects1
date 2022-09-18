package com.example.interview
/* Without modification to the main method, the program should now output the students ordered by name.*/
fun main() {
    val studentsPThree = arrayOf(StudentPt3("Jabu","Mbara", 2),
        StudentPt3("Peter", "Joseph", 5), StudentPt3
            ("Clark", "Kent", 3), StudentPt3
            ("Donald", "Duck", 8), StudentPt3
            ("Micky", "Mouse", 9)
    )

    studentsPThree.sort()
    println("Third order by first name: ${studentsPThree.contentToString()}")
}

data class StudentPt3(val firstName: String, val lastName: String, val studentID: Int): Comparable<StudentPt3>{

    override fun compareTo(other: StudentPt3): Int {
        return this.firstName.compareTo(other.firstName)

    }

}
