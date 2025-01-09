package Practica_06;

public class Ejemplar {
    private String titulo;
    private String autor;
    private int anho;

    public Ejemplar(String titulo, String autor, int anho) {
        this.titulo = titulo;
        this.autor = autor;
        this.anho = anho;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anho=" + anho +
                '}';
    }

    public void mostrarInfo() {
        System.out.println(this);
    }
}
