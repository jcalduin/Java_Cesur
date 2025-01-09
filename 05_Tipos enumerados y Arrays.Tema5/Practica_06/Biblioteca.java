package Practica_06;

import java.util.Arrays;

public class Biblioteca {
    private Ejemplar[] ejemplares;

    public Biblioteca(int capacidad) {
        this.ejemplares = new Ejemplar[capacidad];
    }

    public Ejemplar[] getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Ejemplar[] ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "ejemplares=" + Arrays.toString(ejemplares) +
                '}';
    }

    public void agregarEjemplar(Ejemplar ejemplar) {
        boolean espacioLibre = false;
        int indice = 0;
        do {
            if (ejemplares[indice] == null) {
                ejemplares[indice] = ejemplar;
                espacioLibre = true;
                if (ejemplar instanceof Libro)
                    System.out.println("El libro se agregó correctamente");
                else if (ejemplar instanceof Revista)
                    System.out.println("La revista se agregó correctamente");
                else
                    System.out.println("El ejemplar se agregó correctamente");
            } else {
                indice ++;
            }
        }while (!espacioLibre && indice < ejemplares.length);

        if (!espacioLibre)
            System.out.println("No queda espacio disponible");
    }

    public void eliminarEjemplar(String titulo) {
        boolean encontrado = false;
        int indice = 0;
        do {
            if (ejemplares[indice] != null && ejemplares[indice].getTitulo().equals(titulo)) {
                System.out.println(ejemplares[indice].getTitulo() + " se ha eliminado correctamente");
                ejemplares[indice] = null;
                encontrado = true;
            }
            indice++;
        }while (!encontrado && indice < ejemplares.length);

        if (!encontrado)
            System.out.println(titulo + " no existe actualmente en la biblioteca");
    }

    public void mostrarEjemplares() {
        System.out.println(this);
    }
}
