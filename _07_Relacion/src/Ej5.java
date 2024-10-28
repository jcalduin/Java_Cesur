import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*
        Escribir un programa Java que convierta un número decimal a binario,
        octal y hexadecimal.
         */

        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número en decimal: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        sc.close();

        int resto;
        String resultado="";
        int copia = numero;

        while (numero > 0) {
            resto=numero%2;
            numero=numero/2;
            resultado=resto+resultado;
        }
        System.out.println("El número en binario es: "+resultado);

        numero=copia;
        resultado="";

        while (numero > 0) {
            resto=numero%8;
            numero=numero/8;
            resultado=resto+resultado;
        }
        System.out.println("El número en octal es: "+resultado);

        numero=copia;
        resultado="";

        while (numero > 0) {
            resto=numero%16;
            numero=numero/16;
            if (resto > 9){
                switch (resto){
                    case 10 -> resultado="A"+resultado;
                    case 11 -> resultado="B"+resultado;
                    case 12 -> resultado="C"+resultado;
                    case 13 -> resultado="D"+resultado;
                    case 14 -> resultado="E"+resultado;
                    case 15 -> resultado="F"+resultado;
                }
            } else {
                resultado=resto+resultado;
            }
        }
        System.out.println("El número en hexadecimal es: "+resultado);
    }
}
