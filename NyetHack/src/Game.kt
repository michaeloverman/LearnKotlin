fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    // Aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
//    if (auraVisible) {
//        println("GREEN")
//    } else {
//        println("NONE")
//    }
    val auraColor = if (auraVisible) "GREEN" else "NONE"
//    println(auraColor)

//    if (healthPoints == 100) {
//    val healthStatus = if (healthPoints == 100) {
////        println(name + " is in excellent condition!")
//        "is in excellent condition!"
////    } else if (healthPoints >= 90) {
//    } else if (healthPoints in 90..99) {
////        println(name + " has a few scratches")
//        "has a few scratches."
////    } else if (healthPoints >= 75) {
//    } else if (healthPoints in 75..89) {
//        if (isBlessed) {
////            println(name + " has some minor injuries but is healing quite quickly.")
//            "has some minor injuries but is healing quite quickly."
//        } else {
////            println(name + " has some minor injuries.")
//            "has some minor injuries."
//        }
////    } else if (healthPoints >= 15) {
//    } else if (healthPoints in 15..74) {
////        println(name + " looks pretty bad.")
//        "lookes pretty bad."
//    } else {
////        println(name + " is in awful condition.")
//        "is in awful condition."
//    }
    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches"
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

    // Player status
    println("(Aura: $auraColor) " + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}