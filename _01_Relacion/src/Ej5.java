public class Ej5 {
    public static void main(String[] args) {
        /*
        Escribe un programa en java tal que muestre y cuente los números que
        son multiplos de 2 o 3 que hay entre 1 y 100
         */

        int contador = 0;

        for (int x = 1; x <=100; x++){
            if (x % 2 == 0 || x % 3 == 0){
                System.out.println(x);
                contador++;
            }
        }
        System.out.println("Total de números que son múltiplos de 2 o 3: " + contador);
    }
}
