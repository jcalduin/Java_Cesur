import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*
        Realiza un programa que determine si un número de n dígitos ingresado
        por el usuario es un número narcisista. Un número narcisista es aquel
        que es igual a la suma de sus dígitos elevados a la potencia n. Por
        ejemplo: Si escribimos el 153, tiene 3 dígitos, la suma de
        13+53+33 = 153
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int n = sc.nextInt();
        int num = n;
        int veces=0;
        double suma=0;
        int resto;

        while (n > 0){
            n= n / 10;
            veces++;
        }

        n=num;

        for (int i = 1; i <= veces ; i++){
            resto = n % 10;
            suma +=Math.pow(resto,veces);
            n /= 10;
        }

        if (suma == num){
            System.out.printf("%d es un número narcicista.",num);
        } else {
            System.out.printf("%d no es un número narcicista.",num);
        }

        sc.close();
    }
}
