package Practica_01;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //creando 1º persona preguntando todos los parametros y creandola con el constructor con todos los parámaetros para p1
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Sexo: ");
        char sexo = sc.nextLine().charAt(0);
        System.out.println("Peso: ");
        double peso = Double.parseDouble(sc.nextLine());
        System.out.println("Altura: ");
        double altura = Double.parseDouble(sc.nextLine());

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);

        //creando 2º persona con el constructor de 3 parámetros y modificando el valor de las variables peso y altura con los setters
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Edad: ");
        edad = Integer.parseInt(sc.nextLine());
        System.out.println("Sexo: ");
        sexo = sc.nextLine().charAt(0);

        Persona p2 = new Persona(nombre, edad, sexo);
        System.out.println("Peso: ");
        peso = Double.parseDouble(sc.nextLine());
        System.out.println("Altura: ");
        altura = Double.parseDouble(sc.nextLine());
        p2.setPeso(peso);
        p2.setAltura(altura);

        //creando 3º persona con el constructor sin parámetros, los valores de las variables vendran dados por los setters
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
        System.out.println("Edad: ");
        edad = Integer.parseInt(sc.nextLine());
        System.out.println("Sexo: ");
        sexo = sc.nextLine().charAt(0);
        System.out.println("Peso: ");
        peso = Double.parseDouble(sc.nextLine());
        System.out.println("Altura: ");
        altura = Double.parseDouble(sc.nextLine());
        sc.close(); //cierro el scanner
        Persona p3 = new Persona();
        p3.setNombre(nombre);
        p3.setEdad(edad);
        p3.setPeso(peso);
        p3.setAltura(altura);
        p3.setSexo(sexo);

        //Calculamos el IMC corporale imprimimos un mensaje para verificar si esta o on en su peso ideal. definiendo anteriormente una funcion "mensaje peso"
        mensajePeso(p1);
        mensajePeso(p2);
        mensajePeso(p3);
        //Calculamos si es mayor de edad con el metodo y comparado con un elvis
        System.out.println(p1.getNombre()+" es"+(p1.esMayorDeEdad()?" mayor de edad":"menor de edad "));
        System.out.println(p2.getNombre()+" es"+(p2.esMayorDeEdad()?" mayor de edad":"menor de edad "));
        System.out.println(p3.getNombre()+" es"+(p3.esMayorDeEdad()?" mayor de edad":"menor de edad "));
        //Sacamos por pantalla todos los datos de cada persona
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    //función que definimos para ahorrarnos escribir código a la hora de imprimir el mensajepeso.
    /*Definimos en este caso una variable condicional y desde el menu de arriba vamos a refactor ->
    * ->extract/introduce y method. Asi queda una funcion definida*/
    private static void mensajePeso(Persona p) {
        if (p.calcularIMC()<0){
            System.out.println(p.getNombre()+ " esta por debajo de su peso ideal");
        } else if (p.calcularIMC() == 0){
            System.out.println(p.getNombre()+ " esta en su peso ideal");
        } else {
            System.out.println(p.getNombre()+ " tiene sobrepeso");
        }
    }

}
