package Practica_01;

public class SerVivo {
    private byte edad;

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public SerVivo(byte edad) {
        this.edad = edad;
    }
    // Añado metodo equals y comparo seres vivos. Son iguales si tienen la misma edad.
    public boolean equals (SerVivo otro){
        return this.edad == otro.edad;
    }
    //Sobreescribo toString muestra la info de ser vivo.

    @Override
    public String toString() {
        return "Edad: " + edad;
    }
    //Añado metodo mayor y me devuelve el ser vivo de mayor edad

    public SerVivo mayor(SerVivo otro){
        SerVivo resultado;
        if(this.edad > otro.edad){
            resultado = this;
        } else {
            resultado = otro;
        }
        return resultado;
    }
}
