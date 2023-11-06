package functions.lambda_expression

fun main () {
    val numbers: List<Int> = listOf(1, -2, 3, -4, 5, -6);
    val positives:List<Int> = numbers.filter {it -> it > 0};
    val negatives:List<Int> = numbers.filter {it -> it < 0};
    val doubled:List<Int> = numbers.map { it -> it * 2 };
    val tripled:List<Int> = numbers.map { it -> it * 3 };


    // expect positive values: [1, 3, 5]
    println(positives);

    // expect negative values: [-2, -4, -6]
    println(negatives);

    // expect doubled values: [2, -4, 6, -8, 10, 12]
    println(doubled);

    // expect tripled values: [3, -6, 9, -12, 15, -18]
    println(tripled);

}