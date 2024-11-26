public class Ej5 {
    public static void main(String[] args) {
        /*
        implementar un programa que proporcione la siguiente salida:
        0,1,2,3,4,5,6,7,8,9,
        1,2,3,4,5,6,7,8,9,
        ...
        9,
         */

        for (int fila = 0; fila <=9 ; fila++) {
            for (int j = fila  ; j <= 9  ; j++) {
                System.out.print(j+",");
            }
            System.out.println();
        }
    }
}
