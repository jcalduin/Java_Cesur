package Practica_01;

public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas = 0;

    /*Que un atributo sea static significa que que es compartido por todas las instancia de una clase.
    * y para llamar a su metodo no es necesario hacerlo llamando a la instancia de la clase si no a la clase en si.
    * por tanto si "persona1" es una instancia de la clase "Persona" al metodo se le llama directamente en la clase:
    * Persona.getContadorPersonas el cual es un atributo compartido por todas las instancias de la clasae Persona */

    public Persona(String nombre) {
        contadorPersonas++;
        this.idPersona = getContadorPersonas();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return  "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", contadorPersonas="+contadorPersonas;
    }
}
