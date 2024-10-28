import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        Escribir un programa en java para introducir un número y obtener como
        resultafo si es o no capicua. Se considerará capicúa si el primer digito y el
        ultimo son iguales. No se pueden utilizar ni variables ni funciones de tipo String.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        int x = num % 10 ;
        while (num > 9){
            num = num / 10;
        }
        if (x == num){
            System.out.println("El número es capicua");
        }

        sc.close();
    }
}
