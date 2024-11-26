package Practica_03;

public class TestHerencia {
    public static void main(String[] args) {

        Producto p1 = new Producto("24/05/2024","df53");
        Productos_frescos pf = new Productos_frescos("17/02/2025","rh89","19/11/2024","Guatemala");
        Producto_Refrigerado pr = new Producto_Refrigerado("20/11/2024","pt123","54684641L546R");
        Producto_Congelado pc = new Producto_Congelado("14/12/2026","vt89744",-24);

        System.out.println(p1.toString());
        System.out.println(pf.toString());
        System.out.println(pr.toString());
        System.out.println(pc.toString());
    }
}
