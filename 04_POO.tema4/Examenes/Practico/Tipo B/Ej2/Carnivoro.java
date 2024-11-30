package Ej2;

public class Carnivoro extends Animal{

    //constructor
    public Carnivoro(String nombre) {
        super(nombre);
    }

    //sobreescribo el metodo to String
    @Override
    public String toString() {
        return "Carnivoro{}";
    }

    //metodos

    //metodo sobreescrito eat
    @Override
    public void eat() {
        System.out.println("El león está comiendo carne");
    }

    //metodo sobrecargado
    public void eat (String food) {
        if (food.equalsIgnoreCase("carne")){
            System.out.println("El león esta comiendo "+food);
        } else {
            System.out.println("El león no puede comer "+food);
        }
    }
}
