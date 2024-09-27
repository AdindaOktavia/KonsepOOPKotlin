package id.ac.polbeng.adindaoktavia.test_kelas

open class NewPerson{
    open var age: Int = 1
}

class CheckPerson: NewPerson(){
    override var age: Int = 1
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Age can not be negative")
        }
}

fun main() {
    val person = NewPerson()
    person.age = -5

    val checkPerson = CheckPerson()
    checkPerson.age = -5
}