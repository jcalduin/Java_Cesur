import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        Escribir el programa Java de un juego que consiste en adivinar un
        número en varios intentos. Se pedirá el rango (por ejemplo: entre 1 y
        100) y en cuántos intentos lo puede adivinar el jugador (por ejemplo:
        10 intentos). La información que dará el algoritmo es si el número es
        mayor o menor que el que introduzca el jugador. Si llegado el máximo
        número de intentos no lo ha adivinado, se mostrará un mensaje (por
        ejemplo, si el número a adivinar era el 32: “Ohhhh, no lo has adivinado!!
        Has superado el número máximo de intentos. El número era el 32”). Si
        lo adivina el jugador mostrará el mensaje: “Eres un crack!!! Lo has
        adivinado!!!”
        Para obtener un número aleatorio en Java, utilizaremos la clase
        Random de la librería java.util:
        static private Random r = new Random();
        Para obtener un número aleatorio entre 1 y valor
        int aleatorio = r.nextInt(valor) + 1;
        Nota: Para generar el número a adivinar debéis pedir el rango.
         */

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Desde que número: ");
        int rango1 = sc.nextInt();
        System.out.print("Hasta que número: ");
        int rango2 = sc.nextInt();

        System.out.print("¿Cuántos intentos quiere?: ");
        int intentos = sc.nextInt();

        int aleatorio = r.nextInt(rango2)+rango1;
        int num;
        boolean flag = false;
        int veces=1;

        while (!flag && veces <= intentos) {
            System.out.printf("Intento nº %d: Adivina el número\n", veces);
            System.out.print("> ");
            num = sc.nextInt();
            if (num > aleatorio) {
                System.out.println("El nº secreto es más pequeño.");
            } else if (num < aleatorio) {
                System.out.println("El nº secreto es mas grande");
            } else {
                System.out.println("Eres un crack!! Lo has adivinado!!!");
                flag = true;
            }
            veces++;
        }
        if (!flag){
            System.out.println("Ohhh, no has acertado. El número era: "+aleatorio);
        }
    }
}
