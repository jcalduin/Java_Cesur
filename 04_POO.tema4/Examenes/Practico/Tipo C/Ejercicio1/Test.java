package Ejercicio1;

public class Test {
    public static void main(String[] args) {
        //instancias
        EmpleadoTiempoCompleto e1 = new EmpleadoTiempoCompleto("Juan Pérez",2000);
        EmpleadoPorHora e2 =  new EmpleadoPorHora("María Gomez");
        EmpleadoFreelancer e3 = new EmpleadoFreelancer("Pedro López",4);

        //Info y comportamiento
        e1.infoEmpleado();
        e1.trabajar();
        System.out.println("Salario total: "+e1.calcularSalario());

        e2.infoEmpleado();
        e2.trabajar();
        System.out.println("Salario total: "+e2.calcularSalario(35, 25.10));
        System.out.println("Salario total: "+e2.calcularSalario(20, 21.50));

        e3.infoEmpleado();
        e3.trabajar();
        System.out.println("Salario total ("+ e3.getNumeroDeProyectos()+"): \n"+e3.calcularSalario());

    }
}
