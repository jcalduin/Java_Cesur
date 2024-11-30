package Ejercicio2;

public class ProductoAlimenticio extends Producto {
    private String fechaVencimiento;

    public ProductoAlimenticio(String nombre, double precio, int cantidadStock, String fechaVencimiento) {
        super(nombre, precio, cantidadStock);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Fecha de Vencimiento: " + fechaVencimiento);
    }

    @Override
    public double calcularPrecio() {
        if (fechaVencimiento.equalsIgnoreCase("proximo mes")){
            return getPrecio() * 0.8;
        } else {
            return getPrecio();
        }
    }
}
