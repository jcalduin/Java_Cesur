package Ej2;

public class Omnivoro extends Animal {

    //constructor
    public Omnivoro(String nombre) {
        super(nombre);
    }

    //sobreescribo el metodo to String

    @Override
    public String toString() {
        return "Omnivoro{}";
    }

    //metodos

    //metodo sobreescrito eat

    @Override
    public void eat() {
        System.out.println("El oso está comiendo carne y vegetales");
    }

    //metodo sobrecargado

    public void eat (String food) {
        if (food.equalsIgnoreCase("carne")) {
            System.out.println("El oso esta comiendo "+ food);
        } else if (food.equalsIgnoreCase("hierba") || food.equalsIgnoreCase("frutas")){
            System.out.println("El oso esta comiendo "+food);
        } else {
            System.out.println("El oso no puede comer este tipo de alimento");
        }
    }
}
