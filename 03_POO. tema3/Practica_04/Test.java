package Practica_04;

public class Test {
    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo(5.5,10);
        Rectangulo r2 = new Rectangulo(8,4.2);



        System.out.printf("El area del rectángulo 1 es: %.2f y su perímetro es: %.2f \n",r1.calcularArea(),r1.calcularPerimetro());
        System.out.printf("El area del rectángulo 2 es: %.2f y su perímetro es: %.2f",r2.calcularArea(),r2.calcularPerimetro());

    }
}
