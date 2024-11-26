package Practica_02;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Persona propietario;

    public Cuenta(String numeroCuenta, double saldo, Persona propietario) {
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
        this.propietario = propietario;
    }

    public Cuenta(){}

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
        if (saldo < 0){
            this.saldo = 1;
        }else {
            this.saldo = saldo;
        }
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario +
                '}';
    }

    public void transaccion(double cantidad,String tipoTransaccion){
        if (tipoTransaccion.equalsIgnoreCase("reintegro")){
            if (cantidad > saldo){
                System.out.println("Saldo Insuficiente");
            } else {
                saldo -= cantidad;
                System.out.println("Transaccion: "+tipoTransaccion+" - saldo: "+saldo);
            }
        }else if(tipoTransaccion.equalsIgnoreCase("ingreso")){
            saldo += cantidad;
            System.out.println("Transaccion: "+tipoTransaccion+" - saldo: "+saldo);
        } else {
            System.out.println("Tipo de transaccion invalida");
        }
    }
}
