package ejercicio7;

public class A {
    void display() {
        System.out.println("Clase A");
    }
}

class B extends A {
    void display () {
        System.out.println("Clase B");
    }
}

class C extends A{
    void display () {
        System.out.println("Clase C");
    }
}

class Test {
    public static void main(String[] args) {
        A obj = new C();
        obj.display();
    }
}

/*
La salida será "clase C" porque los metodos "display" están sobreescritos. Esto quiere decir que aunq el objeto
creado sea de tipo A ha sido inicializado como un objeto o instancia de la clase C el metodo que se ejcuta
es el perteneciente a la clase C

Nota** Si el metodo display no hubiera sido sobreescrito en la clase C en este caso la salida sería Clase A
*/
