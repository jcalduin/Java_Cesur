package Practica_06;

public class Libro extends Ejemplar{
    private int numPaginas;
    private Genero genero;

    public Libro(String titulo, String autor, int anho, int numPaginas, String genero) {
        super(titulo, autor, anho);
        this.numPaginas = numPaginas;
        comprobarGenero(genero);
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "numPaginas=" + numPaginas +
                ", genero=" + genero +
                '}'+super.toString();
    }

    @Override
    public void mostrarInfo() {
        System.out.println(this);
    }

    private void comprobarGenero(String genero) {
        switch (genero.toLowerCase()) {
            case "ficcion" -> this.genero = Genero.FICCION;
            case "ciencia" -> this.genero = Genero.CIENCIA;
            case "romance" -> this.genero = Genero.ROMANCE;
            default -> this.genero = Genero.SCIFI;
        }
    }
}
