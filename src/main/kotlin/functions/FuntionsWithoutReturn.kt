package functions

fun printMessage(message: String) {
    // 응답값이나 반환 타입을 지정하지 않아도 된다.
    println(message);
}

fun main () {
    // expect: Hello
    printMessage("Hello");
}