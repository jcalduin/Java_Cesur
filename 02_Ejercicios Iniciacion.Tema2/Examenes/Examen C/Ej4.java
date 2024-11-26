public class Ej4 {
    public static void main(String[] args) {
        /*
        Escribe un programa que encuentre todos los pares de números primos
        gemelos menores a 100. Dos números primos son gemelos si la diferencia entre ellos
        es 2 (por ejemplo, 3 y 5).
        Resultado:
                (3, 5)
                (5, 7)
                (11, 13)
                (17, 19)
                (29, 31)
                (41, 43)
                (59, 61)
                (71, 73)
         */
        int ultimoPrimo = 0;

        for (int n = 2; n < 100; n++) {
            boolean esPrimo = true;


            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                 if (ultimoPrimo != 0 && n-ultimoPrimo ==2){
                     System.out.printf("(%d,%d)\n", ultimoPrimo, n);
                 }
                 ultimoPrimo = n;
            }
        }
    }
}
