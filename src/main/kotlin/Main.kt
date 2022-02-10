fun main() {

    var array = Array<Int>(20) { (0..500).random() }
    array.forEach { if (it % 2 == 0) println(it) }
    print("El array ordenado es:${array.sorted()}\n")
    println("El primer elemento es :${array.minOrNull()} y el ultimo elemento es ${array.maxOrNull()}")
    println("La suma de todos los elementos del array es: ${array.sumOf { it }}\nArray sin pares:")
    for (i in 0..array.size - 1) {
        if (array[i] % 2 == 0) {
            array[i] = 0
        }
    }
    for (i in 0..array.size - 1) {
        print("${array[i]},")
    }
}
