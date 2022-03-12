package ru.netology

fun main() {
    val discount: Int
    val musicLover = true
    val purchase = 50000

    if (purchase in 0..1_000) {
        discount = 0
    } else if (purchase in 1_001..10_000) {
        discount = 100
    } else {
        discount = purchase * 5 / 100
    }
    println("Скидка = $discount")

    var totalPrice = purchase - discount
    if (musicLover) {
        totalPrice -= totalPrice * 1 / 100
    }
    println("Сумма покупки составит = $totalPrice")
}
