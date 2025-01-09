package Practica_06;

public class Revista extends Ejemplar{
    private int numEdicion;
    private Frecuencia frecuencia;

    public Revista(String titulo, String autor, int anho, int numEdicion, String frecuencia) {
        super(titulo, autor, anho);
        this.numEdicion = numEdicion;
        comprobarFrecuencia(frecuencia);
    }

    public int getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Frecuencia frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numEdicion=" + numEdicion +
                ", frecuencia=" + frecuencia +
                '}'+super.toString();
    }

    @Override
    public void mostrarInfo() {
        System.out.println(this);
    }

    private void comprobarFrecuencia (String frecuencia) {
        switch (frecuencia.toLowerCase()) {
            case "mensual" -> this.frecuencia = Frecuencia.MENSUAL;
            case "trimestral" -> this.frecuencia = Frecuencia.TRISMESTRAL;
            case "anual" -> this.frecuencia = Frecuencia.ANUAL;
            default -> this.frecuencia = Frecuencia.SEMANAL;
        }
    }
}
