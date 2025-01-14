package Practica_04;

public class ProductoElectronico extends Producto {
    private int garantia;

    public ProductoElectronico(String nombre, double precioInicial, int garantia) {
        super(nombre, precioInicial);
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
        System.out.println("Garantia: " + garantia);
    }
}
