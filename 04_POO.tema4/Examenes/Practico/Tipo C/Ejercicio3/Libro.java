package Ejercicio3;

import java.util.Scanner;

public class Libro extends MaterialBibliografico{
    private String genero;
    private int numPaginas;

    public Libro(String titulo, String autor, int anhoPublicacion, boolean disponible, String genero, int numPaginas) {
        super(titulo, autor, anhoPublicacion, disponible);
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void prestar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos días? ");
        int dias = sc.nextInt();
        sc.close();
        if (dias <= 14) {
            System.out.println("Libro prestado para "+dias+" dias");
            setDisponible(false);
        } else {
            System.out.println("El libro no puede ser prestado por más de 14 días");
        }
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Genero: "+genero);
        System.out.println("Numero de Paginas: "+numPaginas);
    }
}
