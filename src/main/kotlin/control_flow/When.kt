package control_flow

fun main() {
    val obj = "Hello";

    // expect value: Greeting
    when(obj) {
        "1" -> println("One");
        "Hello" -> println("Greeting");
        else -> println("Unknown");
    }

    val result:String = when (obj) {
        "1" -> "One"
        "Hello" -> "Greeting";
        else -> "Unknown";
    }

    // expect value: Greeting
    println(result);

    val temp:Int = 18;
    val description:String = when {
        (temp < 0) -> "very cold"
        (temp < 10) -> "a bit cold"
        (temp < 20) -> "warm"
        else -> "hot"
    }

    // expect value: warm
    println(description);


}