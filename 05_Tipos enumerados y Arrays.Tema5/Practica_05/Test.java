package Practica_05;

public class Test {
    public static void main(String[] args) {

        Electrodomestico e1 = new Electrodomestico();
        Electrodomestico e2 = new Electrodomestico(57.00,80.50);
        Electrodomestico e3 = new Electrodomestico(45.5,"rojo",'b',10.00);
        Lavadora l1 = new Lavadora();
        Lavadora l2 = new Lavadora(57.00,80.50);
        Lavadora l3 = new Lavadora(250,"azul",'e',60,8.20);
        Television t1 = new Television();
        Television t2 = new Television(25.00,120.50);
        Television t3 = new Television(10.30,300.00);
        Television t4 = new Television(215.00,"negro",'a',12,32,true);

        Electrodomestico cacharros [] = new Electrodomestico[10];

        cacharros[0] = e1;
        cacharros[1] = e2;
        cacharros[2] = e3;
        cacharros[3] = l1;
        cacharros[4] = l2;
        cacharros[5] = l3;
        cacharros[6] = t1;
        cacharros[7] = t2;
        cacharros[8] = t3;
        cacharros[9] = t4;

        double precioElec = 0;
        double precioLav = 0;
        double precioTele = 0;

        for (Electrodomestico e : cacharros) {
            if (e instanceof Television)
                precioTele += e.precioFinal();
            if (e instanceof Lavadora)
                precioLav += e.precioFinal();
            precioElec += e.precioFinal();
        }

        System.out.printf("Total de las lavadoras: %.2f€\n",precioLav);
        System.out.printf("Total de las televisiones: %.2f€\n",precioTele);
        System.out.printf("Total de los electrodomésticos: %.2f€",precioElec);
    }
}
