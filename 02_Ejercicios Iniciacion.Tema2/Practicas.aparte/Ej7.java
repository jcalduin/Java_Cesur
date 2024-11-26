import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        /*
        Crea un programa en java que dado un número, nos muestre dicho número
        con las cifras invertidas. No se pueden usar Strings
         */
        Scanner entrada = new Scanner(System.in);
        String resultado = "";
        int total = 0;
        int num = 0;

        do {
            System.out.println("Introduce un número positivo, cero para terminar");
            num = entrada.nextInt();
            int cifras = 1;
            int suma = num % 10;
            int aux = num;

            while (aux > 9) {
                aux /= 10;
                cifras++;
                suma += aux % 10;
            }
            if (cifras == suma) {
                resultado += num + "+";
                total += num;
            }
        } while (num != 0);

        System.out.println(resultado + "\b=" + total);
        entrada.close();
    }
    }

