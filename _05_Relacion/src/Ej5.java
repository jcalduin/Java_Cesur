import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*
        Un colegio desea saber que porcentaje de niños y que porcentaje de
        niñas hay en el curso actual. Diseñar un programa para este proposito
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantas niñas hay? ");
        double niña = sc.nextDouble();
        System.out.print("Cuantos niños hay? ");
        double niño = sc.nextDouble();

        double total = niña + niño;

        System.out.println("Hay "+(int)total+ " de niños. De los cuales el "+ (niña*100)/total + "% son niñas y el "+ (niño*100)/total +"% son niños");


        sc.close();

    }
}
