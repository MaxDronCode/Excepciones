package excepcions

class numCostatsICostatsNoCoincideixException:Exception {
    constructor(): this("El nombre de costats indicat, i el que s'envia, no coincideixen.")
    constructor(missatgte:String) : super(missatgte)
}