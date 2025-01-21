package Ejercicio3;

public class Restaurante {

    public static void mostrarDetallesPedido(Pedido pedido) {
        System.out.printf(
                "Pedido #%d\nCliente: %s\nFecha: %s\nPrecio total del Pedido con IVA: %.2f€\n",
                pedido.getNumPedido(),
                pedido.getCliente().getNombre(),
                pedido.getFecha(),
                pedido.calcularPrecioTotalPedido() * 1.21
        );
        System.out.println("---------------");
    }
}
