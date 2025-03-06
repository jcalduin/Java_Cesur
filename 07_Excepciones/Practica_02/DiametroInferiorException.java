package Practica_02;

public class DiametroInferiorException extends Exception {
    public DiametroInferiorException(String nombre) {
        super("El planeta "+nombre+" tiene un diametro inferior a 20");
    }
}
