package GestionDeVehiculos;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Marca: ");
        String marca = sc.nextLine();
        System.out.println("Modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Tipo: ");
        char tipo = sc.nextLine().charAt(0);
        System.out.println("Kilometraje: ");
        double kilometraje = Double.parseDouble(sc.nextLine());
        System.out.println("Consumo: ");
        double consumo = Double.parseDouble(sc.nextLine());

        Vehiculo v1 = new Vehiculo(marca, modelo, tipo, kilometraje, consumo);

        System.out.println("Marca: ");
        marca = sc.nextLine();
        System.out.println("Modelo: ");
        modelo = sc.nextLine();
        System.out.println("Tipo: ");
        tipo = sc.nextLine().charAt(0);

        Vehiculo v2 = new Vehiculo(marca, modelo, tipo);
        System.out.println("Kilometraje: ");
        kilometraje = Double.parseDouble(sc.nextLine());
        System.out.println("Consumo: ");
        consumo = Double.parseDouble(sc.nextLine());
        v2.setKilometros(kilometraje);
        v2.setConsumo(consumo);

        System.out.println("Marca: ");
        marca = sc.nextLine();
        System.out.println("Modelo: ");
        modelo = sc.nextLine();
        System.out.println("Tipo: ");
        tipo = sc.nextLine().charAt(0);
        System.out.println("Kilometraje: ");
        kilometraje = Double.parseDouble(sc.nextLine());;
        System.out.println("Consumo: ");
        consumo = Double.parseDouble(sc.nextLine());
        sc.close();
        Vehiculo v3 = new Vehiculo();
        v3.setMarca(marca);
        v3.setModelo(modelo);
        v3.setTipo(tipo);
        v3.setKilometros(kilometraje);
        v3.setConsumo(consumo);

        //*****************************************************************

        double distancia = 1500;

        System.out.println("El vehículo con matricula: " +v1.getMatricula()+ " tiene un consumo de: "+v1.calcularConsumo(distancia)+" litros para una distancia de: "+distancia);
        System.out.println("El vehículo con matricula: " +v2.getMatricula()+ " tiene un consumo de: "+v2.calcularConsumo(distancia)+" litros para una distancia de: "+distancia);
        System.out.println("El vehículo con matricula: " +v3.getMatricula()+ " tiene un consumo de: "+v3.calcularConsumo(distancia)+" litros para una distancia de: "+distancia);

        System.out.println("El vehículo con matricula: "+v1.getMatricula()+(v1.esVehiculoEconomico()?" es económico":"no es econónomico"));
        System.out.println("El vehículo con matricula: "+v2.getMatricula()+(v2.esVehiculoEconomico()?" es económico":"no es econónomico"));
        System.out.println("El vehículo con matricula: "+v3.getMatricula()+(v3.esVehiculoEconomico()?" es económico":"no es econónomico"));

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
