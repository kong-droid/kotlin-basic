package functions.lambda_expression

fun main() {
    // fold: 목록의 전체 값을 더한 값과 지정한 값을 연산할 때 쓰인다.
    // expect: 6
    println(listOf(1,2,3).fold(0, {x, item -> x + item}));
    // expect: 6
    println(listOf(1,2,3).fold(0) {x, item -> x + item});
}