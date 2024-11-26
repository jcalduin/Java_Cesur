package Practica_02;

public class Principal {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("ES24-4000-2000-3000-8789",2500.50,new Persona("Armando","Paredes","658256721"));
        Cuenta c2 = new Cuenta("ES24 9854 6571 4532 4127",224,new Persona("Aitor","Menta","687459"));

        c1.transaccion(100,"ingreso");
        c1.transaccion(200.5,"reintegro");

        c2.transaccion(300,"reintegro");
        c2.transaccion(500,"ingreso");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
