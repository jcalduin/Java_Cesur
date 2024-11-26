public class Ej3 {
    public static void main(String[] args) {
        /*
        Calcular la suma de todos los números n entre 20 y 3500 que cumplan
        la siguiente condicioón:
        n*(n+1)/2 = multiplo de 7
        Ademas, contar cuantos números cumplen la condición
         */


        int contador = 0;
        int suma = 0;

        for (int n = 20; n <= 3500; n++){
            if ((n* (n+1)/2) % 7 == 0){
                suma += n;
                contador++;
            }
        }
        System.out.println(contador);
        System.out.println(suma);

    }
}
