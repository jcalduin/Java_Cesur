package Ejercicio1;

public class Coche extends Vehiculo {
    private String modelo;

    public Coche(int velocidad, String modelo) {
        super(velocidad);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString() + "Coche{Modelo: " + modelo+"}";
    }

    @Override
    public void mover() {
        System.out.println("El coche esta en marcha");
    }

    @Override
    public void mover(int distancia) {
        System.out.println("El coche recorrio "+distancia+ " kilómetros");
    }

    @Override
    public void mover(int distancia, String terreno) {
        System.out.println("El coche recorrio "+distancia+ " kilómetros en terreno "+terreno);    }
}
