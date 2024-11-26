import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*
        Lea una secuencia de nº positivos terminada con la introduccion de un 0.
        Obtenga e imprima el mayor de todos. Si se introduce uno negativo,
        imprima unmensaje
         */

        Scanner sc = new Scanner(System.in);

        int mayor = 0;
        int n = 0;

        do {
            System.out.print("Introduzca un Nº: ");
            n = sc.nextInt();
                if (n > mayor){
                    mayor = n;
                } else if (n < 0){
                    System.out.println("Número negativo no valido");
            }
        } while (n != 0);

        sc.close();

        System.out.println("El mayor de todos los números introducidos es: "+mayor);


    }
}
