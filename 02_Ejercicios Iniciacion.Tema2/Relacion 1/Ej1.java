import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        //Escribe un progrma en java tal que dados tres Nº indique cual de ellos es mayor

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero :");
        int num1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero :");
        int num2 = sc.nextInt();
        System.out.println("Introduzca el tercer numero :");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " Es mayor que " + num2 + " y " + num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " Es mayor que " + num1 + " y " + num3);
        } else {
            System.out.println(num3 + " Es mayor que " + num1 + " y " + num2);
        }


    }
}
