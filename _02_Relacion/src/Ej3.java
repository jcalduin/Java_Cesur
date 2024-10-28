import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        Escribir un programa que calcule el área de un círculo.
        área = PI * radio * radio
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio: ");
        double radio = sc.nextDouble();
        double area = Math.PI * radio * radio;

        System.out.println("El area del círculo es: " + area);
    }
}
