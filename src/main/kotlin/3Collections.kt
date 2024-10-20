fun main() {
    println("https://kotlinlang.org/docs/kotlin-tour-collections.html")


    // 只读List。List有序Set无序
    val readOnlyShapes = listOf("triangle", "square", "circle")
    // val readOnlyShapes = setOf("triangle", "square", "circle")


    println(readOnlyShapes)
    println("第一个是${readOnlyShapes[0]},最后一个是${readOnlyShapes.last()}")
    println("circle" in readOnlyShapes)


    // 可变List
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    // val shapes: MutableSet<String> = mutableSetOf("triangle", "square", "circle")
    shapes.add("hello")
    shapes.remove("circle")

    // 指明类型是List即可实现只读，不可变
    val shapesLocked: List<String> = shapes


    println(shapes)
    println(shapesLocked)


    //只读Map
    val readOnlyMap: Map<String, String> = mapOf("王宝强" to "马蓉", "贾乃亮" to "李小璐", "苏享茂" to "翟欣欣")

    println("贾乃亮被${readOnlyMap.get("贾乃亮")}绿了")
    println("贾乃亮被${readOnlyMap["贾乃亮"]}绿了")

    val mutableMap: MutableMap<String, String> =
        mutableMapOf("王宝强" to "马蓉", "贾乃亮" to "李小璐", "苏享茂" to "翟欣欣")

    mutableMap.put("胖猫","谭竹")
    mutableMap["京东码农"]="赵春美"
    println(mutableMap)

}