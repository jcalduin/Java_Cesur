package Practica_04;

public class Sedan extends Car{
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        double resultado = super.getSalePrice();
        if (length > 20) {
            resultado *= 0.95;
        } else {
            resultado *= 0.9;
        }
        return resultado;
    }
}
