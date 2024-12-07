package GestionDeVehiculos;

import java.util.Random;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private Tipo tipo;
    private double kilometros;
    private double consumo;

    public Vehiculo(String marca, String modelo, char tipo, double kilometros, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        generarMatricula();
        validarTipo(tipo);
        this.kilometros = kilometros;
        this.consumo = consumo;
    }

    public Vehiculo(String marca, String modelo, char tipo) {
        this(marca, modelo, tipo, 0, 0);
    }

    public Vehiculo() {
        this(" "," ",'C',0,0);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        validarTipo(tipo);
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double calcularConsumo(double distancia) {
        return consumo * distancia/100;
    }

    public boolean esVehiculoEconomico() {
        return consumo <= 5;
    }

    private void validarTipo(char tipo) {
        if (tipo == 'T' || tipo == 't') {
            this.tipo = Tipo.T;
        } else if (tipo == 'M' || tipo == 'm') {
            this.tipo = Tipo.M;
        } else {
            this.tipo = Tipo.C;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", tipo=" + tipo +
                ", kilometros=" + kilometros +
                ", consumo=" + consumo +
                '}';
    }

    private void generarMatricula() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        int numero = r.nextInt(letras.length());
        char letra1 = letras.charAt(numero);
        String letrasMatricula = "" + letra1;
        numero = r.nextInt(letras.length());
        char letra2 = letras.charAt(numero);
        letrasMatricula += "" + letra2;
        numero = r.nextInt(letras.length());
        char letra3 = letras.charAt(numero);
        letrasMatricula += "" + letra3;

        int numeroMatricula = r.nextInt(10000);
        String matricula = ""+numeroMatricula;
        while (matricula.length()<4) {
            matricula ="0"+ matricula;
        }
        this.matricula = matricula + letrasMatricula;
    }
}
