package collections

fun main() {
    val number2word: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three");
    val n:Int = 2;

    println("$n is spelt as '${number2word[n]}'");
}