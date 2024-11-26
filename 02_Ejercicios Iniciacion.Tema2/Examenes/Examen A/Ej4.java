import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        Escribe un programa que determine si un número ingresado por el
        usuario es un número de Armstrong. Un número de Armstrong de n dígitos es aquel
        que es igual a la suma de sus dígitos elevados a la potencia n..
                Ejemplo:
                    Escribe un número: 371
                    Es un número de Armstrong
            ->(la suma sería (n=3 cifras): 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371)
              Algunos números de Armstrong son 371, 8208 y 4210818
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int num = sc.nextInt();
        sc.close();

        int cifras=0;
        int n = num;
        double suma=0;

        while (num > 0){
            num/=10;
            cifras++;
        }

        num = n;

        while (num > 0){
            int resto=num%10;
            suma+= Math.pow(resto,cifras);
            num/=10;
        }

        if (suma == n){
            System.out.println("Es un número Armstrong");
        } else {
            System.out.println("No es un número Armstrong");
        }
    }
}
