package ExB.Ej3;

import java.util.Arrays;

public class Pedido {
    private int numPedido;
    private Plato[] platos;
    private Cliente cliente;
    private String fechaPedido;

    public Pedido(int numPedido, Cliente cliente, String fechaPedido, Plato[] platos ) {
        this.numPedido = numPedido;
        this.platos = platos;
        this.cliente = cliente;
        this.fechaPedido = fechaPedido;
    }

    public Plato[] getPlatos() {
        return platos;
    }

    public void setPlatos(Plato[] platos) {
        this.platos = platos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public double precioTotal() {
        double total = 0;
        for (Plato plato : platos) {
            total+= plato.calcularPrecioFinal();
        }
        if (cliente.isDescuentoFidelidad())
            total*=0.85;
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numPedido=" + numPedido +
                ", platos=" + Arrays.toString(platos) +
                ", cliente=" + cliente +
                ", fechaPedido='" + fechaPedido + '\'' +
                '}';
    }
}
