import java.util.*
import kotlin.random.Random

val sc = java.util.Scanner(System.`in`)

fun main(){
    println("Введіть строку:")
    val s = readLine()!!.split(" ")
    val totalwords = s.size
    println("Кількість слів: $totalwords")
    val vowel: Array<String> = arrayOf("aeiouy")
    var i = 0
    var kol = 0
    while (i < totalwords+1) {
        if (s[i] == vowel[i]) {
            kol = kol + 1
        }
        i++
    }

    println(kol)
}