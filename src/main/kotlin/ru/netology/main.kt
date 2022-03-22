package ru.netology

fun main() {
    val amount = 850_000
    val minCommission = 3_500
    val percentCommission = 0.75

    val commission = if (((amount * percentCommission)/100) < minCommission) minCommission
        else ((amount * percentCommission)/100).toInt()

    println("Размер комиссии по вашему переводу составляет: $commission копеек")
}