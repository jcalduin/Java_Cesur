import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*
        Introducir un número del 1 al 10 y mostrar su tabla de multiplicar
         */

        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
            if (num > 0 && num <= 10) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + "*" + i + "=" + num * i);
                }
            } else {
                System.out.println("Introduce un número del 1 al 10");
            }
        } while (num < 1 || num > 10);
    }
}
