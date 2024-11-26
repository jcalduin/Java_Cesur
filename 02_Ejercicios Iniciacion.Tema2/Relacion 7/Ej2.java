import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
        programa que lea un año introducido e indique si es bisiesto o no
        -si el año es divisible por 4 pero no por 100 es bisiesto
        -si el año es divisible por 100 y por 400 es bisisesto
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("¿En qué año estamos? ");
        int anho = sc.nextInt();

        if ((anho%4 == 0 && anho%100 != 0) || (anho%100 == 0 && anho%400 == 0)){
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
        sc.close();
    }
}
