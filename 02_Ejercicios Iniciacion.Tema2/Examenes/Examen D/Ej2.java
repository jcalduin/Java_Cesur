import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
        Escribe un programa en Java que presente un menú al usuario con las
        siguientes opciones:
            1. Calcular el cuadrado de un número.
            2. Calcular el cubo de un número.
            3. Salir.
        El programa debe mantener el menú activo hasta que el usuario elija la opción de salir
         */

        Scanner sc = new Scanner(System.in);
        int opcion;
        double num;
        double potencia;

        do {
            System.out.print("Elija una opción: \n1.Calcular el cuadrado de un número \n2.Calcular el cubo de un número.\n3.Salir.\n> ");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.print("Introduzca un número: ");
                num = sc.nextInt();
                potencia = Math.pow(num,2);
                System.out.println("El cuadrado de "+num+" es: "+potencia);
            } else if (opcion == 2) {
                System.out.print("Introduzca un número: ");
                num = sc.nextInt();
                potencia = Math.pow(num,3);
                System.out.println("El cubo de "+num+" es: "+potencia);
            } else if (opcion == 3) {
                System.out.println("Adios!!");
            } else {
                System.out.println("Opción no válida.");
            }
        }while(opcion != 3);
        sc.close();
    }
}
