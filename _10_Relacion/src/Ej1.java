import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double saldoant;
        double pagomesant;
        double cantidadpte;
        double comprasmes;
        double pagomes;
        double saldoactual;
        double deudatotal;

        do {
            System.out.println("Introduzca el saldo anterior del cliente: ");
            saldoant = sc.nextDouble();
        } while (saldoant < 1);
        do {
            System.out.println("Pago del mes anterior: ");
            pagomesant = sc.nextDouble();
        } while (pagomesant >= saldoant);
        do {
            System.out.println("Cantidad pendiente de las compras:");
            cantidadpte = sc.nextDouble();
        } while (cantidadpte < 1);
        do {
            System.out.println("Gastos realizados este mes:");
            comprasmes = sc.nextDouble();
        } while (comprasmes <= 0);

        double pagominimo = (cantidadpte + comprasmes) * 0.15;
        System.out.printf("El pago mínimo que debe realizar es de: %.2f€\n", pagominimo);

        double pagosininteres = (cantidadpte + comprasmes) * 0.85;
        System.out.printf("El pago mínimo que debe realizar para que no tenga intereses es de: %.2f€\n", pagosininteres);

        System.out.println("Introduzca el pago que desea realizar este mes:");
        pagomes = sc.nextDouble();

        deudatotal = (cantidadpte + comprasmes) - pagomes;

        if (pagomes < pagosininteres) {
            deudatotal *= 1.12;
            if (pagomes < pagominimo) {
                deudatotal += 200;
            }
        }

        saldoactual = saldoant - (pagomesant + pagomes);

        System.out.printf("Una vez realizado el pago, su saldo actual es de: %.2f€\n", saldoactual);
        System.out.printf("La cantidad de pago de sus compras es de: %.2f€\n", deudatotal);
    }
}

