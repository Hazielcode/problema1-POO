package tienda

fun main() {
    println("=== Tienda POO ===")

    val libro = Libro("POO en Kotlin", 50.0, "Juan Pérez")
    val juguete = Juguete("Carro RC", 80.0, 7)

    libro.mostrarInfo()
    juguete.mostrarInfo()

    val cliente1 = ClienteRegular("Carlos")
    val cliente2 = ClienteVIP("María")

    cliente1.comprar(libro)
    cliente2.comprar(juguete)
}

