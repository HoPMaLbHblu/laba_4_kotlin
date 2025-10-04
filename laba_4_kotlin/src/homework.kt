import kotlin.random.Random

// Задание 1
fun showGameLogo() {
    println("=== EPIC QUEST ===")
}
// Задание 2
fun showEnemy(name: String, level: Int) {
    println("Враг: $name (Уровень: $level)")
}
// Задание 3 и 4
fun spawnEnemy(name: String, health: Int = 100, isBoss: Boolean = false) {
    println("Враг: $name (Здоровье: $health HP${if (isBoss) " | БОСС!" else ""})")
}
// Задание 5
fun calculateXP(level: Int): Int {
    return level * 1000
}
// Задание 6
val inventory = listOf("Меч", "Щит", "Броня")

fun checkInventory(item: String): Boolean {
    return item in inventory
}
// Задание 7
fun castSpell() {
    println("Каст случайного заклинания!")
}

fun castSpell(spell: String) {
    println("Каст заклинания $spell!")
}

fun castSpell(spell: String, power: Int) {
    println("Каст $spell с силой $power!")
}
//Задание 8
fun createWeapon(name: String): String {
    return "Оружие: $name"
}

fun createWeapon(name: String, damage: Int): String {
    return "Оружие: $name (Урон: $damage)"
}

fun createWeapon(damage: Int, isMagic: Boolean): String {
    return "${if (isMagic) "Магическое" else "Обычное"} оружие (Урон: $damage)"
}
//Задание 9
fun heal() {
    println("Лечение на 10 HP")
}

fun heal(amount: Int) {
    println("Лечение на $amount HP")
}
fun heal(amount: Int, isPotion: Boolean) {
    if (isPotion) {
        println("Выпито зелье (+$amount HP)")
    } else {
        println("Заклинание лечения (+$amount HP)")
    }
}
fun main() {
//    showGameLogo()
//    showGameLogo()
//    showEnemy("Гоблин", 5)
//    showEnemy("Дракон", 10)
//    spawnEnemy("Гоблин")
//    spawnEnemy("Дракон", isBoss = true)
//    spawnEnemy("Орк", health = 300)
//    spawnEnemy("Король Тьмы", health = 500, isBoss = true)
//    println(calculateXP(5))
//    println(checkInventory("Меч"))
//    println(checkInventory("Зелье"))
//    castSpell()
//    castSpell("Огненный шар")
//    castSpell("Ледяная стрела", 50)
//    println(createWeapon("Меч"))
//    println(createWeapon("Топор", 50))
//    println(createWeapon(70, true))
//    heal()
//    heal(25)
//    heal(50, true)
//    heal(40, false)
}