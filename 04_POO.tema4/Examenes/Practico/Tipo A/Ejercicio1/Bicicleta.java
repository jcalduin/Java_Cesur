package Ejercicio1;

public class Bicicleta extends Vehiculo{
    private String tipo;

    public Bicicleta(int velocidad, String tipo) {
        super(velocidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "Bicicleta{ Tipo: " + tipo+" }";
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta esta en marcha");
    }

    @Override
    public void mover(int distancia) {
        System.out.println("La bicicleta recorrio "+distancia+ " kilómetros");
    }

    @Override
    public void mover(int distancia, String terreno) {
        System.out.println("La bicileta recorrio "+distancia+ " kilómetros en terreno "+terreno);
    }
}
