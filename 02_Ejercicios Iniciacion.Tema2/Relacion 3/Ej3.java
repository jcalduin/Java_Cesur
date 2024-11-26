import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        /*
        Realizar un programa para introducir el nombre y el suledo base de un
        empleado. Calcular el sueldo liquido mostrando el resultado con el
        mensaje correspondiente. Considerar el sueldo liquido como el 80%
        del suledo base
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Sueldo base del empleado: ");
        double sueldoBase = sc.nextDouble();

        double salario = sueldoBase * 0.80;

        System.out.println(nombre +" recibira un salario líquido de: "+salario);
    }
}
