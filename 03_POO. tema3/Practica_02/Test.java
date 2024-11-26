package Practica_02;

public class Test {
    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria("ES800-4540-6056-6478-0287");

        c1.depositar(1000.50);
        c1.mostrarSaldo();
        c1.retirar(200.25);
        c1.mostrarSaldo();
        c1.retirar(920);
        c1.depositar(250);
        c1.retirar(920);
        c1.mostrarSaldo();
    }
}