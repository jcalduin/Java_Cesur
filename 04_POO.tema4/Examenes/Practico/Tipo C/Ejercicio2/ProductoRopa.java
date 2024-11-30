package Ejercicio2;

public class ProductoRopa extends Producto {
    private String tamanho;

    public ProductoRopa(String nombre, double precio, int cantidadStock, String tamanho) {
        super(nombre, precio, cantidadStock);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tamaño: " + tamanho);
    }

    @Override
    public double calcularPrecio() {
        if (tamanho.equalsIgnoreCase("L") || tamanho.equalsIgnoreCase("XL")) {
            return getPrecio()* 1.10;
        } else {
            return getPrecio();
        }

    }
}
