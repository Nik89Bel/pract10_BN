abstract class Cable(val type: String,  val wireCount: Int, val diameter: Double) : Quality {
    override fun calculateQuality(): Double {
        return diameter / wireCount
    }

    open fun printInfo() {
        println("Тип кабеля: $type")
        println("Количество жил кабеля: $wireCount")
        println("Диаметр: $diameter")
        println("Качество: ${calculateQuality()}")
    }
}