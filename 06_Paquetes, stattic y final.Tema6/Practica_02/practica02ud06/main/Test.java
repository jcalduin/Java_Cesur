package Practica_02.practica02ud06.main;

import Practica_02.practica02ud06.Garaje.Garaje;
import Practica_02.practica02ud06.vehiculos.Coche;
import Practica_02.practica02ud06.vehiculos.Moto;

public class Test {
    public static void main(String[] args) {

        Garaje miGaraje = new Garaje(25,3);
        Coche coche1 = new Coche(4,"nissan",5000.50,"blanco","2795-FZG",4,false);
        Coche coche2 = new Coche(4,"Volkswagen",100000,"blanco","1845-LMN",3,true);
        Moto moto1 = new Moto(2,"yamaha",25000.54,"azul","2648-AWS",125);
        Moto moto2 = new Moto(2,"suzuki",10252.5,"gris","6574-RTF",250);

        miGaraje.introducirVehiculo(coche1);
        miGaraje.introducirVehiculo(coche2);
        miGaraje.introducirVehiculo(moto1);
        miGaraje.introducirVehiculo(moto2);
        System.out.println(miGaraje);
        miGaraje.retirarVehiculo("2456-fff");
        miGaraje.retirarVehiculo("1845-LMN");
        System.out.println(miGaraje);
        miGaraje.introducirVehiculo(moto2);
        System.out.println(miGaraje);
        System.out.println("Hay: "+miGaraje.totalVehiculos()+" vehículos en el garaje");
        System.out.printf("Precio de cambiar las ruedas: %.2f€%n",miGaraje.precioCambioRueda());
        System.out.printf("Kilometraje medio: %.2f km",miGaraje.kilometrajeMedio());

    }
}
