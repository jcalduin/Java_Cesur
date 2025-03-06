package Practica_04;

public class Empleado {
    private String nombre;
    private double salarioBase;
    private double bonificacion;

    public Empleado(String nombre, double salarioBase) throws SalarioInvalidoException{
        if (salarioBase <= 0){
            throw new SalarioInvalidoException("El salario debe ser mayor que 0");
        }
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.bonificacion = 0;
    }

    public void asignarBonificacion(double bonificacion) throws BonificacionInvalidaException{
        if (bonificacion < 0 || bonificacion > salarioBase*0.5){
            throw new BonificacionInvalidaException("La bonificación no puede superar el 50% de "+salarioBase+"€");
        }
        this.bonificacion = bonificacion;
    }

    public double calcularSalarioTotal(){
        return salarioBase + bonificacion;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.printf("Salario Base: %.2f€%n",salarioBase);
        System.out.printf("Bonificacion: %.2f€%n",bonificacion);
        System.out.printf("Salario total: %.2f€%n" ,calcularSalarioTotal());
        System.out.println();
    }

}
