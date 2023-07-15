package cl.samf.individual13_mod5

import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil

fun main (){
    var resultado = suma(5.5,6.4F)
    println(resultado)
    var redondeoResult = redondeo(7.8)
    println(redondeoResult)
    var resultadoMR = muestraResultado(2.2)
    println(resultadoMR)
}

//fun suma(param1: Double, param2: Float):Double{
    //return param1+param2
fun suma(param1: Double, param2: Float):Double=param1+param2

fun redondeo(param1: Double)= ceil(param1)  //ceil redondea al cielo

fun muestraResultado(numero: Double) : String {

    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("EUR"))
    return format.format(numero)

}