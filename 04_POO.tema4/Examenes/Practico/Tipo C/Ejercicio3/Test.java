package Ejercicio3;

/*
Este ejercicio aunque esta correcto y bajo mi punto mejorado con respecto al enunciado, no cumple explicitamente con
lo pedido en el enunciado. Igualmente creo que el enunciado esta mal redactado.
*/

public class Test {
    public static void main(String[] args) {

        Libro libro = new Libro("El Quijote","Miguel de Cervantes", 1605,true,"Ficción",1000);
        Revista revista = new Revista("National Geographic","Varios",2024,false,10,"Noviembre");
        Tesis tesis = new Tesis("Inteligencia artificial","JuanPérez",2020,true,"MIT","Computación");

        libro.mostrarDetalles();
        libro.prestar();
        libro.devolver();

        System.out.println("-----");

        revista.mostrarDetalles();
        revista.prestar();
        revista.devolver();

        System.out.println("-----");
        tesis.mostrarDetalles();
        tesis.prestar(false);
        tesis.prestar(true);
        tesis.prestar("Periquito");
        tesis.devolver();
    }
}
