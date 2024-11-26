package Practica_04;

public class Ford extends Car{
    private int year;
    private int manufactureDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufactureDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufactureDiscount = manufactureDiscount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufactureDiscount() {
        return manufactureDiscount;
    }

    public void setManufactureDiscount(int manufactureDiscount) {
        this.manufactureDiscount = manufactureDiscount;
    }

    @Override
    public double getSalePrice() {
        double resultado = super.getSalePrice();
        resultado -= manufactureDiscount;
        return resultado;
    }
}
