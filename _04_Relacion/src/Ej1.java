import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        /*
        Leer 2 Nº, si son iguales que los multiplique, si el primero es
        mayor que el segundo que los reste y si no que sume los dos nº
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un Nº: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce un Nº: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(n1 - n2);
        } else if (n1 == n2){
            System.out.println(n1 * n2);
        } else {
            System.out.println(n1 + n2);
        }

        sc.close();
    }
}