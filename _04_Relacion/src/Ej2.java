import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
        Realiza un programa que permita pedir 10 Nº naturales y
        determine e imprima cuantos son pares, impares, positivos y
        negativos.
         */

        Scanner sc = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        int sumapar = 0;


        for (int i = 1; i <=10; i++){
            System.out.println("Introduzca" +i+" Nº: ");
            int n = sc.nextInt();
                if (n == 0){
                } else {
                    if (n % 2 == 0) {
                        par++;
                        sumapar = n + sumapar;
                    } else {
                        impar++;
                    }
                    if (n > 0) {
                        positivo++;
                    } else {
                        negativo++;
                    }
                }


        }

        System.out.println("Hay " +par+ " pares, "+impar+ " impares, "+positivo+ " positivos, "+negativo+ " negativos.");
        System.out.println("La suma de los pares es: "+sumapar);

        sc.close();
    }
}
