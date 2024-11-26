import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        Dados dos valores numéricos A y B, que el usuario debe teclear,se
        pide realizar un programa que intercambie los valores de ambas
        variables y muestre cuanto valen al final las dos variables. Ej:
        A = 5 y B = 6
        despues intercambiar los valores A = 6 y B = 5
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce valor de A: ");
        int a = sc.nextInt();
        System.out.print("Introduce valor de B: ");
        int b = sc.nextInt();

        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println("A vale : "+a+" B vale : "+b);

        sc.close();
    }
}
