package Ejercicio3;

public class Reptil extends Animal {
    private boolean esVenenoso;

    public Reptil(String nombre, int edad, boolean esVenenoso) {
        super(nombre, edad);
        this.esVenenoso = esVenenoso;
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    @Override
    public String toString() {
        return super.toString()+" Reptil{" +
                "esVenenoso=" + esVenenoso +
                '}';
    }

    @Override
    public void emitirSonido() {
        System.out.println("El reptil emite un sonido");
    }
}
