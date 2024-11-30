package Ejercicio3;

public class Ave extends Animal {
    private boolean puedeVolar;

    public Ave(String nombre, int edad, boolean puedeVolar) {
        super(nombre, edad);
        this.puedeVolar = puedeVolar;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String toString() {
        return super.toString()+" Ave{" +
                "puedeVolar=" + puedeVolar +
                '}';
    }

    @Override
    public void emitirSonido() {
        System.out.println("El ave emite un sonido");
    }
}
