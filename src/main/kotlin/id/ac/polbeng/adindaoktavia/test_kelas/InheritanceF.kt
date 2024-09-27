package id.ac.polbeng.adindaoktavia.test_kelas

open class InheritanceF {
    open var baseSalary: Double = 10000.0
    open fun displayDetails(){
        println("I am an Employee")
    }
}

class Developer: InheritanceF() {
    override var baseSalary: Double = super.baseSalary + 10000.0
    override fun displayDetails() {
        super.displayDetails() // Memanggil method dari superclass
        println("I am a Developer")
    }
}

fun main(){
    val employeeF = InheritanceF()
    println("${employeeF.javaClass.simpleName} base salary is ${employeeF.baseSalary}")
    employeeF.displayDetails() // Tidak perlu println di sini karena displayDetails sudah mencetak sendiri

    val developer = Developer()
    println("${developer.javaClass.simpleName} base salary is ${developer.baseSalary}")
    developer.displayDetails() // Sama seperti di atas, tidak perlu println
}
