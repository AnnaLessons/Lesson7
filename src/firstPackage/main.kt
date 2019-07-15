package firstPackage

fun main() {
    val John1: Human = Human(name = "Sam", colorHair = "black")
    val John2 = Human(name = "Sam", colorHair = "black")
    val group = Group("BlackMoon", arrayOf(John1,John2))

    print(group)
}

