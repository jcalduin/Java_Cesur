package Practica_02;

public class Mundo {
    private String nombre;
    private float diametro;
    private boolean habitable;

    public Mundo(String n, float d, boolean h) {
        this.nombre = n;
        this.diametro = d;
        this.habitable = h;
    }

    public Mundo() {
        this.nombre = "";
        this.diametro = 0;
        this.habitable = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }
}
