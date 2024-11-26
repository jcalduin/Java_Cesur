import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        Introducir valores para A y B:
        Si A>B, calcuar e imprimir la suma de los números N comprendidos
        entre 100 y 1000 que cumplan que N*(N+1)/5=multiplo de 5
        Si A=B, calcular e imprimir 1/A +5/A+ 9/A+ ...+ 45/A
        Si A<B, calcular e imprimir (B-A) * (2^3+4^6+6^9+...+20^30.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca valor de A : ");
        double A = sc.nextDouble();
        System.out.println("Introduzca valor de B : ");
        double B = sc.nextDouble();

        double AmayorB = 0;
        double contador =0;
        double suma = 0;
        double potencia = 0;

        if (A > B) {
            for (int N = 100; N <= 1000; N++) {
                if (N * (N + 1) / 5 % 5 ==0) {
                    contador++;
                    AmayorB +=N;
                }
            }
            System.out.println(contador);
            System.out.println(AmayorB);
        } else if (A == B) {
            for (double N = 1; N <= 45; N+=4) {
                suma += (N/A) ;
            }
            System.out.println(suma);
        } else {
            for ( int base = 2, exponente = 3; base <=20 && exponente <= 30; base+=2, exponente+=3) {
                potencia += (B - A) * (Math.pow(base, exponente));
            }
            System.out.println(potencia);
        }




        sc.close();
    }
}
