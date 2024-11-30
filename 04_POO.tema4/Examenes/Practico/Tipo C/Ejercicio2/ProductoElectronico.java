package Ejercicio2;

public class ProductoElectronico extends Producto {
    private int garantia;

    public ProductoElectronico(String nombre, double precio, int cantidadStock, int garantia) {
        super(nombre, precio, cantidadStock);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Garantia: " + garantia+" años");
    }

    @Override
    public double calcularPrecio() {
        if (garantia >= 2) {
            return getPrecio() * 0.9;
        } else {
            return getPrecio();
        }
    }
}
