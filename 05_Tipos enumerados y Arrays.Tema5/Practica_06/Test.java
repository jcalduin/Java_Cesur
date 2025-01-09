package Practica_06;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca miBiblioteca = new Biblioteca(3);
        String opcion;

        do {
            System.out.println("---------Menú gestión de Biblioteca------------");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Agregar Revista");
            System.out.println("3. Eliminar ejemplar");
            System.out.println("4. Mostrar ejemplares");
            System.out.println("5. Salir");
            System.out.print("Elige un opción: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> {
                    System.out.println("--Agregar Libro--");
                    System.out.print("Ingrese el titulo del libro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese el año de publicación del libro: ");
                    int anho = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el número de páginas: ");
                    int numPaginas = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el género del libro: ");
                    String genero = sc.nextLine();
                    miBiblioteca.agregarEjemplar(new Libro(titulo, autor, anho, numPaginas, genero));
                }
                case "2" -> {
                    System.out.println("--Agregar Revista--");
                    System.out.print("Ingrese el titulo de la revista: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese el autor de la revista: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese el año de publicación de la revista: ");
                    int anho = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el número de edición de la revista: ");
                    int numEdicion = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese la frecuncia de publicación: ");
                    String frecuncia = sc.nextLine();
                    miBiblioteca.agregarEjemplar(new Revista(titulo, autor, anho, numEdicion, frecuncia));
                }
                case "3" -> {
                    System.out.println("--Eliminar ejemplar--");
                    System.out.print("Ingrese el titulo del ejemplar: ");
                    String titulo = sc.nextLine();
                    miBiblioteca.eliminarEjemplar(titulo);
                }
                case "4" -> {
                    System.out.println("--Mostrar ejemplares--");
                    miBiblioteca.mostrarEjemplares();
                }
            }
        } while (!opcion.equals("5"));

        System.out.println("Gracias por usar el sitema de gestión de la biblioteca");
        sc.close();
    }
}
