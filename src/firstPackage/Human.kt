package firstPackage



data class Human (val height: Int = 160,
            val weight: Double = 70.0,
            val name: String = "noName",
            val colorHair: String = "brown") {


    fun heightOver(age: Byte): Int {

        return  2 * age + height
    }

}