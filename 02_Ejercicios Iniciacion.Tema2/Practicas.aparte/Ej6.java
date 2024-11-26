import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        /*
        Escribir un algoritmo que pida números enteros hasta que se introduzca un
        valor menor o igual a cero. A continuación debe mostrar la suma total de
        dichos números. Se debe incluir todos los número que hemos ido
        introduciendo por teclado
         */

        Scanner sc = new Scanner(System.in);
        int n;
        int suma = 0;

        do {
            System.out.print("Introduce un número: ");
            n = sc.nextInt();
            if (n > 0){
                suma += n;
            }
        } while (n > 0);

        System.out.println("La suma de todos los números es: "+suma);
    }
}
