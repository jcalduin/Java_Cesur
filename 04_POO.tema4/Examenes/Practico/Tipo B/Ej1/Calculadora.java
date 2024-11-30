package Ej1;

public class Calculadora {

    //constructor
    public Calculadora() {
    }
    // sobreescribo el método toString
    @Override
    public String toString() {
        return "Calculadora{}";
    }
    // metodos:
    public int add (int a , int b){
        return a +b ;
    }

    public double add (double a , double b) {
        return a + b;
    }
    //Método sobrecargado
    public int add (int a , int b ,int c) {
        return a +b + c ;
    }
}
