import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        Viaje de estudios. Realizar un programa que calcula la cantidad total y precio
        por alumno que se debe para la excursion
        <100 65€ ; >=99 y <=50 70€ ; >=49 y <=30 95€ ; >30 total 3000€
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos alumnos van? ");
        int alumno = sc.nextInt();

        if (alumno>=100){
            System.out.println("La excursión cuesta "+alumno*65+"€ y cada alumno pagará 65€");
        }else if (alumno>=50){
            System.out.println("La excursión cuesta "+alumno*70+"€ y cada alumno pagará 70€");
        }else if (alumno>=30) {
            System.out.println("La excursión cuesta "+alumno*95+"€ y cada alumno pagará 95€");
        } else {
            System.out.printf("La excursión cuesta 3000€ y cada alumno pagará: %.2f%n",3000.0/alumno);
        }
        sc.close();
    }
}
