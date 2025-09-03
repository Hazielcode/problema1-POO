package tienda

// Clase abstracta: impone un contrato parcial y puede traer lógica común
abstract class Cliente {
    abstract val tipo: String
    abstract val nombre: String
}

// Interfaz: define un comportamiento que distintas clases pueden compartir
interface AccionCompra {
    fun comprar(producto: Producto)
}

class ClienteRegular(override val nombre: String) : Cliente(), AccionCompra {
    override val tipo: String = "Regular"
    override fun comprar(producto: Producto) {
        println("$nombre ($tipo) compró ${producto.nombre} por S/ ${producto.precio}")
    }
}

class ClienteVIP(override val nombre: String) : Cliente(), AccionCompra {
    override val tipo: String = "VIP"
    override fun comprar(producto: Producto) {
        val total = producto.precio * 0.9
        println("$nombre ($tipo) compró ${producto.nombre} con 10% de descuento: S/ $total")
    }
}
