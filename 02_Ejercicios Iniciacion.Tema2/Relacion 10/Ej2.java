import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
        La asociación de vinicultores tiene como política fijar un precio inicial al
        kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y
        2. Cuando se realiza la venta del producto, ésta es de un solo tipo y
        tamanio, se requiere determinar cuánto recibirá un productor por la uva
        que entrega en un embarque, considerando lo siguiente: si es de tipo A,
        se le cargan 20 céntimos al precio inicial cuando es de tamanio 1; y 30
        céntimos si es de tamanio 2. Si es de tipo B, se rebajan 30 céntimos
        cuando es de tamanio 1, y 50 céntimos cuando es de tamanio 2. Realice
        un programa en Java para determinar la ganancia obtenida.
        */

        Scanner sc = new Scanner(System.in);
        double precio;
        double kilos;
        char tipo;
        short tamanio;

        do {
            System.out.print("¿Qué precio tiene el kilo de uva?: ");
            precio = sc.nextDouble();
        }while (precio <= 0);
        do {
            System.out.print("¿Cuántos kilos de uva hay?: ");
            kilos = sc.nextInt();
        }while (kilos <= 0);
        do {
            System.out.print("¿Qué tipo de uva?(A/B): ");
            tipo = sc.next().toLowerCase().charAt(0);
        }while (!(tipo == 'a' || tipo == 'b'));
        do {
            System.out.print("¿Qué tamanio?: ");
            tamanio = sc.nextShort();
        }while (!(tamanio == 1 || tamanio ==2));

        sc.close();

        if (tipo == 'a'){
            if (tamanio == 1){
                precio += 0.20;
            } else {
                precio += 0.30;
            }
        } else {
            if (tamanio == 2){
                precio -= 0.30;
            } else {
                precio -= 0.50;
            }
        }

        double precioFinal = precio * kilos;
        System.out.printf("El vinicultor recibirá: %.2f€", precioFinal);
    }
}
