package Ejercicio2;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
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

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double calcularPrecio() {
        return precio;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre+"\nPrecio: " + precio+"€\nCantidad en stock: " + cantidadStock);
    }

    public void disponibilidad() {
        if (cantidadStock > 0) {
            System.out.println("Esta disponible");
        }
    }
}
