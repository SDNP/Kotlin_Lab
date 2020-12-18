import java.util.*
import kotlin.random.Random
val scan = java.util.Scanner(System.`in`)

fun main() {
    println("Введіть кількість елементів:")
    val n = readLine()?.toInt()!!
    val array: Array<Int> = Array(n,{0})
    var i = 0

    while (i < array.size) {
        array[i] = Random.nextInt(10)
        print(array[i])
        print(" ")
        i++
    }
    println()
    val sum = array.sum()
    var l = array.size
    val sa = sum/l
    println("Середнє арифметичне чисел зі списку: $sa")
    println("Значення менші за середнє арифметичне")
    for (i in array)
        if (i<sa)
            println(i)

}