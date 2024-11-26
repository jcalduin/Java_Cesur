import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
        Escribir un programa que lea un número menor o igual que 1000 y lo
        convierta a números romanos.
        introduce 649
        romano DCXLIX
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un Nª: ");

        int n = sc.nextInt();

        if (n == 1000) {
            System.out.print("M");
        }
        if (n < 1000 && n >= 900) {
            System.out.print("CM");
            n = n - 900;
        }
        if (n < 900 && n >= 500) {
            System.out.print("D");
            n = n - 500;
        }
        if (n < 500 && n >= 400) {
            System.out.print("CD");
            n = n - 400;
        }
        if (n < 400 && n >= 100) {
            int veces = n / 100;
            for (int i = 1; i <= veces ; i++) {
                System.out.print("C");
                n = n -100;
            }
        }
        if (n < 100 && n >= 90) {
            System.out.print("XC");
            n = n - 90;
        }
        if (n < 90 && n >= 50) {
            System.out.print("L");
            n = n - 50;
        }
        if (n < 50 && n >= 40) {
            System.out.print("XL");
            n = n - 40;
        }
        if (n < 40 && n >= 10) {
            int veces = n / 10;
            for (int i = 1; i <= veces ; i++) {
                System.out.print("X");
                n = n -10;
            }
        }
        if (n == 9){
            System.out.print("IX");
        }
        if (n < 9 && n >= 5) {
            System.out.print("V");
            n = n - 5;
        }
        if (n == 4){
            System.out.print("IV");
        }
        if (n < 4 && n >= 1) {
            int veces = n / 1;
            for (int i = 1; i <= veces ; i++) {
                System.out.print("I");
            }
        }

    }
}
