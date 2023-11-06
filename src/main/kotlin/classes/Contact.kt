package classes

// 클래스명 소괄호에 변수를 지정할 수 있다.
// 소괄호 뒤에 중괄호에 바디값에 적용되는 객체를 선언할 수 있다.
class Contact(val id: Int, var email: String= "example@gmail.com") {
    // 클래스 인스턴스가 생선된 후 속성을 변경하는 경우가 아니라면 읽기 전용으로 선언하는 것이 좋다.
    // 괄호 안에 val or var 없이 속성을 선언할 수 있으나 인스턴스가 생선된 후에는 이러한 속성에 엑세스할 수 없다.
    val category: String = "work"

    // 클래스 안에서 객체의 행위를 함수로 지정할 수 있다.
    fun printId() {
        println(id);
    }

}

fun main() {
    val contact = Contact(1, "mary@gmail.com");

    // Prints the value of the property: email
    // expect: mary@gmail.com
    println(contact.email);

    // Updates the value of the property: email
    contact.email = "jane@gmail.com";

    // Prints the new value of the property: email
    // expect: jane@gmail.com
    println(contact.email);

    // string template
    println("Their email address is: ${contact.email}");

    // 클래스 내 함수 호출
    contact.printId();

}