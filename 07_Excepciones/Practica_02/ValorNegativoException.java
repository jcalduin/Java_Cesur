package Practica_02;

public class ValorNegativoException extends Exception {
    public ValorNegativoException(String nombre) {
        super("El diámetro introducido del planeta: "+nombre+" debe ser mayor que 0");
    }
}
