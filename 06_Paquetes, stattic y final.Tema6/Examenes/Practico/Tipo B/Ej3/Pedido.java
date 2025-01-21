package Ej3;

public class Pedido {
    private int numPedido;
    private Plato[] platos;
    private Cliente cliente;
    private String fecha;

    public Pedido(int numPedido, Plato[] platos, Cliente cliente, String fecha) {
        this.numPedido = numPedido;
        this.platos = platos;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double calcularPrecioTotalPedido() {
        double precioTotal = 0;
        for (Plato p : platos) {
            if (p  != null) {
                precioTotal += p.calcularPrecioFinal();
            }
        }

        if (cliente.isDescuentoFidelidad())
            precioTotal *= 0.85;

        return precioTotal;
    }
}
