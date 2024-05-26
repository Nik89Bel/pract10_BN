class CableWithInsulation(type: String, wireCount: Int, diameter: Double, val insulation: Boolean) : Cable(type, wireCount, diameter) {
    var p: Boolean = insulation
    override fun calculateQuality(): Double {
        return if (p) {
            2.0 * super.calculateQuality()
        } else {
            0.7 * super.calculateQuality()
        }
    }

    override fun printInfo() {
        super.printInfo()
        println("Наличие оплетки: $insulation")
        println("Качество с учетом оплетки: ${calculateQuality()}")
    }

    fun checkQuality(quality: Quality) {
        println("Качество: ${quality.calculateQuality()}")
    }
}