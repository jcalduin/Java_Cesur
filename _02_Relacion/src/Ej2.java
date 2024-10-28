import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
        Escribir un programa que calcules el área de un triángulo recibiendo
        como entrada el valor de bsae y altura.(área = base * altura/2)
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Base del triángulo: ");
        double base = sc.nextDouble();
        System.out.println("Altura del triángulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura/2);

        System.out.println("El área del triángulo es: " + area);

        sc.close();
    }
}
