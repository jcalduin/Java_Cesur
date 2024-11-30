package Ejercicio10;

public class Parent {
    void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void display(String msg) {
        System.out.println("Child: " + msg);
    }
}

class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}

/*
La salida sería parent, porque el metodo display no esta sobreescrito, por lo tanto aunq el objeto creado sea creado
sea de clase "parent" e inicializado como clsae hijo, el metodo al cual se llama pertenece a la clase padre
*/