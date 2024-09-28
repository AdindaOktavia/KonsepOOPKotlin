package id.ac.polbeng.adindaoktavia.test_kelas

open class MyBase{
    open fun think(){
        println("Hey!! i am thinking ")
    }
}

class MyDerived: MyBase(){
    override fun think() {
        println("I am from child")
    }
}

fun main() {
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}