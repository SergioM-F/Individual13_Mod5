package cl.samf.individual13_mod5

data class Superhero(val superhero: String, val publisher: String,val realName: String, var photo: String)
{


}

fun main() {

    var heroes = mutableListOf<Superhero>()
    var cant = 1
    while (cant == 1) {

        println("Nombre")
        var nombre = readln()
        println("Publisher")
        var publisher = readln()
        println("Nombre Real")
        var realName = readln()
        println("Foto")
        var foto = readln()

        heroes.add(Superhero(nombre, publisher, realName, foto))

        println("ingrese 1 para continuar")
        cant = readLine()?.toIntOrNull() ?: 0
    }

    println(heroes)
}