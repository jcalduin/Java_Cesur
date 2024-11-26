package Practica_03;

public class Producto_Congelado extends Producto {
    private double temperatura;

    public Producto_Congelado(String fechaCaducidad, String numeroLote, double temperatura) {
        super(fechaCaducidad, numeroLote);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Producto_Congelado: "+super.toString()+"\nTemperatura: "+temperatura;
    }
}
