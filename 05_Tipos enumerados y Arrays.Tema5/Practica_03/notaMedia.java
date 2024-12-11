package Practica_03;

import java.util.Scanner;

public class notaMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de alumnos: ");
        int n = sc.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < notas.length ; i++) {
            System.out.print("Nota del "+(i+1)+"º alumno: ");
            notas[i] = sc.nextDouble();
        }

        double media =0;

        for (double nota : notas) {
            media += nota;
        }
        media = media/notas.length;
        System.out.println("La media es: "+media);

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= media) {
                System.out.println("La nota del "+(i+1)+"º alumno es superior a la media. Nota: "+notas[i]);
            }
        }
    }
}
