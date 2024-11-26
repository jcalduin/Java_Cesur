import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*
        Escribir un programa que lea un número entero (lado del cuadrado) y a
        partir de él cree un cuadrado de asteriscos con ese tamaño. Los
        asteriscos sólo se verán en el borde del cuadrado, no en el interior.
        Ejemplo, para lado = 4 escribiría:
                                ****
                                *  *
                                *  *
                                ****
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el lado del cuadrado: ");
        int lado = sc.nextInt();
        sc.close();

        for (int i = 1; i <=lado ; i++) {                       //Este for pinta la fila
            for (int j = 1; j <=lado ; j++) {                   //Este for pinta las columnas
                if (i==1 || i == lado || j==1 || j == lado) {   //Esta condición explica que si la fila es 1 o lado printe asteriscos y
                    System.out.print("*");                      // si la comlumna es la primera o la ultima printe asteriscos
                } else {
                    System.out.print(" ");                      //si no printa espacios
                }
            }
            System.out.println();
        }
    }
}
