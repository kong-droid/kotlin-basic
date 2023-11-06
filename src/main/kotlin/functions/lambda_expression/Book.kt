package functions.lambda_expression

fun main() {
    val action: List<String> = listOf("title", "year", "author");
    val prefix: String = "https://example.com/book-info";
    val id:Int = 5;
    val urls = action.map{it -> prefix + "/" + id + "/" + it};
    println(urls);
}