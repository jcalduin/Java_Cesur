package Ej2;

public class Test {
    public static void main(String[] args) {

        //Instancia de los objetos

        Carnivoro leon = new Carnivoro("Leon");
        Herbivoro conejo =  new Herbivoro("Conejo");
        Omnivoro oso = new Omnivoro("Oso");

        System.out.println("Comportamiento general: ");
        leon.eat();
        conejo.eat();
        oso.eat();

        System.out.println("\n Comportamiento especifico con sobrecarga: ");

        leon.eat("carne");
        leon.eat("hierba");
        conejo.eat("hierba");
        conejo.eat("carne");
        oso.eat("frutas");
        oso.eat("carne");
        oso.eat("piedras");
    }
}
