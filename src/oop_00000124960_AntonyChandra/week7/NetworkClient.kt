package oop_00000124960_AntonyChandra.week7

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "https://api.umn.ac.id"

        fun createClient(): NetworkClient {
            println("Creating Client using BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }
    fun connect() {
        println("Connected to $url")
    }

}