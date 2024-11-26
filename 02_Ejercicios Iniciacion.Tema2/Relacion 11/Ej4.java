import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        Realiza un programa en el que el usuario adivine la suma de dos dados
        lanzados por la computadora. El programa genera dos números
        aleatorios entre 1 y 6, suma ambos, y le da al usuario varias
        oportunidades para adivinar la suma.
         */

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int dado1 = rand.nextInt(6)+1;
        int dado2 = rand.nextInt(6)+1;
        int sumadados = dado1+dado2;
        boolean flag = true;
        int sumaIntentos=1;

        System.out.print("¿Cuántos intentos necesitas para adivinar la suma de los dados?: ");
        int intetos = sc.nextInt();

        do {
            for (int i = 1; i <= intetos; i++) {
                System.out.print("Intento nº: ");
                int numero = sc.nextInt();
                if (numero < sumadados) {
                    System.out.println("Tu suma es menor");
                } else if (numero > sumadados) {
                    System.out.println("Tu suma es mayor");
                } else {
                    System.out.println("Enhorabuena, has acertado!!");
                    flag = false;
                }
                sumaIntentos++;
            }
        }while (!flag && sumaIntentos <= intetos );

        if (flag) System.out.printf("Lo siento, has fallado!!.Los números eran %d y %d, la suma de estos es: %d", dado1, dado2, sumadados);
        sc.close();
    }
}
