import java.util.Scanner;

public class _05_EstructurasDeControlCondicionales {
    public static void main(String[] args) {

        //Estructuras de control


        //Condicionales/bifurcaciones

        //if (si) el codigo se ejecuta si la condición es verdadera

        /*Sintaxis: if(condición) {
                        codigo a ejecutar si la condicón es true
                    }
         */

        int n = 5;  //Declaro una variable n = 5
        if (n > 0) {  //si n es mayor que cero
            System.out.println("El número es positivo"); //Imprime por pantalla si la condición es true
        }

        // else (si no) se usa junto con if para ejecutar un codigo cuando la condición del if es falsa

        /*Sintaxis: if(condición) {
                        codigo si la condición es verdera
                    } else {
                        codigo si la condición es falsa
                    }
         */

        int num = 10;
        if (num > 10) {
            System.out.println("El número es mayor que 10");
        } else {
            System.out.println("El número no es mayor que 10");
        }

        int num2 = 105;
        if (num2 % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        // else if (si no, si) se usa cuando hay multiples condiciones para verificar, se utiliza si la condición if el falsa y la condición del else if es verdera

        /*Sintaxis: if (condicion1) {
                        codigo si condicion1 es verdadera
                    } else if (condicion2) {
                        codigo sin condición2 es verdadera
                    } else {
                        codigo si ninguna condicion es verdadera
                    }
        */

        int edad = 16;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else if (edad >=13) {
            System.out.println("Eres un adolescente");
        } else {
            System.out.println("Eres un crío");
        }

        // Switch-case se usa para seleccionar una opción de entre multiples casos, es útil cuadno se comparan valores específicos en lugar de conciones complejas

        /*Sintaxis: switch (variable) {
                        case valor1 ->
                            // codigo si variable es igual a valor1
                        case valor2 ->
                            // codigo si variable es igual a valor 2
                        case valor3 ->
                            // codigo si variable es igual a valor 3
                        default ->
                            // codigo si ningun caso coincide
                    }
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de un mes: ");
        int mes = sc.nextInt();
        sc.close();
        switch (mes) {
            case 1, 2, 3 -> System.out.println("Estamos en invierno");
            case 4, 5, 6 -> System.out.println("Estamos en primavera");
            case 7, 8, 9 -> System.out.println("Estamos en verano");
            case 10, 11, 12 -> System.out.println("Estamos en otoño");
            default -> System.out.println("El número no pertenece a un mes válido");
        }
    }
}
