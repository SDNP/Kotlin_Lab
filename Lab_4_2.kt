import kotlin.random.Random

fun fibonacci(n:Int): Int {
    if (n == 0)
        return 0
    if (n == 1)
        return 1
    return fibonacci(n-1)+fibonacci(n-2)
}

fun main() {
    println("Введіть N")
    val N = readLine()?.toInt()!!
    var i = 0
    while (i < N) {
        print(fibonacci(i))
        print(" ")
        i++
    }
}