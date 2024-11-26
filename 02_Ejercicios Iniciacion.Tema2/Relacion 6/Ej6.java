public class Ej6 {
    public static void main(String[] args) {
        /*
        Implementar un programa en java que proporcione la siguiente salida:
        1,
        2,2,
        3,3,3,
        4,4,4,4,
        ....
        9,9,9,9,9,9,9,,9,9,
         */

        for (int fila = 1; fila <= 9 ; fila++) {
            for (int i = 1; i <=fila ; i++) {
                System.out.print(fila+",");
            }
            System.out.println();
        }
    }
}
