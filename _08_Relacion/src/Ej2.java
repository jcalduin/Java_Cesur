import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
        Una hamburguesería ofrece burguers sencilla, dobles y triples,
        las cuales tienen un costo de 5, 8 y 12 € respectivamente.
        La empresa acepta tarjetas de credito con un cagro del 5% sobre la compra
        Suponiendo que los clientes adquieren solo un tipo de burguer,
        realizar un rpogrma para detrerminar cuanto debe
        pagar una persona por N burguers, teniendo en cuenta que puede pedir de los 3 tipos de burguers.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Qué tipo de burguer desea?: ");
        String tipo = sc.nextLine();
        System.out.print("¿Cuantas hamburguesas quiere?: ");
        int num= sc.nextInt();
        System.out.print("¿Con tarjeta? S/N: ");
        String tarjeta = sc.next();
        int precio= 0;

        sc.close();

        switch (tipo.toLowerCase()){
            case "sencilla" -> precio= 5;
            case "doble" -> precio= 8;
            case "triple" -> precio= 12;
        }
        double total= num*precio;

        if (tarjeta.equalsIgnoreCase("S")){
            total= total * 1.05;
            System.out.printf("El precio es: %.2f€",total);
        } else {
            System.out.printf("El precio es: %.2f€",total);
        }
    }
}
