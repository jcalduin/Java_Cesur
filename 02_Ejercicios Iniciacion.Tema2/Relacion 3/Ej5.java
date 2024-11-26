import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        // obtener el promedio de calificaciones de un grupo de n alumnos

        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos alumnos hay: ");
        int alumnos = sc.nextInt();
        double media = 0;

        for (int i =1; i <= alumnos; i++){
            System.out.println("Nota del alumno "+i+ ":");
            double nota = sc.nextDouble();
            media += nota;
        }
        System.out.println("La media es: " + media/alumnos);



    }
}
