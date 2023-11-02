package collections

// 그린과 레드의 리스트의 총 갯수를 구하시오.
fun main() {
    val greenNumbers = listOf(1, 4, 23);
    val redNumbers = listOf(17, 2);

    // total count
    println("${greenNumbers.count() + redNumbers.count()}");
}