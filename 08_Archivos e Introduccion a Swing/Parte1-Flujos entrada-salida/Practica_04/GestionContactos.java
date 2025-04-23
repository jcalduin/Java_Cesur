package Ejercicio4;

import java.io.*;
import java.util.Scanner;

public class GestionContactos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- Gestión de Contactos ---");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Listar Contactos");
            System.out.println("3. Buscar Contacto");
            System.out.println("4. Eliminar Contacto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1 -> {
                    System.out.println();
                    System.out.println("--- Agregar Contacto --- ");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Telefono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Correo electrónico: ");
                    String correo = sc.nextLine();
                    System.out.println();
                    String contacto = nombre + "," + telefono + "," + correo;
                    PrintWriter pw = null;
                    try {
                        pw = new PrintWriter(new FileWriter("misArchivos/contactos.txt", true));
                        pw.println(contacto);
                    } catch (FileNotFoundException e) {
                        System.out.println("No se encuentra el archivo");
                    } catch (IOException e) {
                        System.out.println("Error al escribir el archivo");
                    } finally {
                        if (pw != null) {
                            pw.close();
                        }
                    }
                }
                case 2 -> {
                    System.out.println();
                    System.out.println("--- Lista de Contactos ---");
                    BufferedReader br = null;
                    try {
                        br = new BufferedReader(new FileReader("misArchivos/contactos.txt"));
                        String linea = br.readLine();
                        while (linea != null) {
                            String[] contacto = linea.split(",");
                            System.out.println("Nombre: " + contacto[0]+", Telefono: " + contacto[1]+", Email: " + contacto[2]);
                            linea = br.readLine();
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Archivo no encontrado");
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo");
                    } finally {
                        try{
                            if (br != null) {
                                br.close();
                            }
                        } catch (IOException e) {
                            System.out.println("Error al cerrar el archivo");
                        }
                    }
                    System.out.println();
                }
                case 3 -> {
                    System.out.println();
                    System.out.print("Seleccione el contacto a buscar: ");
                    String nombre = sc.nextLine();
                    BufferedReader br = null;
                    try {
                        br = new BufferedReader(new FileReader("misArchivos/contactos.txt"));
                        String linea = br.readLine();
                        boolean encontrado = false;
                        while (linea != null) {
                            String[] contacto = linea.split(",");
                            if (contacto[0].equalsIgnoreCase(nombre)) {
                                System.out.println("Nombre: " + contacto[0]+", Telefono: " + contacto[1]+", Email: " + contacto[2]);
                                encontrado = true;
                            } else {
                                linea = br.readLine();
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No existe el contacto");
                        }
                        System.out.println();
                    } catch (FileNotFoundException e) {
                        System.out.println("Archivo no encontrado");
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo");
                    } finally {
                        try{
                            if (br != null) {
                                br.close();
                            }
                        } catch (IOException e) {
                            System.out.println("Error al cerrar el archivo");
                        }
                    }
                }
                case 4 -> {
                    System.out.println();
                    System.out.print("Seleccione el contacto a eliminar: ");
                    String nombre = sc.nextLine();
                    BufferedReader br = null;
                    PrintWriter pw = null;
                    boolean encontrado = false;
                    File original  = new File("misArchivos/contactos.txt");
                    File copia  = new File("misArchivos/contactosaux.txt");
                    try {
                        br = new BufferedReader(new FileReader(original));
                        pw = new PrintWriter(copia);
                        String linea = br.readLine();
                        while (linea != null) {
                            String[] contacto = linea.split(",");
                            if (!contacto[0].equalsIgnoreCase(nombre)) {
                                pw.println(linea);
                                encontrado = true;
                            }
                            linea = br.readLine();
                        }
                        if (!encontrado) {
                            System.out.println("No existe el contacto");
                        } else
                            System.out.println("Contacto eliminado correctamente");
                    } catch (FileNotFoundException e) {
                        System.out.println("Archivo no encontrado");
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo");
                    } finally {
                        try {
                            if (br != null) {
                                br.close();
                            }
                            if (pw != null) {
                                pw.close();
                            }
                            original.delete();
                            copia.renameTo(original);
                        } catch (IOException e) {
                            System.out.println("Error al cerrar el archivo");
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                }
            }

        } while (opcion != 5);

        sc.close();
    }
}
