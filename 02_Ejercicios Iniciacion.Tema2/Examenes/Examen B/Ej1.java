import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*
         Escribe un programa que lea un número entero y determine si es par o
         impar.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        sc.close();

        if (num %2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
