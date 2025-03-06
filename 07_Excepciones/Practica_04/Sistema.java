package Practica_04;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while(!salir) {
            try{
                System.out.print("Introduzca el nombre del empleado (o 'FIN' para salir): ");
                String nombre = sc.nextLine();

                if(nombre.equalsIgnoreCase("FIN")) {
                    System.out.println("Finalizando la entrada de empleados");
                    salir = true;
                } else {
                    System.out.print("Introduzca el salario Base: ");
                    double salarioBase =  Double.parseDouble(sc.nextLine());

                    Empleado empleado = new Empleado(nombre,salarioBase);

                    System.out.print("Introduzca la bonificacion: ");
                    double bonificacion =  Double.parseDouble(sc.nextLine());
                    empleado.asignarBonificacion(bonificacion);
                    empleado.mostrarInformacion();
                }
            }catch (SalarioInvalidoException | BonificacionInvalidaException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Introduzca los datos de nuevo");
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduzca un numero válido");
                System.out.println("Introduzca los datos de nuevo");
            }
        }

        sc.close();
    }
}
