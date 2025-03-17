package Ejercicio1;

import java.io.*;
import java.util.Scanner;

public class archivos {
    public static void main(String[] args) {

        File carpeta = new File("src/Ejercicio1/misArchivos");

        if (!carpeta.exists()){
            carpeta.mkdir();
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una palabra (fin para terminar): ");
        String palabra = sc.nextLine();
        PrintWriter pw = null;

        try{
            pw = new PrintWriter("src/Ejercicio1/misArchivos/log.txt");
            while (!palabra.equalsIgnoreCase("fin")){
                pw.println(palabra);
                System.out.print("Introduzca una palabra (fin para terminar): ");
                palabra = sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } finally {
            sc.close();
            if (pw != null){
                pw.close();
            }
        }


        BufferedReader br = null;

        try {
            FileReader fr = new FileReader("src/Ejercicio1/misArchivos/log.txt");
            br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }finally {
            try{
                if (br != null){
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }

    }
}
