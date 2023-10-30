import java.util.*

fun isPalindrome(input: String): Boolean {
    val str = input.replace(Regex("[^a-zA-Z0-9]"), "").lowercase(Locale.getDefault())
    val reversedStr = str.reversed()
    return str == reversedStr
}

fun main() {
    println(isPalindrome("Android"))
    println(isPalindrome("Radar"))
}

