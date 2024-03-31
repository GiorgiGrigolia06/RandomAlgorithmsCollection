fun reverseNumber(number: Int): Int {
    val numberToString = number.toString()
    val reversedString = numberToString.reversed()
    return reversedString.toInt()
}

fun main() {
    val input = 10220
    val reversedInput = reverseNumber(input)
    println("Reversed number is $reversedInput.")
}