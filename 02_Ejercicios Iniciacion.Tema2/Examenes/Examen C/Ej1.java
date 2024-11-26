import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*
         Escribe un programa que calcule la suma de todos los números enteros
         del 1 al n, donde n es un número ingresado por el usuario.
            Ejemplo:
                    Escribe un número: 90
                    La suma de los números del 1 al 90 es: 4095
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int num = sc.nextInt();
        sc.close();
        int suma=0;

        for (int i = 1; i <= num ; i++) {
            suma+=i;
        }
        System.out.printf("La suma de los número del 1 al %d es: %d", num, suma);
    }
}