import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*
        Realizar un programa Java para resolver el siguiente problema: una
        fábrica de pantalones desea calcular cuál es el precio final de venta y
        cuánto ganará por los N pantalones que produzca con el corte de
        alguno de sus modelos, para esto se cuenta con la siguiente
        información:
        a) Tiene dos modelos A y B, tallas 30, 32 y 36 para ambos modelos.
        b) Para el modelo A se utiliza 1.50 m de tela, y para el B 1.80 m.
        a. Al modelo A se le carga 80 % del costo de la tela, por mano
        de obra.
        b. Al modelo B se le carga 95 % del costo de la tela, por el
        mismo concepto.
        c) A las tallas 32 y 36 se les carga 4 % del costo generado por mano
        de obra y tela, sin importar el modelo.
        d) Cuando se realiza el corte para fabricar una prenda sólo se hace de
        un solo modelo y talla.
        e) Finalmente, a la suma de estos costos se les carga 30%, que
        representa la ganancia extra de la tienda.
         */

        Scanner sc = new Scanner(System.in);
        int nPantalones;
        char modelo;
        int talla;
        double precio;
        double metros;
        double precioTela;
        double costoTela;

        do {
            System.out.print("¿Cuántos pantalones quiere comprar?: ");
            nPantalones = sc.nextInt();
        }while (nPantalones <1);
        do {
            System.out.print("¿Qué módelo?: ");
            modelo = sc.next().toLowerCase().charAt(0);
        }while (modelo != 'a' && modelo != 'b') ;
        do {
            System.out.print("¿Qué talla?: ");
            talla = sc.nextInt();
        } while (talla!=30 && talla!=32 && talla!=36);
        do{
            System.out.print("¿Qué precio tiene la tela?: ");
            precio = sc.nextDouble();
        } while (precio < 1);
        sc.close();

        if (modelo == 'a'){
            metros = nPantalones * 1.5;
            precioTela = metros * precio;
            costoTela = precioTela * 1.8;
        } else {
            metros = nPantalones * 1.8;
            precioTela = metros * precio;
            costoTela = precioTela * 1.95;
        }

        if (talla == 32 || talla == 36){
            costoTela *= 1.04;
        }

        double precioFinal = costoTela * 1.3;
        double ganancia = costoTela * 0.3;

        System.out.printf("Ganancia de la tienda: %.2f€\n",ganancia);
        System.out.printf("Precio final: %.2f€\n",precioFinal);
    }
}
