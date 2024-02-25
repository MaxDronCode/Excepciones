package models

import java.util.Scanner

class Divisio {

    private var valor1:Int = 0
    private var valor2:Int = 0
    private var result = 0

    constructor()

    fun dividir(): Int {

        valor1 = afegirValor("Introdueix el primer numero: ")
        valor2 = afegirValor("Introdueix el segon numero: ")

        try {
            this.result = valor1/valor2
        } catch (e:ArithmeticException) {
            println("No es pot dividir entre 0!")
        }

        return result
    }

    private fun afegirValor(message:String):Int{
        val scan: Scanner = Scanner(System.`in`)
        var num=0
        var dadesOk:Boolean = true
        do {
            try {
                println(message)
                num = Integer.parseInt(scan.next())
                dadesOk = true
            } catch (e: NumberFormatException){
                println("Tipus de dada incorrecte!")
                dadesOk = false
            }
        }while(!dadesOk)
        return num
    }
}