package oop_00000124960_AntonyChandra.week7.TugasMandiri

enum class ItemRarity (val DropChance: Int) {
    COMMON(70),
    UNCOMMON(60),
    RARE(50),
    EPIC(20),
    LEGENDARY(1)
}

data class GameItem(
    val name: String,
    val Damage: Int,
    val rarity: ItemRarity
)