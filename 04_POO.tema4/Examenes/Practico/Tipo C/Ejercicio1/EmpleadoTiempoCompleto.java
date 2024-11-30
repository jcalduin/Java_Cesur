package Ejercicio1;

public class EmpleadoTiempoCompleto extends Empleado{

    public EmpleadoTiempoCompleto(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + 500;
    }

    @Override
    public void trabajar() {
        System.out.println("El empleado de tiempo completo está trabajando en un horario regular");
    }
}
