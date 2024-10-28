import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        Escribe un programa en java tal que pida un número por teclado hasta que
        este sea positivo
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero : ");
        int n = sc.nextInt();

        while (n <= 1) {
            System.out.println("Introduzca otro número :");
            n = sc.nextInt();
        }
        System.out.println("El número es positivo ");

    }
}
