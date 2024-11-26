package Practica_05;

public class Test {
    public static void main(String[] args) {

        Producto p1 = new Producto("coca-cola",2,15);
        Producto p2 = new Producto("pipas",0.5,5);

        p1.venderProducto(5);
        p2.venderProducto(6);
        p1.reabastecer(6);
        p2.reabastecer(5);
    }
}
