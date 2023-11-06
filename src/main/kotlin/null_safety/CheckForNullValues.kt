package null_safety

fun describeString(maybeString: String?): String {
    if(maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}";
    } else {
        return "Empty or null string";
    }
}

fun main() {
    var nullString: String? = null
    // Empty or null string
    println(describeString(nullString));
    // null
    println(nullString?.length ?: 0);
}