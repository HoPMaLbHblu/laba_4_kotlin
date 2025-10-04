//import com.sun.jdi.ClassType
//import kotlin.math.sqrt
//
//fun main() {
//    val hello: () -> Unit = {println("hello")}
//    hello()
//    val attack = {enemy: String -> println("Attack $enemy") }
//    attack("Goblin")
//    val sum1 = fun(x:Int, y:Int): Int {
//        return x + y }
//    val sum2 = fun(x:Int,y:Int): Int = x + y
//    val sum3 = {x:Int, y:Int -> x + y}
//    val sum4:  (Int, Int) -> Int = {x,y -> x + y}
//    val numbers = listOf(14,2,33,4,5)
//    val doubled = numbers.map {it * 2}
//    val doubled2 = numbers.map {it % 2 == 0}
//    val doubled3 = numbers.filter {it % 2 == 0}
//    println(doubled)
//    println(doubled2)
//    println(doubled3)
//    applyEffect { it+50 }
//    val kills = createCounter()
//    println(kills())
//    println(kills())
//    sum(1,2,3)
////    greetPlayer()
////    showChatMessage("Good morning")
////    playerLevel(12, "legolas")
////    createCharacter("gendalf",56, "Old")
////    print(calcDmg(50, 1.5))
////    Sum(10, 15.0)
////    val sum = fun(x: Int, y:Int): Int = x+y
////    println(sum)
//}
////fun applyEffect(effect:(Int) -> Int){
////    val health = 100
////    println("health = ${effect(health)}")
////}
////fun createCounter():()->Int{
////    var count = 0
////    return {++count}
////}
////
////fun greetPlayer() = println("Hello player!")
////fun showChatMessage(text: String) = print(text)
////fun playerLevel(level: Int, name: String) = print("PLayer ${name}, lvl ${level}")
////fun createCharacter (name: String, level:Int = 1, classType: String = "New") = println("$name, $level, $classType")
////fun calcDmg(damage:Int, multiplayer: Double):Int{
////    return (damage * multiplayer).toInt()
////}
////fun showMass(text: String): Unit = println(text)
////fun sum(a: Int, b: Int, c:Int): Int = a+b+c
////fun sum(a: Double, b: Double): Double = a+b
////fun sum(a: Int, b: Double): Double = a+b
////fun sum(a: Double, b:Int ): Double = a+b
////val greet = fun(name: String) = println("$name")
//
