fun main() {
    println("https://kotlinlang.org/docs/kotlin-tour-hello-world.html")
    print("Hello ")
    println("Kotlin")

    // 只读变量用val,可变变量用var
    var customers = 1

    customers = 2
    println("There are $customers customers")

    println("There are ${customers + 1} customers")

    val name = "Mary"
    val age = 20
    println("$name is $age years old")
}