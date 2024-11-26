package Practica_03;

public class Producto_Refrigerado extends Producto {
    private String codigo;

    public Producto_Refrigerado(String fechaCaducidad, String numeroLote, String codigo) {
        super(fechaCaducidad, numeroLote);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto_Refrigerado " + super.toString() +"\ncodigo: " + codigo;
    }
}
