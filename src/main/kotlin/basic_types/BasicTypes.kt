package basic_types
/** memo **/
// 코틀린은 모든 변수의 구조 및 자료형을 가지고 있다.
// 사용자가 데이터를 입력하면 컴파일러가 자료와 구조를 파악 후 알려줘야 한다.
// 즉, 기능과 속성을 정의할 수 있다.
// +=, -=, *=, /=, %= 는 증감 할당 연산자이다.
fun main() {
    // 10명의 고객이..
    var customer = 10;

    // 8명이 되었다.
    customer = 8;

    customer = customer + 3;    // 11명이 되었다.
    customer += 7;              // 18명이 되었다.
    customer -= 3;              // 15명이 되었다.
    customer *= 2;              // 30명이 되었다.
    customer /= 3;              // 10명이 되었다.
    customer %= 5;              // 0명이다, 퇴근각..

    println(customer);
}
