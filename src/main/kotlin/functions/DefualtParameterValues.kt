package functions

fun printMessageWithPrefixForDefault(message: String, prefix: String = "Info") {
    println("[$prefix] message");
}

fun main() {
    // Function called with both parameters
    // expect: [Log] Hello
    printMessageWithPrefixForDefault("Hello", "Log");

    // Function called only with message parameter
    // expect: [Info] Hello
    printMessageWithPrefixForDefault("Hello");

    // expect: [Log] Hello
    printMessageWithPrefixForDefault(prefix = "Log", message = "Hello");
}