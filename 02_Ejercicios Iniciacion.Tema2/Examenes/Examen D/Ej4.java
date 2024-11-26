import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        Escribe un programa que calcule el Máximo Común Divisor (MCD) de dos
        números ingresados por el usuario usando el algoritmo de Euclides. El Máximo Común
        Divisor (MCD) de dos números enteros a y b es el mayor número que puede dividir
        exactamente a ambos. Por ejemplo, el MCD de 12 y 8 es 4, ya que 4 es el número más
        grande que puede dividir tanto a 12 como a 8 sin dejar resto. El algoritmo de Euclides
        es un metodo eficiente para encontrar el MCD de dos números. Se basa en la siguiente
        idea:
            Si b es 0, entonces MCD(a, b) = a.
            Si b no es 0, entonces MCD(a, b) = MCD(b, a % b).
            El operador % es el módulo, y a % b nos da el resto de dividir a entre b.
            Este proceso se repite hasta que b sea igual a 0. En ese punto, el MCD es el valor
            de a.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        sc.close();
        int MCD;
        int a2 = a;
        int b2 = b;

        if (a != 0 && b != 0 && a > b) {
            do{
                MCD = a % b;
                a = b;
                b = MCD;
            } while (b != 0);
            System.out.printf("El MCD de (%d,%d) es: %d",a2,b2,a);
        } else if (a != 0 && b != 0 && b > a) {
            do {
                MCD = b % a;
                b = a;
                a = MCD;
            }while (a !=0);
            System.out.printf("El MCD de (%d,%d) es: %d",a2,b2,b);
        } else if (a == 0){
            System.out.printf("El MCD de (%d,%d) es: %d",a,b,b);
        }else {
            System.out.printf("El MCD de (%d,%d) es: %d",a,b,a);
        }
    }
}
