package functions.lambda_expression

// action()은 콜백함수에 해당한다.
// 해당 함수를 5번 돌린다는 의미를 가진다.
fun repeatN(n:Int, action: () -> Unit) {
    for (i in 1..n) {
        action();
    }
}

fun main() {
    repeatN(5) {
        println("HELLO");
    }
}