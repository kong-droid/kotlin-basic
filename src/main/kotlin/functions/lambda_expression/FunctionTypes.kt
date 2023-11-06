package functions.lambda_expression

// (message: String, prefix: String) 매개변수명과 타입 지정, -> String (리턴 타입),
// { message, prefix ->  "[$prefix] $message" } 리턴값에 맞춘 답
val log: (message: String, prefix: String) -> String = { message, prefix ->  "[${prefix.lowercase()}] ${message.lowercase()}" };

fun main() {
    println(log("HELLO", "LOG"));
}
