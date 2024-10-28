import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
        Crea una aplicación que nos pida un dia de la semana y que nos diga si
        es un dia laborable o no. Usa un "segun" para ello.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Que dia de la semana es? ");
        String dia = sc.next();

        switch (dia.toLowerCase()) {
            case "lunes", "martes","miercoles","jueves","viernes" -> System.out.println("Es laborable");
            case "sabado", "domingo" -> System.out.println("No es laborable");
            default -> System.out.println("No es un dia válido");
        }

        sc.close();

    }
}
