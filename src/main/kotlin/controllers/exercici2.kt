package utilities

import models.Calculadora
import models.OpcionNoValidaException
import java.util.*
fun exercici2() {
    val scan: Scanner = Scanner(System.`in`)

    println("Benvingut a la Calculadora!")
    var calculadora: Calculadora = Calculadora()

    calculadora.calcular()
}