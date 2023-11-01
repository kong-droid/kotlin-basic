package collections

/** memo **/
// listOf(): 읽기 전용 목록을 만든다.
// mutableListOf(): 수정할 수 있는 목록을 만든다.
// 목록의 타입을 선언할 때 <>안에 정의할 수 있다.
fun main() {
    // 읽기 전용 목록
    val readOnlyShapes = listOf("triangle", "square", "circle");
    println(readOnlyShapes);
    // [triangle, square, circle]

    // 수정이 가능한 목록을 선언한다. 물론, 타입도 함께
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle");
    println(shapes)
    // [triangle, square, circle]
}