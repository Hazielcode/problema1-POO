package tienda

open class Producto(open val nombre: String, open val precio: Double) {
    open fun mostrarInfo() {
        println("Producto: $nombre — Precio: S/ $precio")
    }
}

class Libro(nombre: String, precio: Double, val autor: String) : Producto(nombre, precio) {
    override fun mostrarInfo() {
        println("Libro: $nombre — Autor: $autor — Precio: S/ $precio")
    }
}

class Juguete(nombre: String, precio: Double, val edadMinima: Int) : Producto(nombre, precio) {
    override fun mostrarInfo() {
        println("Juguete: $nombre — Edad mínima: $edadMinima — Precio: S/ $precio")
    }
}
