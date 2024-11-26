package Practica_07;

public class Test {
    public static void main(String[] args) {

        Actor a1 = new Actor("Pepito",25);
        Actor a2 = new Actor("Juana",32);

        Director d1 = new Director("Steven",45);
        Director d2 = new Director("Rosa",32);

        Pelicula p1 = new Pelicula("Cazafantasmas",2015,"comedia",a1,d1);
        Pelicula p2 = new Pelicula("Friends", 2002,"Romántica",a2,d2);

        p1.mostrarDetalles();
        p2.mostrarDetalles();
    }
}
