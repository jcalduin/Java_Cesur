package Practica_05;

public class Lavadora extends Electrodomestico{
    public double carga;

    public Lavadora(double precioBase, String color, char consumo, double peso, double carga) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    public Lavadora(double peso, double precioBase) {
        super(peso, precioBase);
        this.carga = 5;
    }

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        return super.toString()+ " Lavadora{" +
                "carga=" + carga +
                '}';
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal() + 50;
        if (carga > 30) {
            precio += 50;
        }
        return precio;
    }
}
