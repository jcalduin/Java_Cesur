import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
         Escribe un programa en Java que pida al usuario introducir 5 números
         enteros y determine cuál es el mayor.
         */

        Scanner sc = new Scanner(System.in);

        int num;
        int mayor=0;

        for (int i = 1; i <=5 ; i++) {
            System.out.printf("Introduzca el %dº número: ", i);
            num = sc.nextInt();
            if (num >= mayor){
                mayor = num;
            }
        }
        sc.close();
        System.out.printf("El mayor es: %d", mayor);
    }
}