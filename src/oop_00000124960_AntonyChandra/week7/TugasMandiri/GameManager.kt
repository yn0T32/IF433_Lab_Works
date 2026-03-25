package oop_00000124960_AntonyChandra.week7.TugasMandiri

object GameManager {
    var isGameRunning: Boolean = false
    fun startGame() {
        isGameRunning = true
        if(isGameRunning) {
            println("GameManager is Already running")
        } else if (!isGameRunning) {
            println("Memulai game Engine")
            isGameRunning = true
        }
    }
}