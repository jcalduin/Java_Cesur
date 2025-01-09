package Practica_05;

public class Television extends Electrodomestico{
    private double resolucion;
    private boolean tdt;

    public Television(double precioBase, String color, char consumo, double peso, double resolucion, boolean tdt) {
        super(precioBase, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Television(double peso, double precioBase) {
        super(peso, precioBase);
        this.resolucion = 20;
        this.tdt = false;
    }

    public Television() {
        super();
        this.resolucion = 20;
        this.tdt = false;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    @Override
    public String toString() {
        return super.toString()+" Television{" +
                "resolucion=" + resolucion +
                ", tdt=" + tdt +
                '}';
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 40) {
            precio *=1.3;
        }
        if (tdt) {
            precio += 50;
        }
        return precio;
    }
}
