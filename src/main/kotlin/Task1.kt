fun greatestCommonDenominatorFinder(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val tempVar = y
        y = x % y
        x = tempVar
    }
    return x
}

fun main() {
    val x = 12
    val y = 18
    val greatestCommonDenominator = greatestCommonDenominatorFinder(x, y)
    println("Greatest common denominator of $x and $y is $greatestCommonDenominator.")
}