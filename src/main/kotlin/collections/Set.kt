package collections

/** 객체가 중복될 경우 하나만 만든다. **/
fun main() {

    // 읽기 전용 변수
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry");

    // 타입 선언 및 수정 가능한 변수
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry");

    // 예상값 ["apple", "banana", "cherry"]
    println(readOnlyFruit);

    // 중복되는 체리값은 삭제된다.
    // 또, 수정 후에도 변수를 그대로 두고싶다면 캐스팅한다.
    val fruitLocked: Set<String> = fruit;
    println(fruitLocked);

    // count(): 목록의 갯수를 알고싶은 경우
    println("This set has ${readOnlyFruit.count()} items");

    // 목록 내 포함되는 과일이 있는지 확인하고 싶은 경우 in
    println("banana" in fruitLocked);

    // 목록 내 String 객체를 추가하고 삭제하고 싶을 때 add(), remove()
    fruit.add("dragonFruit");
    println(fruit);

    fruit.remove("dragonFruit");
    println(fruit);

}