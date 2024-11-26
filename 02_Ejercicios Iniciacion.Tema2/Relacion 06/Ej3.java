import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        Escribir un programa que lea un número entero (lado) y a partir de él
        cree un triángulo de asteriscos con ese tamaño
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("diga un Nº de lados: ");
        int lado = sc.nextInt();

        for (int fila = 1; fila <= lado ; fila++) {
            for (int j = 1; j <= fila ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
