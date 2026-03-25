package oop_00000124960_AntonyChandra.week7

object DatabaseManager {
    var connectionStatus: String = "Disconnected"
    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}