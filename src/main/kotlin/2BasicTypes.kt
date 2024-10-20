fun main() {
    println("https://kotlinlang.org/docs/kotlin-tour-basic-types.html")
    var float1: Float = 1.0F//float要带f
    var double1: Double = 1.0
    var string1: String = "hello"
    var int1: Int = 1
    var long1: Long = 1
    var cha1: Char = 'h'
    var boolean1: Boolean = true

    // 省略时，会自动识别类型
    var customers = 10


    // Some customers leave the queue
    customers = 8

    customers = customers + 3 // Example of addition: 11
    customers += 7            // Example of addition: 18
    customers -= 3            // Example of subtraction: 15
    customers *= 2            // Example of multiplication: 30
    customers /= 3            // Example of division: 10

    println(customers) // 10
}