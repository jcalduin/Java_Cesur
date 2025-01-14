package Practica_02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Número de bolas blancas: ");
        int blancas = sc.nextInt();
        System.out.print("Número de bolas negras: ");
        int negras = sc.nextInt();
        sc.close();
        Urna urna = new Urna(blancas, negras);

        while (urna.totalBolas() > 1) {
            if(urna.bola() == urna.bola()) {
                urna.ponerBlanca();
            } else {
                urna.ponerNegra();
            }
            System.out.println("---------Total de bolas-> NEGRAS:"+urna.blancas+" -- BLANCAS:"+urna.negras);
        }

        System.out.println("La última bola es: "+urna.bola());
/*
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuántas bolas blancas? ");
        int blancas = sc.nextInt();
        System.out.print("Cuántas bolas negras? ");
        int negras = sc.nextInt();
        sc.close();
        Urna miUrna = new Urna(blancas, negras);
        while (miUrna.totalBolas()>1){
            if (miUrna.bola() == miUrna.bola()){
                miUrna.ponerBlanca();
            } else {
                miUrna.ponerNegra();
            }
            System.out.println(" - Total: Blancas: " + miUrna.blancas+", Negras: " + miUrna.negras);
        }
        System.out.println("La bola es "+miUrna.bola());*/
    }
}
