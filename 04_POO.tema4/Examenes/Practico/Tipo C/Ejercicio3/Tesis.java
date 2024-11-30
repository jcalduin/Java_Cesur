package Ejercicio3;

import java.util.Scanner;

public class Tesis extends MaterialBibliografico{
    private String universidad;
    private String campoEstudio;

    public Tesis(String titulo, String autor, int anhoPublicacion, boolean disponible, String universidad, String campoEstudio) {
        super(titulo, autor, anhoPublicacion, disponible);
        this.universidad = universidad;
        this.campoEstudio = campoEstudio;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCampoEstudio() {
        return campoEstudio;
    }

    public void setCampoEstudio(String campoEstudio) {
        this.campoEstudio = campoEstudio;
    }

   public void prestar (boolean permiso) {
        if (permiso) {
            System.out.println("El libro ha sido prestado exitosamente");
        } else {
            System.out.println("El préstamo de esta tesis requiere permisos especiales");
        }
   }

   public void prestar (int dias) {
       System.out.println("La tesis ha sido prestada "+dias+" dias");
       setDisponible(false);
   }

   public void prestar (String usuario) {
        System.out.println("La tesis ha sido prestada a: "+usuario);
   }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Universidad: "+universidad);
        System.out.println("Campo Estudio: "+campoEstudio);
    }
}
