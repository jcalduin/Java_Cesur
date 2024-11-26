package Practica_06;

public class Cilindro extends Circulo{
    private float altura;

    public Cilindro(Circulo b, float a) {
        super(b.centro(),b.radio());
        this.altura = a;
    }

    public Cilindro() {
        this.altura = 1;
    }

    public float altura() {
        return altura;
    }

    public void altura(float a) {
        this.altura = a;
    }

    @Override
    public String toString() {
        return "Cilindro de altura: "+altura +" y base "+ super.toString();
    }

    public void base (Circulo b) {
        this.x(b.x());
        this.y(b.y());
        this.radio(b.radio());
    }
}
