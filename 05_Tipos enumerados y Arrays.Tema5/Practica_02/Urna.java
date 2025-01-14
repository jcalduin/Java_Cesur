package Practica_02;

import java.util.Random;

public class Urna {
    protected int blancas;
    protected int negras;

    public Urna(int blancas, int negras) {
        this.blancas = blancas;
        this.negras = negras;
    }

    public int totalBolas() {
        return blancas + negras;
    }

    public ColorBola bola() {
        Random r = new Random();
        ColorBola resultado;
        int aleatorio = r.nextInt(totalBolas()) +1;
        if (aleatorio <= blancas) {
            System.out.println("Se extrae un bola blanca");
            resultado = ColorBola.BLANCAS;
            blancas--;
        } else {
            System.out.println("Se extrae una bola negra");
            resultado = ColorBola.NEGRAS;
            negras--;
        }
        return resultado;
    }

    public void ponerBlanca() {
        blancas++;
    }

    public void ponerNegra() {
        negras++;
    }
}
