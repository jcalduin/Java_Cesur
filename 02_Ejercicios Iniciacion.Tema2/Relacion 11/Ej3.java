import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        Escribe un programa Java que convierta un número de segundos escrito
        por el usuario a su equivalente en horas, minutos y segundos.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Diga el número de segundos?: ");
        int num = sc.nextInt();

        int horas = num /3600;
        int minutos = (num%3600)/60;
        int segundos = (num%3600)%60;
        System.out.printf("Equivale a %d horas %d minutos y %d segundos",horas,minutos,segundos);

        sc.close();
    }
}
