package Practica_06;

public class CuentaBancaria {
    private String nombre;
    private double saldo;

    public CuentaBancaria(String nombre, double saldo) throws SaldoInvalidoException{
        if (saldo < 0)
            throw new SaldoInvalidoException("La cantidad de saldo a introducir no puede ser negativo");

        this.nombre = nombre;
        this.saldo = saldo;
    }

    public void depositarDinero(double dinero) throws CantidadInvalidaException {
        if (dinero <= 0)
            throw new CantidadInvalidaException("Error en la operación. Deposita una cantidad válida");
        this.saldo += dinero;
        System.out.println("Depósito realizado. Nuevo saldo: "+saldo+"€\n");
    }

    public void retirarDinero(double dinero) throws FondoInsuficienteException,CantidadInvalidaException {
        if (dinero > saldo)
            throw new FondoInsuficienteException("Fondos insuficientes. Saldo actual: " + this.saldo+"€");
        if (dinero <= 0)
            throw new CantidadInvalidaException("La cantidad a retirar debe ser mayor a cero.");
        this.saldo -= dinero;
        System.out.printf("Retiro realizado. Nuevo saldo: %.2f€%n", saldo);
    }

    public void mostrarSaldo() {
        System.out.println("\nTitular: " + this.nombre);
        System.out.printf("Saldo: %.2f€%n",this.saldo);
        System.out.println();
    }
}
