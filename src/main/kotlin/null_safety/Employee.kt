package null_safety
data class Employee (val name: String, var salary: Int)

fun employeeById(id: Int) = when(id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    4 -> Employee("Ann", 23)
    else -> null
}

// id 값으로 임직원 정보를 조회해 급여를 검색한다, 단 급여가 null일 경우 0을 반환한다.
fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

fun main() {
    // 20 + 21 + 23 = 64
    println((1..5).sumOf { id -> salaryById(id) })
}