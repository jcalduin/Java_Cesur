import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*
        Una tienda ofrece un descuento del 15% sobre el total de la compra
        durante el mes de octubre. Dado un mes y un importe, calcular cual es
        la cantidad que se debe cobrar al cliente
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Total del importe: ");
        double total = sc.nextDouble();
        System.out.println("¿Qué mes estamos: ");
        String mes = sc.next();
        sc.close();

        if (mes.equalsIgnoreCase("octubre")){
            System.out.println("El precio de su compra es: " + total * 0.85 );
        } else {
            System.out.println("El precio es: "+total);
        }
    }
}
