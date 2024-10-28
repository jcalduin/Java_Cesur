import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*
        Dados 10 números enteros que se ingresan por teclado, calcular
        cuántos de ellos son pares, cuanto suman ellos y el
        promedio de los impares
         */

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int par = 0;
        int impar =0;
        int sumaPar = 0;
        int sumaImpar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduzca "+i+"º número: ");
            n = sc.nextInt();
            if (n % 2 == 0){
                par++;
                sumaPar = sumaPar + n;
            } else {
                impar++;
                sumaImpar = sumaImpar + n;
            }
        }
        System.out.println("Hay "+par+" pares y la suma de estos es: "+sumaPar);
        System.out.println("Hay "+impar+" impares y el promedio de estos es: "+ sumaImpar*1.0/impar);


        sc.close();
    }
}
