import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea un número entero positivo ingresado por el
        usuario y determine si es un número capicúa. Un número es capicúa si se lee igual de
        izquierda a derecha que de derecha a izquierda, como 121 o 1331.
            Ejemplo:
                Escribe un número: 56765
                El número es capicúa
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int original = sc.nextInt();
        sc.close();
        int num = original;
        int reverso =0;

        while (num > 0){
            int ultimo= num%10;
            reverso =  reverso*10+ultimo;
            num/=10;
        }
        if (reverso == original){
            System.out.println("El número es capicúa");
        } else {
            System.out.println("El número no es capicúa");
        }
    }
}
