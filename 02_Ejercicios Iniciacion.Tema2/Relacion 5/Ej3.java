import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        Calcula el cuadrado y el cubo de los 5 primeros nº enteros que
        siguen a uno escrito por teclado. Por ejemplo: Escribo el 2.
        El resultado será:
        cuadrado de 2= 4 : cubo de 2 = 8
        cuadrado de 3= 9 : cubo de 3 = 27
        cuadrado de 6= 36 : cubo de 6 = 216
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        int n = sc.nextInt();
        double cuadrado =0;
        double cubo =0;

        for (int i = 1; i <= 5; i++) {
            cuadrado = Math.pow(n, 2);
            cubo = Math.pow(n, 3);
            System.out.println("El cuadrado de "+n+"= " +(int)cuadrado+ ": cubo de "+n+"= "+(int)cubo);
            n++;

        }

        sc.close();

    }
}
