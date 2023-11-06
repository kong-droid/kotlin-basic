package functions.lambda_expression

fun toSeconds(time: String): (Int) -> Int = when(time) {
    "hour" -> {value -> value * 60 * 60}
    "minute" -> {value -> value * 60}
    "second" -> {value -> value}
    else -> {value -> value}
}

fun main() {
    val timeInMinutes:List<Int> = listOf(2, 10, 15, 1);
    val min2sec = toSeconds("minute");
    val totalTimeInSeconds = timeInMinutes.map(min2sec).sum();
    // expect: 1680
    println("Total time is $totalTimeInSeconds secs")
}