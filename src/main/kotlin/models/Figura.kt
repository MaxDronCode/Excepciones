package models

import excepcions.*
import kotlin.math.cos

class Figura(numCostats:Int, vararg costats:Int) {
    // Atributs
    private val numCostats: Int = numCostats
    private val costats: IntArray = costats

    init {
        if (numCostats < 3) {
            throw nombreDeCostatsMassaBaixException()
        }
        if (numCostats != costats.size){
            throw numCostatsICostatsNoCoincideixException()
        }
        costats.forEach {
            if (it < 0) {
                throw IllegalArgumentException("No pot haver costats de longitud negativa.")
            }
        }

    }

    fun perimetre():Int {
        var perimetre:Int = 0
        for (costat in this.costats){
            perimetre += costat
        }
        return perimetre
    }

}