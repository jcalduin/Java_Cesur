package ExB.Ej2;

import java.util.Arrays;

public class Biblioteca {
    private Libro[] libros;

    public Biblioteca(Libro[] libros) {
        this.libros = libros;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "libros=" + Arrays.toString(libros) +
                '}';
    }

    public double calcularValorTotal() {
        double total = 0;

        for (Libro libro : libros) {
            if (libro != null && !libro.isPrestado())
                total+= libro.getPrecio();
        }
        return total;
    }
}
