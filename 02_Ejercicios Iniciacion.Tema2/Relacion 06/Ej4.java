public class Ej4 {
    public static void main(String[] args) {
        /*
        Implementar un programa que haga un pirámide desde 0 - 9
        0,
        0,1,
        0,1,2,
        ...
        0,1,2,3,4,5,6,7,8,9
         */

        for (int i = 0; i <=9 ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(j+",");
            }
            System.out.println();
        }
    }
}
