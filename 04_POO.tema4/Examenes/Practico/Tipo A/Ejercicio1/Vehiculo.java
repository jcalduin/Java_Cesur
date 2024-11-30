package Ejercicio1;

public class Vehiculo {
    private int velocidad;

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "velocidad=" + velocidad +
                '}';
    }

    public void mover() {
        System.out.println("El vehículo esta en marcha");
    }

    public void mover (int distancia) {
        System.out.println("El vehículo recorrio "+distancia+ " kilómetros");
    }

    public void mover (int distancia, String terreno) {
        System.out.println("El vehículo recorrio "+distancia+ " kilómetros en terreno "+terreno);
    }
}
