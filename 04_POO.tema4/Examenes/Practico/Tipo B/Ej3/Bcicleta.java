package Ej3;

public class Bcicleta extends Vehiculo{

    //atributos
    private String tipo;

    //constructor

    public Bcicleta(String nombre, int velocidad, String tipo) {
        super(nombre, velocidad);
        this.tipo = tipo;
    }

    //getter y setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //metodos sobreescritos

    @Override
    public void mover() {
        System.out.println("La bicicleta esta en marcha");
    }

    @Override
    public void mover(int distancia) {
        System.out.println("La bicicleta ha recorrido "+distancia+" kilometros");
    }

    @Override
    public void mover(int distancia, String terreno) {
        System.out.println("La bicicleta a recorrido "+distancia+" kilómetros en un terreno "+terreno);
    }

    //metodo toString para bicicleta


    @Override
    public String toString() {
        return "Bcicleta{" +
                "tipo='" + tipo + '\'' + super.toString()+
                '}';
    }
}
