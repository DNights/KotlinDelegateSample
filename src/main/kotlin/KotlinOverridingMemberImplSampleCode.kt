interface Base2 {
    val message: String
    fun print()
}

class BaseImpl2(val x: Int) : Base2 {
    override val message = "BaseImpl: x = $x"
    override fun print() { println(message) }
}

class Derived2(b: Base2) : Base2 by b {
    // This property is not accessed from b's implementation of `print`
    override val message = "Message of Derived"
}

fun main() {
    val b = BaseImpl2(10)
    val derived2 = Derived2(b)
    derived2.print()
    println(derived2.message)
}