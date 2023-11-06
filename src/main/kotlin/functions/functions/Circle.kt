package functions.functions

import kotlin.math.PI

fun circleArea(x: Int): Double {
  return x * x * PI;
};

fun main() {
    println(circleArea(2));
}