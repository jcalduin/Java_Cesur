public class Ej4 {
    public static void main(String[] args) {

        //Calcular e imprimir la suma de 50+48+46+44+...+20.

        int suma = 0;

        for (int i = 50; i >=20; i-=2){
            suma += i;
        }
        System.out.println(suma);
    }
}
