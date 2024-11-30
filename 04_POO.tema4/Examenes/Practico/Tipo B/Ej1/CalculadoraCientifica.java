package Ej1;

public class CalculadoraCientifica extends Calculadora {

    //constructor
    public CalculadoraCientifica() {
    }
    // sobreescribo el método toString
    @Override
    public String toString() {
        return "CalculadoraCientifica{}";
    }

    //metodos

    //Sobreescribo el metodo
    @Override
    public int add(int a, int b) {
        return (int)(Math.sqrt(a) + Math.sqrt(b));
    }

    public double raizCuadrada (double numero) {
        return Math.sqrt(numero);
    }
}
