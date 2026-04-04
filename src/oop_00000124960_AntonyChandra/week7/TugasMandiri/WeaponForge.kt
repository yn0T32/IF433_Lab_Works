package oop_00000124960_AntonyChandra.week7.TugasMandiri

class Weapon private constructor(val item: GameItem, val Durability: Int) {
    companion object {
        fun forgeStarterSword(){
            return("Pedang Kayu Batuk", damage 5, Common)
        }
    }
}