public class Ej1 {
    public static void main(String[] args) {
        /*
        Escribe un programa que convierta grados Fahrenheit a Celsius y
        muestre los resultados desde 0°F hasta 100°F en incrementos de 5. Para
        realizar esta conversión la fórmula es:
                        ºF = (°C * 9 / 5) + 32
         */
        double celsius;

        for (int f = 0; f <= 100; f+=5) {
            celsius = (double)(f-32)*5/9;
            System.out.printf(f+"ºF -> %.2fºC\n",celsius);
        }
    }
}
