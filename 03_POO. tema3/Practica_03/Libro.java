package Practica_03;
/*
Crea una clase Libro con los atributos:
• titulo (tipo String)
• autor (tipo String)
• numeroPaginas (tipo int)
• paginaActual (tipo int, inicializada en 0)
Crea métodos:
• leerPagina(): aumenta paginaActual en 1, hasta llegar a
numeroPaginas.
• retrocederPagina(): reduce paginaActual en 1, hasta un mínimo de 0.
• mostrarInfo(): muestra la información del libro y la página actual.
En el main(), crea un objeto Libro, avanza y retrocede en el libro, y muestra
la información.
 */

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int paginaActual;

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.paginaActual = 0;
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

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }
    public void leerPagina(){
        if(paginaActual < numeroPaginas) {
            this.paginaActual++;
        }
    }
    public void retrocederPagina(){
        if(paginaActual > 0){
            this.paginaActual--;
        }
    }
    public void mostrarInfo(){
        System.out.println("Titulo: " +titulo+"\nAutor: " +autor+"\nPagina actual: " +paginaActual);
    }
}
