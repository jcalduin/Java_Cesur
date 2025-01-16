package ExB.Ej1;

public class Test {
    public static void main(String[] args) {

        Banco miBanco = new Banco(3);

        CuentaBancaria c1 = new CuentaBancaria("Juan Perez", 5000.00, "ahorro");
        CuentaBancaria c2 = new CuentaBancaria("Ana López", 3000.00, "corriente");
        CuentaBancaria c3 = new CuentaBancaria("Carlos García", 10000.00, "empresarial");

        //Resultado
        System.out.printf("\n%s - %.2f€ - Intereses: %.2f€\n", c1.getTitular(), c1.getSaldoActual(), c1.calcularIntereses());
        System.out.printf("%s - %.2f€ - Intereses: %.2f€\n", c2.getTitular(), c2.getSaldoActual(), c2.calcularIntereses());
        System.out.printf("%s - %.2f€ - Intereses: %.2f€\n", c3.getTitular(), c3.getSaldoActual(), c3.calcularIntereses());

        miBanco.getCuentas()[0] = c1;
        miBanco.getCuentas()[1] = c2;
        miBanco.getCuentas()[2] = c3;

        System.out.printf("Total de dinero en el banco: %.2f€\n", miBanco.calcularTotalCuentas());
    }
}
