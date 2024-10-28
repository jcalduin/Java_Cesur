import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        El consultorio del Dr. Lorenzo T. Mata Sanos tiene como política
        cobrar la consulta teniendo en cuenta el número de cita, de la siguiente
        forma:
            a. Las tres primeras citas a 150€ c/u.
            b. Las siguientes dos citas a 100€ c/u.
            c. Las tres siguientes citas a 90€ c/u.
            d. Las restantes a 50€ c/u, mientras dure el tratamiento.
            Se requiere un programa para determinar:
            a) Cuánto pagará el paciente por la cita.
            b) El total de lo que ha pagado el paciente por el tratamiento.
         */

        Scanner sc = new Scanner(System.in);
        int cita;

        do {
            System.out.print("¿Qué cita es?: ");
            cita = sc.nextInt();
        } while (cita <= 0);

        if (cita <=3) {
            System.out.println("Esta cita le costará: "+150+"€ y el total de su tratamiento es: "+cita*150+"€");
        } else if (cita <=5){
            System.out.println("Esta cita le costará: "+100+"€ y el total de su tratamiento es: "+(450+(cita-3)*100)+"€");
        } else if (cita <=8) {
            System.out.println("Esta cita le costará: " + 90 + "€ y el total de su tratamiento es: " + (650 + (cita - 5) * 90) + "€");
        } else {
            System.out.println("Esta cita le costará: " + 50 + "€ y el total de su tratamiento es: " + (920 + (cita - 8) * 50) + "€");
        }

        sc.close();
    }
}
