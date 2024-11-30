package Ej3;

public class Vehiculo {

    //atributos

    private String nombre;
    private int velocidad;

    //constructor

    public Vehiculo(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    //getter y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //metodos

    public void mover () {
        System.out.println("El vehículo esta en marcha");
    }

    //metodos sobrecargado

    public void mover (int distancia) {
        System.out.println("El vehículo ha recorrido "+ distancia+" kilómetros");
    }

    public void mover (int distancia, String terreno) {
        System.out.println("El vehículo ha recorrido "+distancia+" kilómetros en un terreno "+terreno);
    }

    //metodo toString sobreescrito

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
