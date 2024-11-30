package Ejercicio3;

import java.util.Scanner;

public class Revista extends MaterialBibliografico{
    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(String titulo, String autor, int anhoPublicacion, boolean disponible, int numeroEdicion, String mesPublicacion) {
        super(titulo, autor, anhoPublicacion, disponible);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public void prestar() {
        if (!isDisponible()) {
            System.out.println("Esta revista solo es para consulta interna");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("¿Cuantos días? ");
            int dias = sc.nextInt();
            sc.close();
            if (dias <= 7) {
                System.out.println("Revista prestada para "+dias+" dias");
                setDisponible(false);
            } else {
                System.out.println("La revista no puede ser prestada por más de 7 dias");
            }
        }
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero de edicion: "+numeroEdicion);
        System.out.println("Mes Publicacion: "+mesPublicacion);
    }
}
