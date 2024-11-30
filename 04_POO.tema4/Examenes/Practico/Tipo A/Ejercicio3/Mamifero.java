package Ejercicio3;

public class Mamifero extends Animal {
    private String tipoDeAlimentacion;

    public Mamifero(String nombre, int edad, String tipoDeAlimentacion) {
        super(nombre, edad);
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public String getTipoDeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion) {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    @Override
    public String toString() {
        return super.toString()+ " Mamifero{" +
                "tipoDeAlimentacion='" + tipoDeAlimentacion + '\'' +
                '}';
    }

    @Override
    public void emitirSonido() {
        System.out.println("El mamífero " +tipoDeAlimentacion+ " emite un sonido");
    }
}
