import java.util.Scanner;

public class _04_EstructurasDeControlBucles {
    public static void main(String[] args) {

        // Estructuras de control


        // Bucles

        // While (mientras) ejecuta repetidamente un bloque de codigo mientras la condición sea true, si es falsa el bucle se detien

        /* sintaxis:  while (condicion) {
               bloque de codigo que sea ejecuta mientras sea true
               }
         */

        int i = 1;  // Inicio una variable 'i' con valor 1
        while (i <= 6) { // Mientras 'i' sea menor o igual a 6 **Aqui inicia el bucle while
            System.out.println(i); // Printa el valor que tenga 'i'
            i++; // Ve incrementando el valor 'i' en 1
        } //Aqui cierra el bucle, termina una vez que 'i' obtiene un valor superior a 6

        int suma = 0;
        int numero = 1;
        while (suma < 10) { // Mientras suma sea menor que 10 printa por pantalla el valor que obtenga suma
            suma += numero; // 'suma' vale 0, suma y asigna el valor de numero a 'suma' (suma=0+1 = 1; luego suma=1+2 = 3; luego suma=3+3 = 6; luego suma=6+4 = 10...
            numero++; //Ve incrementado valor de 'suma' en 1
            System.out.println("Suma: " + suma); // imprime el valor de suma
        }

        // do-while (hacer mientras) ejecuta el codigo mientras la condicion sea true, pero con la diferencia de que al menos se ejecuta una vez

        /*sintaxis:  do {
                           bloque de codigo que se ejecuta;
                     } while (expresion);
         */

        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x <= 5);
        // x = 1 haz un print por pantalla de 'x' e incrementa 'x' en 1, hacer mientras 'x' sea menos o igual que 5

        Scanner sc = new Scanner(System.in);
        int valor;
        do {
            System.out.println("Introduce un número: ");
            valor = sc.nextInt();
        } while (valor >= 0 && valor >= 11);
        System.out.println("El " + valor + " esta entre 1 y 10");
        /* Introduce un numero, HACER un request de un número ,
        MIENTRA este no este incluido entre 1 y 10
        repite el bucle, una vez se cumpla la condicion
        printa por pantalla
         */


        // for (por o para) se utiliza para repetir un bloque de código varias veces. Generalmente lo usamos cuando sabemos veces queremos que se repita

        /*sintaxis: for (inicialización; condición; incremento/ decremento) {
                        codigo a repetir
                    }
         */


        for (int y = 1;y  <=5; y++) {  //para una variable 'y=1' ; mientras y sea menor o igual 5; imprime por pantalla mientras la condición se repite; incrementa en 1 la repetición del bloque
            System.out.println("El " + y + " esta entre 1 y 5");
        }
    }
}