package Ej1;

public class Empleado {
    private String nombre;
    private Rol rol;
    private double salarioBase;
    private static final double bonoBase=500;

    public Empleado(String nombre, Rol rol, double salarioBase) {
        this.nombre = nombre;
        this.rol = rol;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public static double getBonoBase() {
        return bonoBase;
    }

    public double calcularSalarioTotal() {
        double salarioTotal=0;
        if (this.rol == Rol.ADMIN)
            salarioTotal = getBonoBase() + 1000 + salarioBase;
        else if (this.rol == Rol.GERENTE)
            salarioTotal = getBonoBase() + 500 + salarioBase;
        else
            salarioTotal += getBonoBase() + salarioBase;
        return salarioTotal;
    }
}
