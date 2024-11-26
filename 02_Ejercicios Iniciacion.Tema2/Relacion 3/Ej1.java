import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        /*
        Realizar un programa Java que calcule la edad de una persona
        dependiendo del año de su nacimiento. Ej: año: 1982 edad 37
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("¿En que año estamos? ");
        int año = sc.nextInt();
        System.out.print("¿Qué año nacistes? ");
        int nac = sc.nextInt();

        int edad = año - nac;

        System.out.println("Tienes "+edad+ " años");

        sc.close();
    }
}
