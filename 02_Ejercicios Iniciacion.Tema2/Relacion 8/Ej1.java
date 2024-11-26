import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*
        Escribe un programa para comprobar si un número es primo o no. Un
        Número es primo si solo es divisible entre el 1 y ese mismo número.
         */

        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo=true;
        int contador=2;

        do{
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
        } while (num <= 0);
        sc.close();

        while(primo && contador<num){
            if(num%contador==0) {
                primo = false;
            }contador++;
        }
        if(primo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }
}
