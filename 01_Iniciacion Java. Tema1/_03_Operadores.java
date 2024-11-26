import java.util.Scanner;

public class _03_Operadores {
    public static void main(String[] args) {


        // Operadores
        // ***Declaro estas variables para usarlas como ejemplo***

        int a = 10;
        int b = 5;
        int c = 2;
        int d = 7;
        int e = 8;


        // Operadores aritméticos
        // ***Hago print en todos para comprobar y mostrar los resultados por pantalla***

        System.out.println(a + b); //Suma
        System.out.println(a - b); //Resta
        System.out.println(a * c); //Multiplicación
        System.out.println(a / c); //Division
        System.out.println(b % c); //Resto


        // Operadores aritméticos unarios

        System.out.println(+5); // cambia el valor a int (en este caso era valor int, se mantiene como int)
        System.out.println(-a); // cambio el signo (en este caso a pasa a vlor negativo)
        d = ++e; // incrementa el valor de 'e' y se lo asigna a 'd' ('d' vale 7 pero toma el valor de incremento de 'e' que de 8 pasa a 9)
        System.out.println("d vale "+d+" e vale "+e);
        d = e++; // incrementa el valor 'e' y 'd' permanece igual ('d' vale 9 (valor tomado anteriormente) y 'e' incrementa su valor de 9 a 10)
        System.out.println("d vale "+d+" e vale "+e);
        e = --d; // decrementa el valor de 'd' y se lo asigna a 'e' ('e' vale 10 pero toma el valor de decremento de 'd' que de 9 pasa 8)
        System.out.println("d vale "+d+" e vale "+e);
        e = d--; // decrementa el valor 'd' y 'e' permanece igual ('e' vale 8 (valor tomado anteriormente) y 'd' decerementa su valor de 8 a 7)
        System.out.println("d vale "+d+" e vale "+e);


        // Operadores relacionales (los compara entre si) el resultado del print siempre sera true or false

        System.out.println(a > b); // mayor que (da true 10 > 5)
        System.out.println(c < b); // menor que (da true 2 < 5)
        System.out.println(d == e); // igual que (da false 7 == 8)
        System.out.println(c != b); // distinto que (da true 2 distinto de 5)
        System.out.println(b >= c); // mayor o igual que (da true 5>= 2)
        System.out.println(c <= d); //menor o igual que (da true 2 <= 7)


        // Operadores condicionales (arrojan true or false)

        // AND && (solo si ambas condiones son true print true)

        System.out.println(10 > 5 && 2 <= 7); //ambas son true, printa true
        System.out.println(7 <= 10 && 5 <= 2); // una es tue otra false, printa false

        // OR || (si una es condicion es true printa true)

        System.out.println(8 == 7 || 10 != 5); //una es false y otra true, printa true
        System.out.println(5 <= 2 || 8 > 10); // ambas son false, printa false

        // NOT ! (niega)

        System.out.println(!(8 > 5)); // 8 > 5 es true pero como niega arroja false


        // Operadores lógicos (a nivel bit)

        //& : and

        System.out.println(0 & 0);
        System.out.println(0 & 1);
        System.out.println(1 & 0);
        System.out.println(1 & 1);

        // | : or

        System.out.println(0 | 0);
        System.out.println(0 | 1);
        System.out.println(1 | 0);
        System.out.println(1 | 1);

        // ^ : xor

        System.out.println(0 ^ 0);
        System.out.println(0 ^ 1);
        System.out.println(1 ^ 0);
        System.out.println(1 ^ 1);


        // Operadores de asignación

        int x = 9;
        System.out.println(x += 2); //suma y asigna
        System.out.println(x -= 2); //resta y asigna
        System.out.println(x *= 2); //multiplica y asigna
        System.out.println(x /= 2); // divide y asigna
        System.out.println(x %= 2); // resto y asigna


        // Operadores ternarios

        // Elvis ?:

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que temperatura hace?");
        int temperatura = sc.nextInt();
        String resultado = (temperatura >= 27 ? "Hace flama" : "Se esta bomba");
        System.out.println(resultado);

        sc.close();

        /*  Pido al usuario que ingrese un temperatura y con el operador elvis indico la condicion:
            si la temperatura es mayor o igual que 27 indico que hace flama
            si es menor indico que se esta bomba
            printo el resultado por pantalla
         */
    }
}
