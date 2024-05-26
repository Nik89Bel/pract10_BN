fun main() {
    val cable = object : Cable(type = "Медный", wireCount = 100, diameter = 0.5){}
    cable.printInfo()
    val cableWithInsulation = CableWithInsulation("Медный", 100, 0.5, true)
    cableWithInsulation.printInfo()
    cableWithInsulation.checkQuality(cable)
    cableWithInsulation.checkQuality(cableWithInsulation)
}