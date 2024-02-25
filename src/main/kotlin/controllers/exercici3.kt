package controllers

import excepcions.*
import models.Figura

fun exercici3(){

    try {
        val figura:Figura = Figura(3,1,2,3)
        println(figura.perimetre())
    }catch (e: nombreDeCostatsMassaBaixException){
        println(e.message)
    }catch (e: numCostatsICostatsNoCoincideixException){
        println(e.message)
    }catch (e: IllegalArgumentException){
        println(e.message)
    }

}