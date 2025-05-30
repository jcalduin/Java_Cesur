import java.util.Scanner;

public class Ej4_2 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea un número entero y lo invierta. Por ejemplo,
        si el usuario introduce 1234, el programa debe devolver 4321.
            Ejemplo:
                Escribe un número: 678
                El número invertido es el 876
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int num = sc.nextInt();
        sc.close();
        int reverso =0;

        while (num > 0) {
            int ultimo = num%10;
            reverso = reverso *10 + ultimo;
            num = num/10;
        }
        System.out.println("El número invertido es el "+reverso);
    }
}
