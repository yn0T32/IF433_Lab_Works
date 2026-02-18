package oop_00000124960_AntonyChandra.week03

class Weapon(){
    private var name: String = "Tony"
    var damage: Int = 2
    set(value) {
        if (value < 0) {
            println("Damage can't be negative")
        } else if (value > 1000) {
            println("Damage can't be greater than 1000 ")
            damage = 1000
        } else {
            println("Damage is $value")
        }
    }
    var tier: String? = null
    set(value) {
        if(damage > 800){
            println("The tier is Legendary")
        } else if (damage > 500){
            println("The tier is Epic")
        } else {
            println("The tier is Common")
        }
    }
}