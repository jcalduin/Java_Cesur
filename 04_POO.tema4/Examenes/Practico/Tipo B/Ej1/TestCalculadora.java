package Ej1;

import java.sql.SQLOutput;

public class TestCalculadora {
    public static void main(String[] args) {

        //instancia de calculadora

        Calculadora calc = new Calculadora();

        System.out.println("Suma de enteros (Calculadora): "+calc.add(5,7));
        System.out.println("Suma de doubles (Calculadora): "+calc.add(7.6,2.3));
        System.out.println("Suma de tres enteros (Calculadora): "+calc.add(10,5,12));

        //Instancia de calculadora cientifica

        CalculadoraCientifica caclCientif = new CalculadoraCientifica();

        System.out.println("Suma avanzada (Calculadora cientifica): "+ caclCientif.add(25,9));
        System.out.println("Raíz cuadrada (Calculadora cientifica): "+ caclCientif.raizCuadrada(16));
    }
}
