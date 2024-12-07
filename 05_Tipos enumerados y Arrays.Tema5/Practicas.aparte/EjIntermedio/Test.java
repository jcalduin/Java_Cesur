package EjIntermedio;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un mes: ");
        String mesIngresado = sc.nextLine().toUpperCase();

        Mes mesSeleccionado = obtenerMes(mesIngresado);

        if (mesSeleccionado != null) {
            System.out.println(mesSeleccionado+ " tiene "+mesSeleccionado.getDias()+" dias");
        } else {
            System.out.println("El valor dado no corresponde a ningún mes");
        }
    }

    private static Mes obtenerMes(String nombreMes) {
        for(Mes mes : Mes.values()) {
            if (mes.name().equalsIgnoreCase(nombreMes)) {
                return mes;
            }
        }
        return null;
    }
}
