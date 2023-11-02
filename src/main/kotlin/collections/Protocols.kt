package collections

// smtp를 제공하는지 boolean값으로 표현하세요.
fun main() {
    val SUPPPORTED:Set<String> = setOf("HTTP", "HTTPS", "FTP");
    val requested:String = "smtp";

    val isSupported:Boolean = requested.uppercase() in SUPPPORTED;

    // ${}: String, Int, Float....
    // $: String
    println("Support for $requested: $isSupported");

}