package control_flow

fun main () {
    val button = "A";

    when(button) {
        "A" -> println("YES");
        "B" -> println("NO");
        "X" -> println("Menu");
        "Y" -> println("Nothing");
        else -> println("There is no such button");
    }
}