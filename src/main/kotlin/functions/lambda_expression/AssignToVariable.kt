package functions.lambda_expression

val lambdaExpression = {expression: String -> expression.uppercase()};

fun main() {
    // expect: HELLO
    println(lambdaExpression("hello"));
}