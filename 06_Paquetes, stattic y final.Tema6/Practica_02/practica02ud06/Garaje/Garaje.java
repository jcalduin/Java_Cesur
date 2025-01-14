package Practica_02.practica02ud06.Garaje;

import Practica_02.practica02ud06.vehiculos.Vehiculo;

import java.util.Arrays;

public class Garaje {
    private double precioRueda;
    private Vehiculo[] vehiculos;

    public Garaje(double precioRueda, int capacidad) {
        this.precioRueda = precioRueda;
        this.vehiculos = new Vehiculo[capacidad];
    }

    public double getPrecioRueda() {
        return precioRueda;
    }

    public void setPrecioRueda(double precioRueda) {
        this.precioRueda = precioRueda;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Garaje{" +
                "precioRueda=" + precioRueda +
                ", vehiculos=" + Arrays.toString(vehiculos) +
                '}';
    }

    public void introducirVehiculo(Vehiculo vehiculo) {
        boolean huecoLibre = false;
        int huecos = 0;

        do {
            if (this.vehiculos[huecos] == null) {
                this.vehiculos[huecos] = vehiculo;
                huecoLibre = true;
                System.out.println("Vehículo aparcado correctamente");
            } else {
                huecos++;
            }
        }while (!huecoLibre && huecos < vehiculos.length);

        if (!huecoLibre) {
            System.out.println("No quedan huecos disponibles");
        }
    }

    public void retirarVehiculo(String matricula) {
        boolean huecoLibre = false;
        int huecos = 0;

        do {
            if (this.vehiculos[huecos] != null && vehiculos[huecos].getMatricula().equals(matricula)) {
                this.vehiculos[huecos] = null;
                huecoLibre = true;
            } else
                huecos++;
        }while (!huecoLibre && huecos < vehiculos.length);

        if (huecoLibre) {
            System.out.println("Vehículo retirado correctamente");
        } else
            System.out.println("El vehículo no se encuentra");
    }

    public int totalVehiculos() {
        int total = 0;
        for(Vehiculo v : vehiculos) {
            if (v != null)
                total++;
        }
        return total;
    }

    public double precioCambioRueda() {
        double resultado = 0;
        for(Vehiculo v: vehiculos) {
            if (v != null) {
                resultado += v.getNumRuedas() * precioRueda;
            }
        }
        return resultado;
    }

    public double kilometrajeMedio() {
        double resultado = 0;
        int numVehiculos = 0;
        for (Vehiculo v : vehiculos) {
            if (v != null) {
                resultado += v.getKilometraje();
                numVehiculos++;
            }
        }
        return resultado / numVehiculos;
    }
}
