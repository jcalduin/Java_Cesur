import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
        Introducir 10 números y decir si alguno ha sido negativo e indicar el valor
        maximo introducido
         */

        Scanner sc = new Scanner(System.in);

        int negativo = 0, mayor , num;
        System.out.print("Introduce el 1º número: ");
        num = sc.nextInt();
        mayor = num;

        if (num < 0){
            negativo++;
        }

        for (int i = 2; i <=10 ; i++) {
            System.out.print("Introduce " + i + "º número ");
            num = sc.nextInt();
            if (num < 0) {
                negativo++;
            }
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("El número mayor introducido es: "+ mayor);
        System.out.println("Has introducido "+negativo+" negativos");


        sc.close();
    }

}


