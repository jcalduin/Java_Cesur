package Ejercicio15;

public class Animal {
    void hacerSonido() {
        System.out.println("Sonido de animal");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Perro();
        Perro perro = (Perro) animal;
        animal.hacerSonido();
    }
}

/*
El resultado sale "El perro ladra" puesto que aunque el objeto creado en primera instancia sea de tipo de animal
se guarda en memoria el tipo perro y en segunda instancia se crea un objeto de tipo perro haciendo un casting
explicito del objeto animal apuntando directamente al objeto perro. Se llama al metodo hacer sonido y sale
el metodo del objeto tipo perro dado que el objeto real ahora es tipo perro.
*/
