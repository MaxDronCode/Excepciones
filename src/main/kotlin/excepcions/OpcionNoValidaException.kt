package models

class OpcionNoValidaException: Exception {
    constructor(): this("Opció no vàlida")
    constructor(missatgte:String) : super(missatgte)
}