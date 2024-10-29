import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*
        Los empleados de una fábrica trabajan en dos turnos, Diurno y Nocturno.
        Se desea calcular el jornal diario de acuerdo con las siguientes reglas:
        - La tarifa de las horas diurnas es de 10 €
        - La tarifa de las horas nocturnas es de 13,5 €
        - En caso de ser festivo, la tarifa se incrementa en un 10% en caso de
        turno diurno y en un 15% para el nocturno.
        Escribe el programa para obtener los datos de un trabajador como el
        número de horas, el turno y el tipo de día (“Festivo”, “Laborable”) y nos
        devuelva el sueldo a cobrar.
         */
        Scanner sc = new Scanner(System.in);
        double horas;
        String turno;
        char festivo;
        double jornal;

        do{
            System.out.print("¿Cuántas horas ha trabajado?: ");
            horas = sc.nextDouble();
        }while (horas <1 || horas >24);

        System.out.print("¿Qué turno ha trabajado?: ");
        turno = sc.next().toLowerCase();
        System.out.print("¿Es festivo?: (s/n) ");
        festivo = sc.next().toLowerCase().charAt(0);

        if (turno.equals("diurno")){
            jornal = horas*10;
        } else {
            jornal = horas*13.5;
        }
        if (festivo == 's'){
            jornal*=1.10;
        } else {
            jornal*=1.15;
        }

        System.out.printf("El jornal diario es: %.2f€", jornal);
    }
}
