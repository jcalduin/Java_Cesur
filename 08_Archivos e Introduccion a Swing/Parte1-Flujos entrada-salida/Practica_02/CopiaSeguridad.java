package Ejercicio2;

import java.io.*;
import java.util.Scanner;

public class CopiaSeguridad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe la ruta del archivo: ");
        String archivo = sc.nextLine();
        sc.close();
        File archivoF = new File(archivo);

       if (archivoF.exists()) {
           if (archivoF.isFile() && (archivoF.getName().endsWith(".txt") || archivoF.getName().endsWith(".csv"))) {
               BufferedReader br = null;
               PrintWriter pw = null;
               try {
                   br = new BufferedReader(new FileReader(archivoF));
                   pw = new PrintWriter(archivo + ".bak");
                   String linea = br.readLine();
                   double bytesCopiados = 0;
                   double tamanho = archivoF.length();
                   while (linea != null) {
                       double bytes = linea.getBytes().length;
                       bytesCopiados += bytes;
                       double porcentaje = (bytesCopiados / tamanho) * 100;
                       pw.println(linea);
                       System.out.printf("Copiado el %.2f%%\n", porcentaje);
                       linea = br.readLine();
                   }
               } catch (FileNotFoundException e) {
                   System.out.println("Archivo no encontrado");
               } catch (IOException e) {
                   System.out.println("Error al leer el archivo");
               } finally {
                   try{
                       if (br != null)
                           br.close();
                       if (pw != null)
                           pw.close();
                   } catch (IOException e) {
                       System.out.println("Error al cerrar el archivo");
                   }
               }

           } else {
               FileInputStream fis = null;
               FileOutputStream fos = null;
               try {
                   fis = new FileInputStream(archivoF);
                   fos = new FileOutputStream(archivo + ".bak");
                   double bytesCopiados = 0;
                   double tamanho = archivoF.length();
                   byte[] bytes = new byte[1024];
                   int numero = fis.read(bytes,0,1024);
                   while (numero != -1) {
                       bytesCopiados += numero;
                       double porcentaje = (bytesCopiados / tamanho) * 100;
                       fos.write(bytes,0,numero);
                       System.out.printf("Copiado el %.2f%%\n", porcentaje);
                       numero = fis.read(bytes,0,1024);
                   }
               } catch (FileNotFoundException e) {
                   System.out.println("Archivo no encontrado");
               } catch (IOException e) {
                   System.out.println("Error al leer el archivo");
               } finally {
                   try {
                       if (fis != null)
                           fis.close();
                       if (fos != null)
                           fos.close();
                   } catch (IOException e) {
                       System.out.println("Error al cerrar el archivo");
                   }
               }
           }
       }else {
           System.out.println("El archivo no existe.");
       }
    }
}
