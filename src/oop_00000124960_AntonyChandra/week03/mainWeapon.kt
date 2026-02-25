package oop_00000124960_AntonyChandra.week03

import Player

fun main(){
    var Senjata = Weapon()
    Senjata.damage = 1000
    val player = Player("Budi")
    player.addXp(100)
    println("Damage: ${Senjata.get_damage()}\nTier: ${Senjata.get_tier()}")
    println("Player Level: ${player.level}")
}