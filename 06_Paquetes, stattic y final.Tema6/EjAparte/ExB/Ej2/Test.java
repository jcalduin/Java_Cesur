package ExB.Ej2;

public class Test {
    public static void main(String[] args) {

        Libro l1 = new Libro("Cenicienta",15,"ficcion");
        Libro l2 = new Libro("Ciencia Médica",45,"ciencia");
        Libro l3 = new Libro("La guerra del Peloponeso",20.5,"historia");

        Libro[] libros = {l1,l2,l3};
        Biblioteca miBiblioteca = new Biblioteca(libros);

        l1.marcarPrestado();
        l2.marcarPrestado();

        System.out.printf("Valor del total de la biblioteca es %.2f€ \n",miBiblioteca.calcularValorTotal());

    }
}
