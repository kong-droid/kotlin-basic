package null_safety

fun lengthString(maybeString: String?): Int? = maybeString?.length;

fun main() {
    var nullString: String? = null;

    // expect: null
    println(lengthString(nullString));
}