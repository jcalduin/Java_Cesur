package Practica_05;

public class Electrodomestico {
    private double precioBase;
    private Color color;
    private Consumo consumo;
    private double peso;

    public Electrodomestico(double precioBase, String color, char consumo, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    public Electrodomestico(double peso, double precioBase) {
        this(precioBase,"BLANCO",'F',5.00);
    }

    public Electrodomestico() {
        this(100.00,"BLANCO",'F',5.00);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        switch (letra) {
            case 'A','a' -> consumo = Consumo.A;
            case 'B','b' -> consumo = Consumo.B;
            case 'C','c' -> consumo = Consumo.C;
            case 'D','d' -> consumo = Consumo.D;
            case 'E','e' -> consumo = Consumo.E;
            default -> consumo = Consumo.F;
        }
    }

    private void  comprobarColor (String color) {
        switch (color.toLowerCase()) {
            case "negro" -> this.color = Color.NEGRO;
            case "rojo" -> this.color = Color.ROJO;
            case "azul" -> this.color = Color.AZUL;
            case "gris" -> this.color = Color.GRIS;
            default -> this.color = Color.BLANCO;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color=" + color +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }

    public double precioFinal() {
        double precio = precioBase;

        switch (this.consumo) {
            case A -> precio +=100;
            case B -> precio +=80;
            case C -> precio +=60;
            case D -> precio +=50;
            case E -> precio +=30;
            case F -> precio +=10;
        }

        if (peso > 0 && peso < 20){
            precio+=10;
        } else if (peso >= 20 && peso < 50){
            precio+=50;
        } else if (peso >= 50 && peso < 80){
            precio+=80;
        } else {
            precio+=100;
        }
        return precio;
    }
}
