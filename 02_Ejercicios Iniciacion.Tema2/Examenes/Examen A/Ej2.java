import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
         Escribe un programa en Java que lea un número entero positivo introducido
        por el usuario y calcule su factorial. El factorial de un número se calcula de la siguiente
        forma: se deben multiplicar todos los números enteros y positivos que hay entre el
        número introducido y el número. 1:
                    Ejemplo:
                        Factorial de 5 = 5 * 4 * 3 * 2 * 1 = 120
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        int factorial=1;

        for (int i = 1; i <= n; i++) {
            factorial*=i;
        }
        System.out.printf("El factorial de %d es : %d",n,factorial);
        sc.close();
    }
}
