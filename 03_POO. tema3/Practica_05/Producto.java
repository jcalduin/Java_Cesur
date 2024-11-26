package Practica_05;
/*
Crea una clase Producto con los siguientes atributos:
• nombre (tipo String)
• precio (tipo double)
• cantidadEnStock (tipo int)
Define un constructor para inicializar estos atributos.
Crea métodos:
• venderProducto(int cantidad): disminuye cantidadEnStock según la
cantidad vendida, si hay suficiente stock.
• reabastecer(int cantidad): aumenta cantidadEnStock con el valor
dado.

Crea un metodo main() donde crees un objeto Producto, realices algunas
ventas y reabastecimientos, y muestres el stock actual.
 */

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public void venderProducto(int cantidad) {
        if (cantidad <= cantidadEnStock){
            this.cantidadEnStock -= cantidad;
            System.out.println("Se han vendido "+cantidad+" unidades de "+nombre+" . Te quedan "+cantidadEnStock);
        } else {
            System.out.println("No hay suficiente Stock de "+nombre);
        }
    }
    public void reabastecer(int cantidad){
        this.cantidadEnStock += cantidad;
        System.out.println("Se han añadido "+cantidad+" unidades al stock de "+nombre);
        System.out.println("Ahora tienes "+cantidadEnStock+" unidades de "+nombre);
    }
}
