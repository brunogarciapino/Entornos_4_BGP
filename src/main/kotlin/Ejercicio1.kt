fun notasString(nota:Int){
    when (nota){
       in (0..4) -> println("Suspenso")
       in (5..6) -> println("Aprobado")
       in (7..8) -> println("Notable")
       in (9..10) -> println("Sobresaliente")
    }
}
fun main() {
 println("Introduce tu nota")
    var nota = readLine()?.toInt()
    if (nota !in 0..10){
        println("El valor introducido no es correcto")
    }
    if (nota != null) {
        notasString(nota)
    }

}

