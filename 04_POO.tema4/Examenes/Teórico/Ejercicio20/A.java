package Ejercicio20;

public class A {
    void display() {
        System.out.println("Clase A");
    }
}

class B extends A {
    void display() {
        System.out.println("Clase B");
    }
}

class Main {
    public static void main(String[] args) {
        A obj = new B();
        ((B)obj).display();
    }
}

/*
El resultado es "Clase B" ya que se se crea un objeto de clase B pero se referencia como un objeto de la clase padre
Se realiza un casting para tratar la referencia de tipo animal como una referencia de tipo B, por lo tanto el metodo
al cual se llama es de se la clase B.
*/