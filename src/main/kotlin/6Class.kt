class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

data class User(val email: String, val id: Int)

fun main() {
    println("https://kotlinlang.org/docs/kotlin-tour-classes.html")
    val contact = Contact(1, "mary@gmail.com")
    contact.printId()

    val person = User("mary@gmail.com", 1)
    val copy = person.copy(id = 2)
    println()

    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")

    println("user == thirdUser: ${user == thirdUser}")
}