import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
         Escribe un programa que lea un número entero y calcule la suma de sus
         dígitos..
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int num = sc.nextInt();
        int suma=0;

        while (num > 0){
            suma+=num%10;
            num/=10;
        }
        System.out.println("La suma de sus dígitos es: "+suma);
        sc.close();
    }
}
