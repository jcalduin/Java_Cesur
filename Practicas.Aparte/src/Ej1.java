import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*
        Leer una cantidad 'N' y luego introducir 'N' número enteros. Se pide imprimir
        el mayor y el menor y las veces que a aparece cada uno.
         */

        Scanner sc = new Scanner(System.in);
        int veces;
        int mayor, menor;
        int contadorMayor = 1, contadorMenor = 1;


        do {
            System.out.print("Introduce el número de veces: ");
            veces = sc.nextInt();
            if (veces <= 0) {
                System.out.println("Valor no válido");
            }
        } while (veces <=0 );
            System.out.print("Introduce el 1º número: ");
            int N = sc.nextInt();
            mayor = N;
            menor = N;

            for (int i = 2; i <= veces; i++) {
                System.out.print("Introduce el " + i + "º número: ");
                N = sc.nextInt();
                if (N > mayor) {
                    mayor = N;
                    contadorMayor = 1;
                } else if (N == mayor) {
                    contadorMayor++;
                }
                if (N < menor){
                    menor = N;
                   contadorMenor = 1;
                } else if (N == menor) {
                    contadorMenor++;
                }
            }


        System.out.println("El mayor es: "+mayor+ " y aparece: "+contadorMayor+" vez/ces.");
        System.out.println("El menor es: "+menor+ " y aparece: "+contadorMenor+" vez/ces");

        sc.close();
    }
}
