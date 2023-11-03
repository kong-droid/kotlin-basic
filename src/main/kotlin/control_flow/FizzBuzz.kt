package control_flow

fun main() {
    for(number in 1..100) {
        when {
            number % 15 == 0 -> println("fizzbuzz");
            number % 5 == 0 -> println("fizz");
            number % 3 == 0 -> println("buzz");
            else -> println(number.toString());
        }
    }
}