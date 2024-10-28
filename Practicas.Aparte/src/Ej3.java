import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        Dado un número, determianr cuantos dígitos tiene. No se pueden utilizar
        ni variables ni funciones de tipo string
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        long n = sc.nextLong();
        int digitos = 1;

        n = Math.abs(n);


        while (n > 9){
            n = n / 10;
            digitos++;
        }

        System.out.println("El número introducido tiene "+digitos+" digitos");

        sc.close();
    }
}
