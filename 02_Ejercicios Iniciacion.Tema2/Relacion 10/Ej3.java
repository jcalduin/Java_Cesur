import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        El banco “Avaro Bank” desea calcular para uno de sus clientes el saldo
        actual, el pago mínimo y el pago para no generar intereses. Los datos
        que se conocen son: saldo anterior del cliente, cantidad de las compras
        que ha realizado este mes, cantidad que debe de los meses anteriores y
        el pago que depositó en el mes anterior. Teniendo en cuenta que:
        • El pago mínimo se corresponde con el 15% de las compras totales
        (cantidad que debe de meses anteriores + compras mes actual).
        • Para no generar intereses el pago debe ser igual o mayor al 85% de
        las compras totales.
        • Si el pago está por debajo del 85% de las compras totales, se
        aumentará un 12% por los intereses causados.
        • Si, además no se ha realizado el pago mínimo, se le cargarán 200€
        en concepto de multa.
         */

        Scanner sc = new Scanner(System.in);

        double saldoAnterior;
        double pagoAnterior;
        double pteMesAnterior;
        double compraMes;

        do{
            System.out.print("Saldo anterior del cliente: ");
            saldoAnterior = sc.nextDouble();
        } while(saldoAnterior <= 0);
        do{
            System.out.print("Pago del mes anterior: ");
            pagoAnterior = sc.nextDouble();
        } while (pagoAnterior < 0);
        do{
            System.out.print("Cantidad pendiente del mes anterior: ");
            pteMesAnterior = sc.nextDouble();
        } while(pteMesAnterior < 0);
        do{
            System.out.print("Compras realizadas este mes: ");
            compraMes = sc.nextDouble();
        } while(compraMes < 0);

        double pagoMinimo = (pteMesAnterior+compraMes)*0.15;
        double pagoNoIntereses = (pteMesAnterior+compraMes)*0.85;
        System.out.printf("El pago mínimo que debe realizar es: %.2f€\n",pagoMinimo);
        System.out.printf("El pago que debe realizar para no generar intereses es: %.2f€\n",pagoNoIntereses);

        System.out.print("Pago que desea realizar este mes: ");
        double pagoMes = sc.nextDouble();

        double deuda = (pteMesAnterior+compraMes)-pagoMes;

        if (pagoMes < pagoNoIntereses){
            deuda *=1.12;
            if (pagoMes < pagoMinimo){
                deuda +=200;
            }
        }

        System.out.printf("Una vez realizado el pago, su saldo actual es: %.2f€\n", saldoAnterior-(pagoAnterior+pagoMes));
        System.out.printf("La cantidad pendiente de pago de sus compras es: %.2f€",deuda);
        sc.close();
    }
}

