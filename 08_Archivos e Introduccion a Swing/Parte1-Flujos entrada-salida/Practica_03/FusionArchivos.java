package Ejercicio3;

import java.io.*;
import java.util.Scanner;

public class FusionArchivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la ruta del primer archivo: ");
        String ruta1 = sc.nextLine();
        System.out.print("Ingrese la ruta del segundo archivo: ");
        String ruta2 = sc.nextLine();
        System.out.print("Ingrese la ruta de destino: ");
        String destino = sc.nextLine();

        File archivo1 = new File(ruta1);
        File archivo2 = new File(ruta2);
        File directorio = new File(destino);

        try {
            if (!archivo1.exists())
                throw new FileNotFoundException("El archivo 1 no existe.");
            if (!archivo2.exists())
                throw new FileNotFoundException("El archivo 2 no existe.");
            if (!directorio.exists())
                throw new FileNotFoundException("El directorio no existe.");
            if (!archivo1.getName().endsWith(".txt") || !archivo2.getName().endsWith(".txt"))
                throw new ArchivoNoValidoException("El archivo no es válido");


            String nombre1 = new File(ruta1).getName().replace(".txt", "");
            String nombre2 = new File(ruta2).getName();
            String archivoFusionado = destino + "/" + nombre1 + "_" + nombre2;
            File rutaDestino = new File(archivoFusionado);
            String sobreescribir = "S";

            if (rutaDestino.exists()){
                System.out.print("Te gustaria sobreescribir el archivo: (S//N): ");
                sobreescribir = sc.nextLine();
            }
            if(sobreescribir.equalsIgnoreCase("S")){
                BufferedReader br1 = null;
                BufferedReader br2 = null;
                PrintWriter pw = null;

                try{
                    br1 = new BufferedReader(new FileReader(archivo1));
                    br2 = new BufferedReader(new FileReader(archivo2));
                    pw = new PrintWriter(rutaDestino);

                    String linea = br1.readLine();
                    while(linea != null){
                        pw.println(linea);
                        linea = br1.readLine();
                    }
                    linea = br2.readLine();
                    while(linea != null){
                        pw.println(linea);
                        linea = br2.readLine();
                    }
                } catch (IOException e) {
                    System.out.println("No se pudo abrir el archivo");
                } finally {
                    try{
                        if(br1 != null){
                            br1.close();
                        }
                        if(br2 != null){
                            br2.close();
                        }
                        if(pw != null){
                            pw.close();
                        }
                    } catch (IOException e) {
                        System.out.println("No se pudo cerrar el archivo");
                    }
                }
                System.out.println("El archivo destino se ha generado correctamente");
                System.out.println("Archivo generado: "+rutaDestino.getCanonicalPath());
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ArchivoNoValidoException e) {
            System.out.println("El archivo not ien la extensión '.txt'");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
