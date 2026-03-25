package oop_00000124960_AntonyChandra.week7

import javax.xml.crypto.Data

fun Main (){
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val data1 = DataUsers("Alice", 22)
    val data2 = DataUsers("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")
}