import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        Escribe un programa en Java que imprima los primeros n términos de la
        serie de Fibonacci. La serie de Fibonacci comienza por un 0 (para el término 0) y un 1
        (para el término 1) y continúa añadiendo números que son la suma de los dos
        anteriores.
            Ejemplo:
                Escribe el número de términos de la serie de Fibonacci: 7
                La serie de Fibonacci es: 0,1,1,2,3,5,8

                término 0 = 0
                término 1 = 1
                término 2 = término 0 + término 1 = 0+1 = 1
                término 3 = término 1 + término 2 = 1+1 = 2
                término 4 = término 2 + término 3 = 1+2 = 3
                término 5 = término 3 + término 4 = 2+3 = 5
                término 6 = término 4 + término 5 = 3+5 = 8
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el número de términos de la serie de Fibonacci: ");
        int n = sc.nextInt();
        sc.close();
        int a = 0;
        int b = 1;
        String fibo="0, 1";

        for (int i = 2; i < n ; i++) {
            int suma = a + b;
            a = b;
            b = suma;
            fibo += ", "+suma;
        }
        System.out.print("La serie de Fibonacci es: "+fibo);
    }
}
