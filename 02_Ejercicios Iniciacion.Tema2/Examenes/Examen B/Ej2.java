import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea un número entero y cuente cuántos dígitos tiene.
            Ejemplo:
                    Escribe un número: 3412
                    El número 3412 tiene 4 dígitos.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        sc.close();
        int cifras=0;
        int n = num;

        while (num > 0) {
            num/=10;
            cifras++;
        }

        System.out.printf("El número %d tiene %d cifras", n, cifras);
    }
}