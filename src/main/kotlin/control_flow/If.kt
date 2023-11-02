package control_flow

fun main() {
    var d: Int;
    val check:Boolean = true;

    if(check) d = 1
    else d = 2

    // 예상값 1
    println(d);


    val a:Int = 1;
    val b:Int = 2;

    // 예상값 2
    if(a > b) {
        println(a);
    } else {
        println(b);
    }
}