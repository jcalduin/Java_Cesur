import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        /*
        Realizar un programa que al introducir una cantidad de dinero
        expresado en euros nos indique cuántos billetes y monedas se puede
        tener como mínimo. Los billetes que tenemos son de 500€,200€,100€,
        50€,20€,10€,5€ y monedas 1€ y 2€. No contemplamos céntimos
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuánto dinero tienes? ");
        int dinero = sc.nextInt();

        int b500=0;
        while (dinero>=500){
            dinero-=500;
            b500++;
        }
        if (b500>0)
            System.out.println("Billetes de 500€: " + b500);

        int b200=0;
        while (dinero>=200){
            dinero-=200;
            b200++;
        }
        if (b200>0)
            System.out.println("Billetes de 200€: " + b200);

        int b100=0;
        while (dinero>=100){
            dinero-=100;
            b100++;
        }
        if (b100>0)
            System.out.println("Billetes de 100€: " + b100);

        int b50=0;
        while (dinero>=50){
            dinero-=50;
            b50++;
        }
        if (b50>0)
            System.out.println("Billetes de 50€: " + b50);

        int b20=0;
        while (dinero>=20){
            dinero-=20;
            b20++;
        }
        if (b20>0)
            System.out.println("Billetes de 20€: " + b20);

        int b10=0;
        while (dinero>=10){
            dinero-=10;
            b10++;
        }
        if (b10>0)
            System.out.println("Billetes de 10€: " + b10);

        int b5=0;
        while (dinero>=5){
            dinero-=5;
            b5++;
        }
        if (b5>0)
            System.out.println("Billetes de 5€: " + b5);

        int b2=0;
        while (dinero>=2){
            dinero-=2;
            b2++;
        }
        if (b2>0)
            System.out.println("Monedas de 2€: " + b2);

        int b1=0;
        while (dinero==1){
            dinero-=1;
            b1++;
        }
        if (b1>0)
            System.out.println("Monedas de 1€: " + b1);
    }
}
