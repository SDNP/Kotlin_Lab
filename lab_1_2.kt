import java.util.*
val s = java.util.Scanner(System.`in`)

fun main(){
    println("Введіть кількість елементів:")
    var k = 0
    var kol = 0
    val size = readLine()?.toInt()!!
    val array = Array<String?>(size){""}
    var i = 0
    while (i < size) {
        k++
        println("Введіть " + i + " елемент послідовності")
        array[i] = readLine()
        if ((k%2==0) && (i%2!=0)) kol++
            i++
    }
    print("Послідовність :" + " ")
    i -= 1
    while (i > -1) {
        print(array[i]+" ")
        i--
    }
    println()
    println("Кількість членів, які мають парні порядкові номери і є непарними числами - $kol")
}