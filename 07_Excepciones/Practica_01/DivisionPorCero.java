package Practica_01;

public class DivisionPorCero {
    public double division(double a, double b) {
        double result = 0;

        try {
            if (b == 0)
                throw new ExcepcionDeDivisionPorCero(b);
            else
                result = a / b;
        } catch (ExcepcionDeDivisionPorCero e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally hecho");
        }
        System.out.println("Volviendo de división");
        return result;
    }
}
