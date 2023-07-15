package com.example.trecekotlin

import kotlin.math.ceil

class Trece2 {
}
fun main() {
    var resultado = suma(5.5, 6.4F)
    println(resultado)
    var redonde = redondeo(param1 = 7.6)
    println(redonde)
}

fun suma(param1: Double, param2: Float): Double = param1 + param2

fun redondeo(param1: Double) = ceil(param1)
