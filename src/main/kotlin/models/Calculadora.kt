package models

import java.util.Scanner

class Calculadora {
    private var valor1 = 0
    private var valor2 = 0
    private var result = 0
    private var operador:Char = ' '

    constructor()

    fun calcular(){
        var menu = true

        do{
            this.operador = afegirOperador()
            this.valor1 = afegirValor("Introdueix el primer numero: ")
            this.valor2 = afegirValor("Introdueix el segon numero: ")

            when (this.operador) {
                '+' -> {
                    println(this.valor1 + this.valor2)
                }

                '-' -> {
                    println(this.valor1 - this.valor2)
                }

                '*' -> {
                    println(this.valor1 * this.valor2)
                }

                '/' -> {
                    try {
                        println(this.valor1 / this.valor2)
                    } catch (e: ArithmeticException) {
                        println("No es pot dividir entre 0!")
                    }
                }
                'Z' -> menu = false
                else -> println("Escull un valor valid.")
            }
        }while(menu)
    }

    private fun afegirValor(message:String):Int{
        val scan:Scanner = Scanner(System.`in`)
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

    private fun afegirOperador(): Char {
        val scan:Scanner = Scanner(System.`in`)
        var dadesOk = false
        var charOp : Char='a'
        println("Introdureix la operacio a realitzar: (+,-,*,/)")
        do {
            println("Introdueix un caracter valid")
            try {
                val input:String = scan.next()
                if (input.length == 1) charOp = input.single()
                when (charOp) {
                     '+','-','*','/','Z' -> {
                        dadesOk = true
                     }
                    else -> {
                        dadesOk = false
                        throw OpcionNoValidaException("Opcio no valida!!")
                    }
                }
            }catch (e: OpcionNoValidaException){
                println(e.message)
                dadesOk = false
            }
        }while (!dadesOk)
    return charOp
    }
}