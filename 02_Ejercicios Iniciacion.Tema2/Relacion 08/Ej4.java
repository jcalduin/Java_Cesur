import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        El 14 de febrero una persona desea comprarle un regalo al ser querido
        que más aprecia en ese momento, su dilema radica en qué regalo
        puede hacerle, las alternativas que tiene son las siguientes:

        Tarjeta regalo 10€ o menos
        Bombones Entre 10€ y 20€
        Flores Entre 20€ y 50€
        Anillo Más de 50€
        Se requiere un programa Java que ayude a determinar qué regalo se le
        puede comprar a ese ser tan especial por el día del amor y la amistad.
         */

        Scanner sc = new Scanner(System.in);
        int dinero;

        do {
            System.out.print("¿Cuánto dinero dispones?: ");
            dinero = sc.nextInt();
        }while (dinero <=0);
        sc.close();

        if (dinero <=10){
            System.out.println("Puede comprarle una tarjeta regalo;");
        } else if (dinero <=20){
            System.out.println("Puede comprarle una tarjeta regalo o bombones;");
        } else if (dinero <=50){
            System.out.println("Puede comprarle una tarjeta regalo, bombones o flores;");
        } else {
            System.out.println("Puede comprarle una tarjeta regalo, bombones, flores o un anillo");
        }
    }
}
