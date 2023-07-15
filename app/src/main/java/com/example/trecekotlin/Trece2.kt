package com.example.trecekotlin

import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil

class Trece2 {
}
fun main() {
    var resultado = suma(5.5, 6.4F)
    println(resultado)
    var redonde = redondeo(param1 = 7.6)
    println(redonde)
    var muestraResult= muestraResultado(8.57)
    println(muestraResult)
}

fun suma(param1: Double, param2: Float): Double = param1 + param2

fun redondeo(param1: Double) = ceil(param1)

fun muestraResultado(numero: Double) : String {

    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("EUR"))
    return format.format(numero)

}