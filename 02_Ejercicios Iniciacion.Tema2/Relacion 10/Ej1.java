import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        /*
        . Escribe un programa en Java que lea 3 datos de entrada A, B y C. Estos
        corresponden a las dimensiones de los lados de un triángulo. El programa
        debe determinar qué tipo de triangulo es, teniendo en cuenta los
        siguiente:
        • Si se cumple Pitágoras entonces es triángulo rectángulo (a2+b2=c2)
        • Si solo dos lados del triángulo son iguales entonces es isósceles.
        • Si los 3 lados son iguales entonces es equilátero.
        • Si no se cumple ninguna de las condiciones anteriores, es escaleno.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el lado A: ");
        double a = sc.nextDouble();
        System.out.print("Introduce el lado B: ");
        double b = sc.nextDouble();
        System.out.print("Introduce el lado C: ");
        double c = sc.nextDouble();

        if (Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2)) {
            System.out.println("Es un triángulo rectángulo");
        } else if (a==b && a !=c) {
            System.out.println("Es un triángulo isósceles");
        } else if (a==b && a==c) {
            System.out.println("Es un triángulo equilátero");
        } else{
            System.out.println("Es un triángulo escaleno");
        }
        sc.close();
    }
}
