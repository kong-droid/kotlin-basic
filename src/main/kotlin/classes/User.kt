package classes

data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1);
    val secondUser = User("Alex", 1);
    val thirdUser = User("Max", 2);

    // Automatically uses toString() function so that output is easy to read
    // User(name=Alex, id=1)
    println(user.toString());

    // Compare user to second user
    // expect: true
    println("user == second user: ${user == secondUser}");

    // Compare user to third user
    // expect: false
    println("user == third user: ${user == thirdUser}");

    // Creates an exact copy of user
    println(user.copy());

    // Creates a copy of user with name: "Max"
    println(user.copy(name= "Max"));

    // Creates a copy of user with id: 3
    println(user.copy(id= 3));
}