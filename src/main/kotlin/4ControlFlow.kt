import kotlin.random.Random

fun main() {
    println("https://kotlinlang.org/docs/kotlin-tour-control-flow.html")

    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    val a = 1
    val b = 2

    // 没有三元表达式，不过if..else..即可当三元使用
    println(if (a > b) a else b)


    val obj = "Hello"

    // 第一个符合条件的执行，自动break。他顺便还能拿到符合条件的返回值
     when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }
    println(
        when (obj) {
            "1" -> "One"
            "Hello" -> "Greeting"
            else -> "Unknown"
        }
    )


    val range=1..4// [1,4]
    1..<4//[1,4)
    4 downTo 1//4 3 2 1
    1..5 step 2// 1 3 5


    println()

    val nextInt = Random.nextInt(1, 3)//[1,3)
    println(nextInt)



    for ( aaa in range) {
        println(aaa)
    }


    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}