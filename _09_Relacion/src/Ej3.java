import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        Realizar un programa Java para determinar cuánto pagará una persona
        que adquiere N artículos, los cuales están de promoción. Considere que
        si su precio es mayor o igual a 200€ se le aplica un descuento de 15%,
        y si su precio es mayor a 100€ pero menor a 200€, el descuento es de
        12%; de lo contrario, sólo se le aplica 10%. Se debe saber cuál es el
        costo y el descuento que tendrá́ cada uno de los artículos y finalmente
        cuánto se pagará por todos los artículos obtenidos.
         */

        Scanner sc = new Scanner(System.in);

        double precioArticulo;
        double sumaTotal=0;
        char opcion;

        System.out.print("¿Desea algún artículo?(s/n): ");
        opcion = sc.next().toLowerCase().charAt(0);

        while (opcion == 's') {

            System.out.print("¿Qué precio tiene el artículo?: ");
            precioArticulo = sc.nextDouble();

            if (precioArticulo >= 200) {
                precioArticulo *=0.85;
            } else if (precioArticulo >= 100) {
                precioArticulo *=0.88;
            } else {
                precioArticulo *=0.9;
            }

            System.out.printf("El artículo con dto cuesta: %.2f€\n", precioArticulo);
            sumaTotal += precioArticulo;

            System.out.print("¿Otro artículo?(s/n): ");
            opcion = sc.next().toLowerCase().charAt(0);
        }
        sc.close();

        if (sumaTotal > 0) {
        System.out.printf("El precio final aplicado todos los descuentos es: %.2f€",sumaTotal);
        } else {
            System.out.println("No quiere nada, vuelva otro día");
        }
    }
}
