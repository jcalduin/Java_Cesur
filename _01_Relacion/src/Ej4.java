import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        Escribe un programa en java tal que lea una calificación entre 0-10 y
        muestre un mensaje con la calificaión alfabética correspondiente a esa
        calificación numérica, basandose en la siguiente tabla:
        0<=nota<4 insuficiente
        4<=nota<6 regular
        6<=nota<7 bien
        7<=nota<9 notable
        9<=nota<10 sobresaliente
         */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota : ");
        double nota = sc.nextDouble();

        if (nota >= 0 && nota < 4) {
            System.out.println("Insuficiente");
        } else if (nota >=4 && nota < 6){
            System.out.println("Regular");
        } else if (nota >=6 && nota < 7){
            System.out.println("Bien");
        } else if (nota >=7 && nota < 9){
            System.out.println("Notable");
        } else if (nota >=9 && nota <= 10){
            System.out.println("Sobresaliente");
        } else {
            System.out.println("No válido");
        }
*/
        Scanner sc = new Scanner(System.in);
        double nota;
        do{
            System.out.print("Introduce la nota:");
            nota = sc.nextDouble();
        } while (nota<0 || nota>10);
        if (nota >= 0 && nota < 4) {
            System.out.println("Insuficiente");
        } else if (nota >= 4 && nota < 6) {
            System.out.println("Regular");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        }
        sc.close();
    }
}
