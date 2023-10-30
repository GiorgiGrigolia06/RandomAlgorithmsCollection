import kotlin.math.abs

fun leastCommonMultipleFinder(x: Int, y: Int): Int {
    if (x == 0 || y == 0) return 0
    return abs(x * y) / greatestCommonDenominatorFinder(x, y)
}

fun main() {
    val x = 8
    val y = 10
    val leastCommonMultiple = leastCommonMultipleFinder(x, y)
    println("Least common multiple of $x and $y is $leastCommonMultiple.")
}
