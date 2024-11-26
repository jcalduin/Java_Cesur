package Practica_06;

public class Circulo extends Punto {
    private float radio;

    public Circulo(Punto p, float r) {
        super(p.x(), p.y());
        this.radio = r;
    }

    public Circulo() {
        this.radio = 1;
    }

    public float radio() {
        return radio;
    }

    public void radio(float r) {
        this.radio = r;
    }

    @Override
    public String toString() {
        return "Radio: "+ radio + " centro: " +super.toString();
    }

    public void centro (Punto p) {
        this.x(p.x());
        this.y(p.y());
    }

    public Punto centro() {
        return new Punto(x(), y());
    }
}
