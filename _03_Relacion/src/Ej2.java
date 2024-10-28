import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        /*
        Realizar un programa que al leer el neto de una factura ingresada, calcule
        el IVA (21%) y muestre como salida el total de la factura.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el importe de tu factura: ");
        double importe = sc.nextDouble();

        double iva = importe * 0.21;
        double total = importe + iva;

        System.out.println("El IVA es: " + iva);
        System.out.println("El importe total de su factura es: "+total+ " IVA incluido");

        sc.close();
    }
}
