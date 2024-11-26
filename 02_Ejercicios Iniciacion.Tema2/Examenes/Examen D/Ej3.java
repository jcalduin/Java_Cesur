import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        Escribe un programa que genere los primeros n números triangulares,
        donde n es un número entero positivo escrito por el usuario. Un número triangular se
        define como la suma de los n primeros números naturales. El primer número triangular
        es 1, el segundo es 1 + 2 = 3, el tercero es 1 + 2 + 3 = 6, y así sucesivamente.
            Ejemplo:
                   Introduce la cantidad de números triangulares a generar: 5
                   Los primeros 7 números triangulares son:
                    1
                    3
                    6
                    10
                    15
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números triangulares a generar: ");
        int num = sc.nextInt();
        sc.close();
        System.out.printf("Los primeros %d números triangulares son: \n",num);
        int triangulares=0;

        for (int i = 1; i <= num ; i++) {
            triangulares += i;
            System.out.println(triangulares);
        }
    }
}
