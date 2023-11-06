package functions.functions

/** memo **/
// 매개변수명을 적고 내용을 기재하면 해당 파라미터에 원하는 값이 출력된다.
fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message");
}

fun main() {
    // expect: [Log] Hello
    // or printMessageWithPrefix("Hello", "Log");
    printMessageWithPrefix(prefix = "Log", message = "Hello");
}