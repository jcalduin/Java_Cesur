package Practica_01;

public class ExcepcionDeDivisionPorCero extends Exception {
    public ExcepcionDeDivisionPorCero(double numero) {
        super("Trata excepción de divisiónpor cero:/ por "+numero);
    }
}
