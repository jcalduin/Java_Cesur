package Ejercicio3;

public class Test {
    public static void main(String[] args) {

        Mamifero leon = new Mamifero("León",5,"carnívoro");
        Ave loro = new Ave("Loro", 2,true);
        Reptil serpiente = new Reptil("Serpiente",3,true);

        System.out.println(leon.toString());
        System.out.println(loro.toString());
        System.out.println(serpiente.toString());

        leon.emitirSonido();
        loro.emitirSonido();
        serpiente.emitirSonido();
    }
}
