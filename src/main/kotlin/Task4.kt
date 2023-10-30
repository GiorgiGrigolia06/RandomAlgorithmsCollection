fun recursiveSumEvenNumbersUntilHundred(n: Int = 100): Int {
    return if (n == 0) 0
    else n + recursiveSumEvenNumbersUntilHundred(n - 2)
}

fun main() {
    val sum = recursiveSumEvenNumbersUntilHundred(100)
    println("Sum of even numbers until 100 is $sum.")
}