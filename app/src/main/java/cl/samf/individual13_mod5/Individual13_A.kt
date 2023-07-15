package cl.samf.individual13_mod5

import kotlin.math.ceil

fun main (){
    var resultado = suma(5.5,6.4F)
    println(resultado)
    var redondeoResult = redondeo(7.8)
    println(redondeoResult)
}

//fun suma(param1: Double, param2: Float):Double{
    //return param1+param2
fun suma(param1: Double, param2: Float):Double=param1+param2




fun redondeo(param1: Double)= ceil(param1)  //ceil redondea al cielo