package Ej1;

public class Empresa {
    private Empleado[] empleados;

    public Empresa(int capacidad) {
        empleados = new Empleado[capacidad];
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(int numEmpleado ,Empleado empleado) {
        boolean encontrado = false;
        int indice = 0;
        do {
            if (this.empleados[indice] == null) {
                this.empleados[indice] = empleado;
                encontrado = true;
            } else {
                indice++;
            }
        }while (!encontrado && indice < empleados.length);

        if (!encontrado) {
            System.out.println("No se puede agregar al empleado");
        }
    }

    public void mostrarSalarios() {
        for (Empleado e : empleados)
            if (e != null)
                System.out.println(e.getNombre()+": "+e.calcularSalarioTotal());
    }

    public double calcularSalarioTotal() {
        double totalSalarios =0;
        for (Empleado e : empleados) {
            if (e != null)
                totalSalarios += e.calcularSalarioTotal();
        }
        return totalSalarios;
    }
}
