package control_flow

fun main() {

    // for 문은 소괄호 내 컨디션을 처리한다. in으로 범위를 처리한다.
    // 중괄호 내에 반복문을 돌리는 동안 코드를 작성한다.
    for (number in 1..5) {
        // 기대값 12345
        print(number);
    }

    // 컬렉션 타입도 반복문을 사용할 수 있다.
    val cakes:List<String> = listOf("carrot", "cheese", "chocolate");
    for(cake in cakes) {
        println("Yummy, it's a $cake cake!");
    }

    // while는 두 가지 방법이 있다.
    // while: 특정 조건이 true가 될 때 까지 반복문을 돌림
    // do-while: 코드의 첫번째 조건을 확인 한후 반복문을 돌림
    // while 뒤 소괄호에는 조건문을 적고, 중괄호에는 부합하기 전 까지 작업하는 코드를 작성한다.
    var cakesEaten = 0;
    var cakesBaked = 0;
    while (cakesEaten < 3) {
        println("Eat a cake.");
        cakesEaten ++;
    }

    // do 안의 중괄호에 반복문을 돌릴 코드를 작성한다.
    // while 뒤 소괄호에 조건문을 기재한다. 조건문이 true일 때 까지 반복한다.
    do {
        println("Bake a cake.");
        cakesBaked ++;
    } while (cakesBaked < cakesEaten);
}