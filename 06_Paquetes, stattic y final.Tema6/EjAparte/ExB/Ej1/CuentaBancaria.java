package ExB.Ej1;

import java.util.Scanner;

public class CuentaBancaria {
    private final String titular;
    private final double saldoInicial;
    private double saldoActual;
    private TipoCuenta tipoCuenta;

    public CuentaBancaria(String titular, double saldo, String tipoCuenta) {
        this.titular = titular;
        this.saldoInicial = saldo;
        this.saldoActual = saldoInicial;
        comprobarTipoCuenta(tipoCuenta);
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public final void comprobarTipoCuenta(String tipoCuenta) {
        switch (tipoCuenta.toLowerCase()) {
            case "ahorro" -> this.tipoCuenta = TipoCuenta.AHORRO;
            case "empresarial" -> this.tipoCuenta = TipoCuenta.EMPRESARIAL;
            default -> this.tipoCuenta = TipoCuenta.CORRIENTE;
        }
    }

    public void realizarTransaccion() {

        Scanner sc = new Scanner(System.in);
        System.out.print("1.Depositar\n2.Retirar\n¿Que tipo de transacción desea realizar?: ");
        int transaccion = sc.nextInt();

        switch (transaccion) {
            case 1 -> {
                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();
                saldoActual += cantidad;
                System.out.println("Ingreso realizado correctamente");
            }
            case 2 -> {
                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();
                if (cantidad < saldoActual) {
                    saldoActual -= cantidad;
                    System.out.println("Se ha retirado el dinero correctamente");
                } else
                    System.out.println("La cantidad a retirar supera el saldo actual de su cuenta");
            }
        }
    }

    public final double calcularIntereses() {
        double intereses = getTipoCuenta().getIntereses();
        intereses/=100;
        intereses *= saldoActual;
        return intereses;
    }

}
