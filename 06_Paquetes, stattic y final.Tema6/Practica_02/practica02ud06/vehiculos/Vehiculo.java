package Practica_02.practica02ud06.vehiculos;

public class Vehiculo {
    private int numRuedas;
    private String marca;
    private double kilometraje;
    private Color color;
    private String matricula;

    public Vehiculo(int numRuedas, String marca, double kilometraje, String color, String matricula) {
        this.numRuedas = numRuedas;
        this.marca = marca;
        this.kilometraje = kilometraje;
        comprobarColor(color);
        this.matricula = matricula;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numRuedas=" + numRuedas +
                ", marca='" + marca + '\'' +
                ", kilometraje=" + kilometraje +
                ", color=" + color +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    public void comprobarColor(String color) {
        switch (color.toLowerCase()) {
            case "blanco" -> this.color = Color.BLANCO;
            case "gris" -> this.color = Color.GRIS;
            case "rojo" -> this.color = Color.ROJO;
            case "azul" -> this.color = Color.AZUL;
            default -> this.color = Color.NEGRO;
        }
    }
}
