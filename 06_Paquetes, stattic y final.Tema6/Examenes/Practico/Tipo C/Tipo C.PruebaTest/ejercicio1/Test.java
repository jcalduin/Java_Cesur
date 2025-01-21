package ejercicio1;

public class Test {
    public static void main(String[] args) {
        Banco banco = new Banco(3);

        banco.agregarCuenta(new CuentaBancaria("Juan Pérez", 5000.0, TipoCuenta.AHORRO));
        banco.agregarCuenta(new CuentaBancaria("Ana López", 3000.0, TipoCuenta.CORRIENTE));
        banco.agregarCuenta(new CuentaBancaria("Carlos García", 10000.0, TipoCuenta.EMPRESARIAL));

        banco.mostrarCuentas();
    }
}

