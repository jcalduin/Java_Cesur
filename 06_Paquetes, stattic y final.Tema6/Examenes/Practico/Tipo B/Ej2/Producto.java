package Ej2;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;
    private CategoriaProducto categoria;
    private static double descuentoGlobal=10;

    public Producto(String nombre, double precio, int cantidadEnStock, CategoriaProducto categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        this.categoria = categoria;
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

    public static double getDescuentoGlobal() {
        return descuentoGlobal;
    }

    public static void setDescuentoGlobal(double descuentoGlobal) {
        Producto.descuentoGlobal = descuentoGlobal;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public double calcularPrecioFinal() {
        double precioFinal = 0;
        double descuentoGlobal = 100 - Producto.getDescuentoGlobal();
        descuentoGlobal /= 100;
        if (getCategoria() == CategoriaProducto.ROPA)
            precioFinal = (precio * 0.90) * descuentoGlobal;
        else if (getCategoria() == CategoriaProducto.ELECTRONICA)
            precioFinal = precio * 0.95 * descuentoGlobal;
        else
            precioFinal = precio * 0.85 * descuentoGlobal;

        return precioFinal;
    }
}
