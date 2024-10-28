import java.util.Random;

public class _06_Varios {
    public static void main(String[] args) {
        //Para leer primero un nº por pantalla y luego un string y que no de error:
        //o que no se salte la cadena de texto

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num = Integer.parseInt(sc.nextLine()); //integer.parseInt(sc.nextLine
        System.out.print("Otro número: ");
        double num2 = Double.parseDouble(sc.nextLine()); //Double.parseDouble(sc.nextLine
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        System.out.println(num + palabra + num2);

        sc.close();*/

        //otra manera

        /*Scanner sc2 = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num3 = sc2.nextInt();
        System.out.print("Una palabra: ");
        String palabra2 = sc2.next();

        System.out.println(num3 + palabra2 );

        sc.close();*/

        //Pasar una variable string para que todo sea minuscula, independientemente de como lo escriban por pantalla

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        System.out.println(palabra.toLowerCase());
        sc.close(); */

        //Para que toda la palabra la pase a mayusculas

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = sc.nextLine();

        System.out.println(palabra.toUpperCase());*/


        //Para que no le importe como este escrito

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        System.out.println(palabra.equalsIgnoreCase("acapulco"));*/

        //para hacer operaciones con el numero PI

        double x = Math.PI +2;
        System.out.println(x);

        //para hacer potencias

        int base = 2;
        int exponente = 3;
        System.out.println(Math.pow(base, exponente));

        //Genera un número aleatorio

        Random r = new Random();
        int numero = r.nextInt(10)+1; //Genera un número desde 1 a 10
        int numero2 = r.nextInt(10);  //Genera números de 0  10
    }
}
