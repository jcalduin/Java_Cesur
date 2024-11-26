import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        int n;

        do {
            do {
                System.out.println("1º calcular el cuadrado de un número");
                System.out.println("2º calcular el cubo de un número");
                System.out.println("3º salir");
                n = sc.nextInt();

            } while (n<1 ||n>3);

            switch (n){
                case 1 ->{
                    System.out.println("introduce un número");
                    int numero = sc.nextInt();

                    System.out.println("El cuadrado es: "+Math.pow(numero,2));
                }
                case 2 ->{
                    System.out.println("introduce un número");
                    int numero = sc.nextInt();

                    System.out.println("El cuadrado es: "+Math.pow(numero,3));
                }
                case 3 -> flag = false;
            }
        } while (flag);
    }
}
