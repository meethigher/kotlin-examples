fun main() {
    println("https://kotlinlang.org/docs/kotlin-tour-functions.html")

    hello()

    println(sum(1, 2))
    println(sum(1, 2))
    println(sum(1, 2, 3))

    println(sum(z = 1, y = 1, x = 2))
}

fun sum(x: Int, y: Int, z: Int = 99): String {
    return "${x}${y}$z"
}

fun hello() { // 如果返回值是无意义的，可以省略不写
    //println("hello world")
    return println("hello world")
}