import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        Escribir el programa Java para el popular juego de “Piedra, papel o
        tijera”. El objetivo es vencer al oponente seleccionando el arma que
        gana, según las siguientes reglas:
        • La piedra aplasta la tijera. (Gana la piedra.)
        • La tijera corta el papel. (Gana la tijera.)
        • El papel envuelve la piedra. (Gana el papel.)
         */


        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int pc;
        int jugador;
        int contadorJ=0;
        int contadorPC=0;

        do{
            System.out.println("Elige tu arma: ");
            System.out.print("0.-Piedra\n1.-Papel\n2.-Tijeras\n> ");
            jugador = sc.nextInt();
            pc = r.nextInt(3);
            System.out.println("Arma jugador:"+jugador+" -- arma pc :"+pc);
            if ((jugador==0 && pc==2) || (jugador==1 && pc==0) || (jugador==2 && pc==1)){
                if (jugador == 0) {
                    System.out.println("Jugador gana. Piedra aplasta a Tijeras.");
                } else if (jugador == 1) {
                    System.out.println("Jugador gana. Papel envuelve a Piedra.");
                } else {
                    System.out.println("Jugador gana. Tijeras cortan a Papel.");
                }
                contadorJ++;
            } else if ((jugador==0 && pc==1) || (jugador==1 && pc==2) || (jugador==2 && pc==0)){
                if (pc == 0) {
                    System.out.println("PC gana. Piedra aplasta a Tijeras.");
                } else if (pc == 1) {
                    System.out.println("PC gana. Papel envuelve a Piedra.");
                } else {
                    System.out.println("PC gana. Tijeras cortan a Papel.");
                }
                contadorPC++;
            } else {
                System.out.println("Empate!!");
            }
            System.out.println();
            System.out.println("Marcador\n============");
            System.out.println("jugador: "+contadorJ+" -- pc: "+contadorPC);
            System.out.println();
        } while (contadorJ < 3 && contadorPC < 3);

        if (contadorJ==3){
            System.out.println("Enhorabuena has ganado");
        } else {
            System.out.println("Has perdido, vuelve a intentarlo");
        }
    }
}
