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

    // 원치않는 수정을 방지하려면 다른 변수에 값을 할당에 읽기 전용을 얻을 수 있다.
    // 이걸 캐스팅이라고 한다.
    val shapesLocked: List<String> = shapes;
    println(shapesLocked);

    // 특정 목록의 항목에 접근하고 싶다면 아래와 같이 사용할 수 있다.
    println("목록의 첫번째 항목은 ${readOnlyShapes[0]}");

    // 특히 첫번째 항목이나 마지막 항목을 가져올 경우 각각  first(), last()를 활용할 수 있다.
    println("첫번째 항목은 ${readOnlyShapes.first()}");
    println("마지막 항목은 ${readOnlyShapes.last()}");

    // 목록의 항목 수를 얻으려면 .count()를 사용할 수 있다.
    println("목록의 갯수 ${readOnlyShapes.count()}");

    // 목록에 특정 항목이 있는지 확인하는 방법은 아래와 같다.
    println("circle" in readOnlyShapes);

    // 수정 가능한 목록에서 삭제와 저장을 하고싶은 경우는 아래와 같다.
    // 저장
    shapes.add("pentagon");
    println(shapes);
    // [triangle, square, circle, pentagon]

    // 삭제
    shapes.remove("pentagon");
    println(shapes);
    // [triangle, square, circle]
}
