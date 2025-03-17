package Ejercicio3_1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese la ruta del primer archivo: ");
            String ruta1 = sc.nextLine();
            System.out.print("Ingrese la ruta del segundo archivo: ");
            String ruta2 = sc.nextLine();
            System.out.print("Ingrese la ruta de destino: ");
            String destino = sc.nextLine();

            UnirArchivos fusion = new UnirArchivos(ruta1,ruta2,destino);

        } catch (FileNotFoundException | FormatoInvalidoException e) {
            System.out.println("Error al fusionar los archivos. "+e.getMessage());
        }
        sc.close();
    }
}
