package hello_world

/** memo **/
// 변수 선언
// val: final(read-only)
// var: 변경 가능한 변수(mutable variable)
fun main() {
    val popcorn = 5;    // 팝콘 5상자
    val hotdog = 7;     // 핫도그 7개
    var customers = 10; // 10명의 고객이 기다리고 있다.
    print("Before ::::: $customers \n");
    // 몇몇 고객은 떠났다.
    customers = 8;

    println("After ::::: $customers");
}

