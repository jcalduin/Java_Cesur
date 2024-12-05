package Practica_01;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private Sexo sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generaDni();
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public Persona (String nombre,int edad,char sexo) {
        this(nombre,edad,sexo,0,0);
    }

    public Persona() {
        this("",0,'H',0,0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public int calcularIMC() {
        double IMC = peso/(altura*altura);
        int resultado = 1;
        if (IMC < 18.5)
            resultado =  -1;
        else if (IMC >=18.5 && IMC < 25)
            resultado = 0;
        return resultado;
    }

    public boolean esMayorDeEdad() {
      return edad >= 18;
    }

    private void comprobarSexo (char sexo) {
        if (sexo == 'M' || sexo == 'm') {
         this.sexo= Sexo.M;
        } else
            this.sexo=Sexo.H;
    }

    private void generaDni() {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        Random r = new Random();
        int numero = r.nextInt(100000000);
        char letra = letras.charAt(numero%23);
        String dni = ""+numero;
        while (dni.length()<8){
            dni = "0"+dni;
        }
        this.dni = dni + letra;
    }
}
