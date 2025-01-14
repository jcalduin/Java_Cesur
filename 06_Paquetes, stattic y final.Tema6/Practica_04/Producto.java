package Practica_04;

import java.util.Arrays;

public class Producto {
    private String nombre;
    private double[] preciosHistoricos;
    private static int totalProductos=0;

    public Producto(String nombre,double precioInicial) {
        this.nombre = nombre;
        this.preciosHistoricos=new double[5];
        preciosHistoricos[0]=precioInicial;
        totalProductos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getPreciosHistoricos() {
        return preciosHistoricos;
    }

    public void setPreciosHistoricos(double[] preciosHistoricos) {
        this.preciosHistoricos = preciosHistoricos;
    }

    public void agregarPrecio(double nuevoPrecio) {
        boolean encontrado=false;
        int indice=1;
        do {
            if (preciosHistoricos[indice] == 0) {
                preciosHistoricos[indice]=nuevoPrecio;
                encontrado=true;
            } else
                indice++;
        }while(!encontrado && indice<preciosHistoricos.length);
    }

    public double[] obtenerPreciosHistoricos() {
        return preciosHistoricos;
    }

    public double obtenerPrecioActual() {
        boolean encontrado=false;
        int indice=0;
        double precio = 0;
        do {
            if (preciosHistoricos[indice] == 0) {
                encontrado=true;
            } else
                indice++;
        }while(!encontrado && indice<preciosHistoricos.length);
        if (encontrado)
            precio=preciosHistoricos[indice-1];
        else
            precio =preciosHistoricos[preciosHistoricos.length-1];
        return precio;
    }

    public void mostrarDetalles() {
        System.out.println("-------");
        System.out.printf("Nombre: %s\nPrecio actual: %.2f€\nHistorico de precios: %s%n",nombre,obtenerPrecioActual(), Arrays.toString(obtenerPreciosHistoricos()));
    }

    public static int obtenerTotalProductos() {
        return totalProductos;
    }
}
