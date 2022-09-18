package com.example.interview
/* Next, modify the compareTo method so it orders Student objects based on the lexicographic
ordering of their last name. */
fun main() {
    val studentsPTwo = arrayOf(StudentPtII("Jabu","Mbara", 2),
        StudentPtII("Peter", "Joseph", 5), StudentPtII
    ("Clark", "Kent", 3), StudentPtII
    ("Donald", "Duck", 8), StudentPtII
    ("Micky", "Mouse", 9)
    )

    studentsPTwo.sort()
    println("Second order by last name: ${studentsPTwo.contentToString()}")
}

data class StudentPtII(val firstName: String, val lastName: String, val studentID: Int): Comparable<StudentPtII>{

    override fun compareTo(other: StudentPtII): Int {
        return this.lastName.compareTo(other.lastName)

    }

}
