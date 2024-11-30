package Ej3;

public class Test {
    public static void main(String[] args) {

        //instancio objetos

        Vehiculo vehiculo = new Vehiculo("Generico", 50);
        Coche coche = new Coche("Citroen",120,"C4");
        Bcicleta bicicleta = new Bcicleta("Bici",15,"BMX");

        //muestro info

        System.out.println(vehiculo);
        System.out.println(coche);
        System.out.println(bicicleta);

        //lamada a los metodos

        vehiculo.mover();
        vehiculo.mover(100);
        vehiculo.mover(50,"montañoso");

        coche.mover();
        coche.mover(200);
        coche.mover(120,"carretera");

        bicicleta.mover();
        bicicleta.mover(10);
        bicicleta.mover(5,"llano");
    }
}
