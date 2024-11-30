package Ej3;

public class Coche extends Vehiculo{

    //atributos
    private String modelo;

    //constructor

    public Coche(String nombre, int velocidad, String modelo) {
        super(nombre, velocidad);
        this.modelo = modelo;
    }

    //getter y setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //metodos sobreescritos


    @Override
    public void mover() {
        System.out.println("El coche esta en marcha");
    }

    @Override
    public void mover(int distancia) {
        System.out.println("El coche a recorrido "+distancia+" kilómetros");
    }

    @Override
    public void mover(int distancia, String terreno) {
        System.out.println("El coche a recrrido "+distancia+" kilómetros en un terreno "+terreno);
    }

    //metodo toString para coche

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' + super.toString()+
                '}';
    }
}
