package Practica_04;

public class Truck extends Car{
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        double resultado = super.getSalePrice();
        if (weight > 2000){
            resultado *= 0.9;
        } else {
            resultado *= 0.8;
        }
        return resultado;
    }
}
