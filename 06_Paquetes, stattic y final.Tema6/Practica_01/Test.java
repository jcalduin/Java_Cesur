package Practica_01;

public class Test {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan");
        System.out.println(persona1);
        Persona persona2 = new Persona("Juan");
        System.out.println(persona2);
        Persona persona3 = new Persona("Pepa");
        System.out.println(persona3);

        System.out.println("Contador de personas: "+ Persona.getContadorPersonas());
    }
}