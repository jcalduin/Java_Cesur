package Practica_04;

public class MyOwnAutoShop {
    public static void main(String[] args) {

        Truck t1 = new Truck(120,20000,"rojo", 1500);
        Ford f1 = new Ford(150,25500,"Negro-mate",2018,3650);
        Sedan s1 = new Sedan(140,18550,"negro y plata",21);

        System.out.println("El precio venta  car Truck: "+t1.getSalePrice());
        System.out.println("El precio venta  car Ford: "+f1.getSalePrice());
        System.out.println("El precio venta car Sedan: "+s1.getSalePrice());
    }
}
