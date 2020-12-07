import java.util.*
val scan = java.util.Scanner(System.`in`)

fun main() {
    print("Введіть значення -")
    var n = scan.nextInt()
    var a = 3
    var count = 1
    loop@ while (a <= n) {
        if (a==n) {
            println("$n є $count степенем від 3")
            break@loop
        }
        else{
            a *= 3
            count += 1
        }
    }
    if (a > n) {
        println("$n не є степенем від 3")
    }
}

