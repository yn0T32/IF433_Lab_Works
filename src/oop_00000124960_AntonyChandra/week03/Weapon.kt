package oop_00000124960_AntonyChandra.week03

class Weapon(){
    private var name: String = "Excalibur"
    public var damage: Int = 2
    set(value) {
        if (value < 0) {
            println("Damage can't be negative")
            field = damage
        } else if (value > 1000) {
            println("Damage can't be greater than 1000 ")
            field = 1000
        } else {
            field = value
        }
    }
        get(){
            return field
        }

    fun get_damage(): Int {
        return damage
    }
    private var tier: String = "Common"
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
    fun get_tier(): String{
        return tier
    }
}