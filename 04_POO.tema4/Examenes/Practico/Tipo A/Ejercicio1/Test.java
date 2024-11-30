package Ejercicio1;

public class Test {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo(100);
        Coche coche = new Coche(120,"Camioneta");
        Bicicleta bici = new Bicicleta(15, "montaña");

        vehiculo.mover();
        coche.mover();
        bici.mover();

        System.out.println( );

        vehiculo.mover(50);
        coche.mover(57);
        bici.mover(13);

        System.out.println( );
        vehiculo.mover(100,"aslfalto");
        coche.mover(200,"carretera");
        bici.mover(8,"montañoso");
    }
}
