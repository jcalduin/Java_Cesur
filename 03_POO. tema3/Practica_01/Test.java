package Practica_01;

public class Test {
    public static void main(String[] args) {

        Persona p1 = new Persona("Javi",25,"Masculino");
        Persona p2 = new Persona("Sofía",37,"Femenino");

        p1.mostrarInfo();
        p2.mostrarInfo();
        p1.cumplisAnios();
        p2.cumplisAnios();
        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}
