var first = 0
var second = 1
var sum = 0
var count = 0

fun cycle() {
    for (i in 0..19) {
        println(sum)
        sum = first + second
        first = second
        second = sum
    }
}

fun recursion() {
    println(sum)
    count++
    if (count != 20) {
        sum = first + second
        first = second
        second = sum
        recursion()
    }

}

fun main() {
    //recursion()
    cycle()
}