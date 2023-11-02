package collections

fun main() {
    // 읽기 전용
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100);

    // 수정 가능한 객체
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100);

    // [] 오퍼레이터에 검색하고 싶은 key를 널으면 100이라는 값이 나온다.
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}");

    // count(): key-value 쌍의 총 갯수
    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")

    // 수정 가능한 데이터의 입력, 삭제 함수 put(), remove()
    juiceMenu.put("coconut", 150);
    println(juiceMenu);
    // {apple = 100, kiwi = 190, orange = 100, coconut = 150}

    juiceMenu.remove("orange");
    println(juiceMenu);
    // {apple = 100, kiwi = 190, coconut = 150}

    // 객체 내 key-value 확인
    println(readOnlyJuiceMenu.containsKey("kiwi"));

    // key 값만 배열로 가져오기
    println(readOnlyJuiceMenu.keys);

    // value 값만 배열로 가져오기
    println(readOnlyJuiceMenu.values);

    // 객체 내 key값을 배열로 가져와 in으로 값 유무 확인하기
    println("orange" in readOnlyJuiceMenu.keys);

    // 객체 내 value값을 배열로 가져와 in으로 값 유무 확인하기
    println(200 in readOnlyJuiceMenu.values);

}