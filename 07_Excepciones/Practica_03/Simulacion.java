package Practica_03;

import java.util.Random;

public class Simulacion {
    public static void main(String[] args) {
        Random r = new Random();

        int frio = 0;
        int calor = 0;

        while (frio < 5 && calor < 15) {

            try {

                double temperatura = r.nextDouble(91);
                System.out.printf("Temperatura: %.2fºC%n", temperatura);
                Thread.sleep((int) (Math.random() * 2000));
                if (temperatura < 15)
                    throw new DemasiadoFrio("Frio");
                if (temperatura > 50)
                    throw new DemasiadoCalor("Calor");
            } catch (DemasiadoFrio f){
                System.out.println(f.getMessage());
                frio++;
            } catch (DemasiadoCalor c) {
                System.out.println(c.getMessage());
                calor++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Frio: "+frio);
        System.out.println("Calor: "+calor);
    }
}


