package Practica_06;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuentaBancaria;
        int opcion =0;

        try {
            System.out.print("Introduzca el nombre del titular de la cuenta: ");
            String nombre = sc.nextLine();
            System.out.print("Introduzca el saldo inicial: ");
            double saldo = Double.parseDouble(sc.nextLine());

            cuentaBancaria = new CuentaBancaria(nombre, saldo);
            System.out.println("Cuenta creada exitosamente.\n");

        } catch (SaldoInvalidoException | NumberFormatException e) {
            System.out.println("Erro al crear la cuenta. "+e.getMessage());
            return;
        }

        while (opcion != 4) {

            try{
                System.out.println("Opciones: 1) Depositar 2) Retirar 3) Mostrar saldo 4) Salir");
                System.out.print("Seleccion un opción: ");
                opcion = Integer.parseInt(sc.nextLine());

                if (opcion == 4) {
                    System.out.println("Saliendo del sistema. ¡Gracias por usar nuestrp banco!");
                } else {
                    switch (opcion) {
                        case 1 -> {
                            System.out.print("Introduzca cantidad a depositar: ");
                            double cantidad = Double.parseDouble(sc.nextLine());
                            cuentaBancaria.depositarDinero(cantidad);
                        }
                        case 2 ->{
                                System.out.print("Introduzca la cantidad a retirar: ");
                                double cantidadRetirada = Double.parseDouble(sc.nextLine());
                                cuentaBancaria.retirarDinero(cantidadRetirada);
                                }
                        case 3 -> cuentaBancaria.mostrarSaldo();
                        default -> System.out.println("Opcion no valida.");
                    }
                }
            } catch (CantidadInvalidaException | FondoInsuficienteException e){
                System.out.println("Error en la operación: "+e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduzca un numero válido");
                System.out.println("Introduzca los datos de nuevo");
            }
        }
        sc.close();
    }
}
