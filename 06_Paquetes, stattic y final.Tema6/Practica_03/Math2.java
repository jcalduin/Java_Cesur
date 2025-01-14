package Practica_03;
/*Se utliliza una clase final a demas de porque lo dice el ejercicio porque hacemos que la clase en este caso "Math2" no tenga herencia
* ya que el proposito de cuando creamos una clase final es el de que sea utlizada para realizar calculos matematicos.
* En esta practica estamos trtando de imitar el metodo Math."lo que sea" en java para poder exportar este paquete cuando lo necesitemos
* y usarlo como calculos estáticos constantes. La peculiaridad de la clase final es que no necesita crear instancias de objetos
* para llamar a sus metodos. Ver en la clase main que la llamada a sus metodos se produce desde la clase y no desde una instancia de esta clase*/

public final class  Math2 {
    /*La clase Math no tiene atributos ya que al contener todos sus metodos static significa que no necesita tmpoco instancias
    * de la clase para ser llamados, en este caso los calculos que hemos programado solo dependen de unos paramateros
    *  que se pasan al metodo*/
    public static double max(double[] numeros) {
        double max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }

    public static double min(double[] numeros) {
        double min = numeros[0];
        for (int i = 1; i < numeros.length ; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return min;
    }

    public static double sum(double[] numeros) {
        double sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i];
        }
        return sum;
    }

    public static double mediaAritmetica(double[] numeros) {
        return sum(numeros) / numeros.length;
    }

    public static double mediaGeometrica(double[] numeros) {
        double resultado = 1;
        for (int i = 0; i < numeros.length; i++) {
            resultado *= numeros[i];
        }
        return Math.pow(resultado,1.0/ numeros.length);
    }
}
