package functions.functions

/** memo **/
// x, y의 자료형을 Int로 지정하고 반환값도 Int로 지정한다.
// main 함수에서 매개변수 값을 지정 후 반환값을 출력한다.
fun sum(x: Int, y: Int): Int {
    return x + y;
}

fun main() {
    // expect: 3
    println(sum(1, 2));
}