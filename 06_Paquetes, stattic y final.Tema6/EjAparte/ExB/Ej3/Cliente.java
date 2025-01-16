package ExB.Ej3;

import java.util.Arrays;

public final class Cliente {
    private String nombre;
    private Pedido[] pedidos;
    private int contadorPedidos=0;
    private final int umbralPedidos=10;
    private final boolean descuentoFidelidad;

    public Cliente(String nombre) {
        this.nombre = nombre;
        pedidos = new Pedido[umbralPedidos];
        comprobarNumPedidos();
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

    public int getUmbralPedidos() {
        return umbralPedidos;
    }

    public boolean isDescuentoFidelidad() {
        return descuentoFidelidad;
    }

    public void comprobarNumPedidos() {
        for(Pedido p : pedidos) {
            if(p != null) {
                this.contadorPedidos++;
            }
        }
    }

    public boolean comprobarFidelidad() {
        boolean fidelidad=false;
        if(this.contadorPedidos > 5) {
            fidelidad = true;
        }
        return fidelidad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", pedidos=" + Arrays.toString(pedidos) +
                ", contadorPedidos=" + contadorPedidos +
                ", umbralPedidos=" + umbralPedidos +
                ", descuentoFidelidad=" + descuentoFidelidad +
                '}';
    }
}
