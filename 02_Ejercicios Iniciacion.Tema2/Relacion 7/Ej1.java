import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*
        Escribe un programa java que lea un número N y dibuje 
        un triángulode asteriscos con base y altura N.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            //espacios
            for (int j = 1; j <= (n-i) ; j++) {
                System.out.print(" ");
            } //asteriscos
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
