package Ej3;

public class Cliente {
    private String nombre;
    private Pedido[] pedidos;
    private int contadorPedidos =0;
    private final boolean descuentoFidelidad;
    private final int umbralPedidos = 10;

    public Cliente(String nombre) {
        this.nombre = nombre;
        pedidos = new Pedido[umbralPedidos];
        this.contadorPedidos = contadorPedidos();
        this.descuentoFidelidad = comprobarFidelidad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }

    public int getContadorPedidos() {
        return contadorPedidos;
    }

    public void setContadorPedidos(int contadorPedidos) {
        this.contadorPedidos = contadorPedidos;
    }

    public boolean isDescuentoFidelidad() {
        return descuentoFidelidad;
    }

    public int getUmbralPedidos() {
        return umbralPedidos;
    }

    public boolean comprobarFidelidad() {
        boolean fidelidad = false;
        if (contadorPedidos > 5)
            fidelidad = true;
        return fidelidad;
    }

    public int contadorPedidos() {
        int contador=0;
        for (Pedido p : pedidos) {
            if (p != null){
                contador++;
            }
        }
        return contador;
    }
}
