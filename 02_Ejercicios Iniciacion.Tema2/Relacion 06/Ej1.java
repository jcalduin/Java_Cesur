import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*
        Escribir un programa que lea un número (x) y pida (x) números, de forma
        que determine cuál es el menor de ellos, el mayor de todos ellos y el valor medio
        de los números pares que se hayan escrito.
         */

        Scanner sc = new Scanner(System.in);
        int veces;

        do {
            System.out.print("Introduzca el número de veces: ");
            veces = sc.nextInt();
        } while (veces <= 0);

            System.out.print("Introduzca el número 1: ");
            int num = sc.nextInt();
            int mayor = num;
            int menor = num;
            int par = 0;
            int sumaPar = 0;

            if (num % 2 == 0 && num != 0){
                sumaPar = num;
                par++;
            }

            for (int i = 2; i <= veces; i++) {
                System.out.print("Introduzca el número "+ i+ ": ");
                int x = sc.nextInt();
                if (x > mayor){
                    mayor = x;
                }
                if (x < menor){
                    menor = x;
                }
                if (x % 2 == 0 && x != 0){
                    sumaPar += x;
                    par++;

                }
            }

        System.out.println("El mayor de todos es: " + mayor);
        System.out.println("El menor de todos es: "+ menor);
        if (par > 0) {
            System.out.println("La media de los número pares introducidos es: " + (double)sumaPar/par );
        } else {
            System.out.println("No se introdujeron números pares");
        }

        sc.close();
    }
}
