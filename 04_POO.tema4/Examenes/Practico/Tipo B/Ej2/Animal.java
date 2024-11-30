package Ej2;

public class Animal {

    //atributos
    private String nombre;

    //Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Sobreescribo metodo toString
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    //metodos

    public void eat () {}

    //metodo sobrecargado
    public void eat (String food) {}
}
