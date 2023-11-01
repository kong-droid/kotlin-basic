package hello_world

/** memo **/
// 코틀린은 변수의 타입을 지정하지 않아도 된다.
// 다만, 코틀린은 변수에 입력된 값을 기준으로 변수의 타입을 판단한다.
// String Template 내에서 정수를 수정하고 싶은 경우 ${} 사이에 두고 연산한다.
fun main() {
    val customers = 10;

    // 10명의 고객이 있다.
    println("there are $customers customers.");

    // 11명의 고객이 있다.
    println("there are ${customers + 1} customers.");
}