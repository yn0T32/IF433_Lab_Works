package oop_00000124960_AntonyChandra.week7

fun Main {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUsers("Alice", 22)
    val reg2 = RegularUsers("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")
}