package ExB.Ej1;

public class Banco {
    private CuentaBancaria[] cuentas;

    public Banco(int capacidad) {
        cuentas = new CuentaBancaria[capacidad];
    }

    public CuentaBancaria[] getCuentas() {
        return cuentas;
    }

    public double calcularTotalCuentas() {
        double total = 0;
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta != null) {
                total += cuenta.getSaldoActual();
            }
        }
        return total;
    }
}
