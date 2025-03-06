package Practica_02;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        final int tamanho = 3;
        Scanner sc = new Scanner(System.in);
        Mundo[] planetas = new Mundo[tamanho];

        for (int i = 0; i < planetas.length; i++) {
            planetas[i] = new Mundo();
        }

        for (int i = 0; i < planetas.length; i++) {
            try {
                System.out.println("Introduce el nombre del planeta " + (i + 1) + ": ");
                planetas[i].setNombre(sc.nextLine());
                System.out.println("Introduce el diametro del planeta " + (i + 1) + ": ");
                float diametro = Float.parseFloat(sc.nextLine());
                if (diametro <= 0) {
                    throw new ValorNegativoException(planetas[i].getNombre());
                } else {
                    planetas[i].setDiametro(diametro);
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe introducir un número válido");
                i--;
            } catch (ValorNegativoException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
        int i = 0;
        boolean encontrado = false;

        while (i < planetas.length && !encontrado) {

            try{
                if (planetas[i].getDiametro() < 20)
                    throw new DiametroInferiorException(planetas[i].getNombre());
                if (planetas[i].getDiametro() > 100)
                    throw new DiametroSuperiorException(planetas[i].getNombre());
            }catch (DiametroInferiorException e) {
                System.out.println(e.getMessage());
            }catch (DiametroSuperiorException e) {
                System.out.println(e.getMessage());
                encontrado = true;
            } finally {
                i++;
            }
        }
    }
}
