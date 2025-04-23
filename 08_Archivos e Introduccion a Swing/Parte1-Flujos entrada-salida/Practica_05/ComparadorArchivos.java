package Ejercicio5;

import java.io.*;
import java.util.Scanner;

public class ComparadorArchivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer archivo: ");
        String archivo1 = sc.nextLine();
        System.out.print("Ingrese el segundo archivo: ");
        String archivo2 = sc.nextLine();

        int contador = 1;
        File original = new File(archivo1);
        File aux = new File(archivo2);
        BufferedReader br1 = null;
        BufferedReader br2 = null;

        try {
            br1 = new BufferedReader(new FileReader(original));
            br2 = new BufferedReader(new FileReader(aux));

            String linea1 = br1.readLine();
            String linea2 = br2.readLine();

            while (linea1 != null && linea2 != null) {
                if (!linea1.equals(linea2)) {
                    System.out.println("Diferencia en la linea 6:");
                    System.out.println("Archivo 1: " + linea1);
                    System.out.println("Archivo 2: " + linea2);
                }
                linea1 = br1.readLine();
                linea2 = br2.readLine();
                contador++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } finally {
            try {
                if (br1 != null)
                    br1.close();
                if (br2 != null)
                    br2.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
        sc.close();
    }
}
