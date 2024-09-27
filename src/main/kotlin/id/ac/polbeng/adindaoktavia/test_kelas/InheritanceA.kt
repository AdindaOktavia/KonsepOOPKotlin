package id.ac.polbeng.adindaoktavia.test_kelas

open class Computer(val name: String, val brand: String) {
    // Class body for Computer can be expanded if needed
}

class Laptop(name: String, brand: String, val batteryLife: Double) : Computer(name, brand) {
    fun info() {
        println("Name: $name")
        println("Brand: $brand")
        println("Battery Life: $batteryLife hours")
    }
}

fun main() {
    val myLaptop = Laptop("Acer Aspire 4738", "Acer", 2.5)
    myLaptop.info() // Call the info method to print details about the laptop
}
