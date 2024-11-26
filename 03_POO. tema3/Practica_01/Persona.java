package Practica_01;
/*
Crea una clase llamada Persona que tenga los siguientes atributos:
• nombre (tipo String)
• edad (tipo int)
• genero (tipo String)
Define un constructor que acepte los tres atributos y asigne valores a los
atributos de la clase.
Crea métodos mostrarInfo() para mostrar la información de la persona, y
cumplirAnios() que aumente en 1 la edad.
En el metodo main(), crea al menos dos objetos de la clase Persona, asigna
valores y muestra su información llamando a los métodos correspondientes.
 */

public class Persona {
    private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void mostrarInfo() {
        System.out.printf("Nombre: %s || Edad: %d || Genero: %s \n", nombre, edad, genero);
    }
    public void cumplisAnios(){
        edad++;
    }
}
