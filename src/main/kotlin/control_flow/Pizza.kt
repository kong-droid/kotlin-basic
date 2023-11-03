package control_flow

fun main() {
    var pizzaSlices:Int = 0;

    do {
        pizzaSlices ++;
        println("There's only $pizzaSlices slice/s of pizza :(");
    } while (pizzaSlices < 7)

    pizzaSlices ++;
    println("There are $pizzaSlices slices if pizza. Hooray! We have a whole pizza! :D");
}