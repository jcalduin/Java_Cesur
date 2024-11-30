package Ejercicio1;

public class EmpleadoPorHora extends Empleado{

    public EmpleadoPorHora(String nombre) {
        super(nombre, 0);
    }

    @Override
    public double calcularSalario() {
       return 0;
    }

    public double calcularSalario (int horasTrabajadas, double tarifaPorHora) {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public void trabajar() {
        System.out.println("El empleado por horas está trabajando según las horas asignadas");
    }
}
