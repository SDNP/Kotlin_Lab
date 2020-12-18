import java.util.*
import kotlin.random.Random
val s = java.util.Scanner(System.`in`)

fun main() {
    println("Введіть кількість елементів:")
    val n = readLine()?.toInt()!!
    val array: Array<Int> = Array(n, { 0 })
    var i = 0

    while (i < array.size) {
        array[i] = Random.nextInt(10)
        print(array[i])
        print(" ")
        i++
    }
    println()
    val sortedArray: Array<Int> = array.sortedArray()
    println("Original array ${array.contentToString()}: sorted array ${sortedArray.contentToString()}")
    println("Елементи, які після впорядкування за зростанням збільшили свій номер")
    i = 0
    while (i < array.size) {
        if (array[i] > sortedArray[i])
            println(array[i])
        i++
    }

}


