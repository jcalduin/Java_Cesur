package Ejercicio1;

public class Empleado {
    private String nombre;
    private  double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void trabajar() {
        System.out.println("El empleado esta trabajando");
    }

    public void infoEmpleado() {
        System.out.println("Nombre: " + nombre + " Salario: " + salarioBase);
    }
}
