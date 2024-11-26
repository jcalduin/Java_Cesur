import java.util.Random;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
        Escribe un programa en Java que simule el lanzamiento de un dado n
        veces. Tendremos que mostrar cuántas veces ha salido cada uno de los
        seis números del dado. Para ello, utilizaremos :
                        Random r = new Random();
              Para obtener un número aleatorio entre 1 y valor
                   int aleatorio = r.nextInt(valor) + 1;
         */
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("¿Cuántas veces lanza el dado?: ");
        int veces = sc.nextInt();
        int dado;
        int contador1=0 ,contador2=0, contador3=0 ,contador4=0, contador5=0 ,contador6=0;

        for (int i = 1; i <= veces; i++) {
            dado = r.nextInt(6)+1;
            switch (dado) {
                case 1 -> contador1++;
                case 2 -> contador2++;
                case 3 -> contador3++;
                case 4 -> contador4++;
                case 5 -> contador5++;
                case 6 -> contador6++;
            }
        }
        if(contador1>0) System.out.printf("Ha salidos el 1 %d veces\n", contador1);
        if(contador2>0) System.out.printf("Ha salidos el 2 %d veces\n", contador2);
        if(contador3>0) System.out.printf("Ha salidos el 3 %d veces\n", contador3);
        if(contador4>0) System.out.printf("Ha salidos el 4 %d veces\n", contador4);
        if(contador5>0) System.out.printf("Ha salidos el 5 %d veces\n", contador5);
        if(contador6>0) System.out.printf("Ha salidos el 6 %d veces\n", contador6);
        sc.close();
    }
}
