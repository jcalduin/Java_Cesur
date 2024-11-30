package Ej2;

public class Herbivoro extends Animal{

    //constructor

    public Herbivoro(String nombre) {
        super(nombre);
    }

    //sobreescribo el metodo to String

    @Override
    public String toString() {
        return "Herbivoro{}";
    }

    //metodos

    //metodo sobreescrito eat

    @Override
    public void eat() {
        System.out.println("El conejo está comiendo vegetales");
    }

    //metodo sobrecargado
    public void eat (String food) {
        if (food.equalsIgnoreCase("Carne")) {
            System.out.println("El conejo no puede comer "+food);
        } else if (food.equalsIgnoreCase("hierba")) {
            System.out.println("El conejo esta comiendo "+food);
        }
    }
}
