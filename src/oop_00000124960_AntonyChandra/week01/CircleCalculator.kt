package oop_001_johnthor.week01
fun main(args: Array<String>) {
    var radius= 7.0
    val pi= 3.14
    var area= pi * radius * radius
    println("Radius: $radius" + ", Area: $area")
    checkSize(area)
    val result = checkSize(area)
    println(result);
}
fun checkSize(area: Double): String = if (area > 100) "This is a Big Circle" else "This is a small circle"