package functions.lambda_expression

fun main() {
    println({message:String -> message.uppercase()}("hI"));
}