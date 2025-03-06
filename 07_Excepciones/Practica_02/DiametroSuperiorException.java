package Practica_02;

public class DiametroSuperiorException extends Exception {
    public DiametroSuperiorException(String nombre) {
        super("El planeta "+nombre+" tiene un diametro superior a 100");
    }
}
