package Practica_02;
/*
Crea una clase CuentaBancaria con los atributos:
• numeroCuenta (tipo String)
• saldo (tipo double, inicializado en 0)
Crea métodos:
• depositar(double cantidad): aumenta el saldo.
• retirar(double cantidad): reduce el saldo si hay suficiente dinero.
• mostrarSaldo(): muestra el saldo actual.
Crea una cuenta en el main(), realiza depósitos y retiros, y muestra el saldo.
 */

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double cantidad){
        if(cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Depositados: " + cantidad);
        } else {
            System.out.println("Cantidad de depósito no válida");
        }
    }
    public void retirar(double cantidad){
        if(cantidad > 0 && saldo >= cantidad){
            this.saldo -= cantidad;
            System.out.println("Retirados: " + cantidad);
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
    public void mostrarSaldo(){
        System.out.println("Saldo actual: "+saldo);
    }
}
