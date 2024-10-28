import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        Escribir un programa tal que dados 2 valores de entrada imprima
        siempre la división del mayor de esos dos números entre el menor
        esos dos
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un Nª: ");
        double n1 = sc.nextDouble();
        System.out.println("Introduce un Nª: ");
        double n2 = sc.nextDouble();

        if (n1 > n2){
            System.out.println(n1 / n2);
        } else System.out.println(n2 / n1);
    }
}
