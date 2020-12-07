import java.util.*
val sc = java.util.Scanner(System.`in`)

fun main(){
    print("Введіть рік після 1984 -")
    val y = sc.nextInt()
    val c = (y - 1984) % 60
    val kl = c / 12
    var color = " "
    val tv = c % 12
    var animal = " "
    when(kl){
        1 -> {color ="зелений"}
        2 -> {color ="червоний"}
        3 -> {color ="білий"}
        4 -> {color ="чорний"}
    }
    when(tv){
        0 -> {animal="щура"}
        1 -> {animal="корови"}
        2 -> {animal="тигра"}
        3 -> {animal="зайця"}
        4 -> {animal="дракона"}
        5 -> {animal="змії"}
        6 -> {animal="коня"}
        7 -> {animal="вівці"}
        8 -> {animal="мавпи"}
        9 -> {animal="курки"}
        10 -> {animal="собаки"}
        11 -> {animal="свині"}
    }
    println("$y - це  $color рік $animal")
}