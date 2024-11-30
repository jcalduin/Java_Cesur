package Ejercicio19;

public class Parent {
    void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void display(String msg) {
        System.out.println("Child: " +msg);
    }
}

class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}

//Es el mismo que en el ejercicio 10...