import java.util.Scanner;

public class Ej4_1 {
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
        String invertido="";

        while (num > 0){
            invertido +=""+ num%10;
            num/=10;
        }
        System.out.println("El número invertido es el "+invertido);
    }
}
