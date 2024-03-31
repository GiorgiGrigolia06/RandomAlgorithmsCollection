fun checkForDollarSign(input: String): Boolean {
    return input.contains('$')
}

fun main() {
    println(checkForDollarSign("Dollar Sign - $"))
    println(checkForDollarSign("Dollar Sign"))
}