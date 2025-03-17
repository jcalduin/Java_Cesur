package Ejercicio3_1;

import java.io.*;
import java.util.Scanner;

public class UnirArchivos {


    public UnirArchivos(String nombreArchivo1, String nombreArchivo2, String destino) throws FileNotFoundException, FormatoInvalidoException {
        comprobarFormato(nombreArchivo1);
        comprobarFormato(nombreArchivo2);
        comprobarArchivo(destino);
        comprobarDestino(nombreArchivo1,nombreArchivo2,destino);
    }

    public void comprobarFormato(String ruta) throws FileNotFoundException, FormatoInvalidoException {
        File file = new File(ruta);

        if (!file.exists()) {
            throw new FileNotFoundException("No se ha podido encontrar el archivo: "+ruta);
        }
        if (!file.getName().endsWith(".txt")) {
            throw new FormatoInvalidoException(ruta+" no es un formato válido, debe ser '.txt'");
        }
    }

    public void comprobarArchivo(String ruta) throws FileNotFoundException {
        File file = new File(ruta);

        if (!file.exists()) {
            throw new FileNotFoundException("No se ha podido encontrar el directorio especificado: "+ruta);
        }
    }

    public void comprobarDestino(String nombreArchivo1, String nombreArchivo2, String destino) {
        File archivo1 = new File(nombreArchivo1);
        File archivo2 = new File(nombreArchivo2);

        String nombre1 = archivo1.getName().replace(".txt", "");
        String nombre2 = archivo2.getName();
        String archivoFusionado = destino+"/"+nombre1+"_"+nombre2;
        File rutaDestino = new File(archivoFusionado);
        String sobreescribir = "S";

        if (rutaDestino.exists()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("La ruta destino ya existe, ¿Te gustaría sobrescribir el archivo?: ");
            sobreescribir = sc.nextLine();
            sc.close();
        }
        if (sobreescribir.equalsIgnoreCase("S")) {
            fusionarArchivos(archivo1,archivo2,rutaDestino);
        }
    }

    public void fusionarArchivos(File archivo1, File archivo2, File rutaDestino) {
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        PrintWriter pw = null;

        try {
            br1 = new BufferedReader(new FileReader(archivo1));
            br2 = new BufferedReader(new FileReader(archivo2));
            pw = new PrintWriter(rutaDestino);
            String linea = br1.readLine();

            while (linea != null) {
                pw.println(linea);
                linea = br1.readLine();
            }
            linea = br2.readLine();
            while (linea != null) {
                pw.println(linea);
                linea = br2.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha podido encontrar el archivo");
        } catch (IOException e) {
            System.out.println("No se ha podido abrir el archivo");
        } finally {
            try{
                if (br1 != null) {
                    br1.close();
                }
                if (br2 != null) {
                    br2.close();
                }
                if (pw != null) {
                    pw.close();
                }
                System.out.println("El archivo destino se ha generado correctamente");
                System.out.println("Archivo generado: "+rutaDestino.getCanonicalPath());
            } catch (IOException e) {
                System.out.println("No se ha podido cerrar el archivo");
            }

        }
    }
}
