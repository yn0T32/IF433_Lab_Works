package oop_00000124960_AntonyChandra.week02
import java.util.Scanner

class hero (var name: String, var hp: Int, var baseDamage: Int){
    init{
        hp = 100;
    }
    fun takeDamage (damage: Int){
        hp = 100 - damage
        var isAlive = true
        if(hp >= 0) {
            println("You died")
            isAlive = false
        } else
            println("You take damage $hp")
    }
    fun attack (targetName: String){
        println("$name attacked $targetName")
    }
}