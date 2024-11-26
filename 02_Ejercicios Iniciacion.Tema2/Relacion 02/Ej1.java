import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*
        Escribir un programa que permita leer la edad y peso de una persona y
        posteriormente imprimirla
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduzca su peso: ");
        double peso = sc.nextDouble();

        System.out.println("Tienes "+edad+" años y pesas "+peso+"kg.");

        sc.close();
    }
}
