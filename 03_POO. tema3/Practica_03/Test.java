package Practica_03;

public class Test {
    public static void main(String[] args) {

        Libro l1 = new Libro("Lord of the ring","Tolkien",2000);

        l1.leerPagina();
        l1.leerPagina();
        l1.mostrarInfo();
        l1.retrocederPagina();
        l1.mostrarInfo();
    }
}
