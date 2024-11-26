import java.util.Scanner;

public class _00_HelloWorld {
    public static void main(String[] args) {

        // Esto es un comentario en una linea se utiliza (//)

        /* Esto es un comentario
        en varias lineas, abre con /*)
        y cierra con */

        //impresion por pantalla "System.out.println("")

        System.out.println("Hola, chavales !");
        System.out.println("10"); //
        System.out.println(10); //

        // comando de acceso rapido "sout"

        //aquí el print no lleva ln, significa que no tiene salto de linea

        int operacion1 = 10 / 2;
        String texto = "lobitos tiene la loba";
        System.out.print(operacion1);
        System.out.println(texto);

        //para pedir datos por pantalla

        Scanner sc = new Scanner(System.in); //creo el objeto scanner y lo llamo 'sc'
        System.out.println("Pon tu nombre: "); //imprimo un texto en pantalla que indique a la persona que introduzca su nombre
        String nombre = sc.nextLine(); // leo el texto indicado por el usuario y la declaro en una variable 'nombre' tipo string
        System.out.println("¿Qué tal " + nombre + " ?"); //hago print de un texto con la variable 'nombre' que declaramos anteriormente

        sc.close();  //cierro el objeto scanner
    }
}
