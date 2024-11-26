package Practica_07;

public class Pelicula {
    private String titulo;
    private int anhoEstreno;
    private String genero;
    private Actor actor;
    private Director director;

    public Pelicula(String titulo, int anhoEstreno, String genero, Actor actor, Director director) {
        this.titulo = titulo;
        this.anhoEstreno = anhoEstreno;
        this.genero = genero;
        this.actor = actor;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnhoEstreno() {
        return anhoEstreno;
    }

    public void setAnhoEstreno(int anhoEstreno) {
        this.anhoEstreno = anhoEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anhoEstreno=" + anhoEstreno +
                ", genero='" + genero + '\'' +
                ", actor=" + actor +
                ", director=" + director +
                '}';
    }

    public void mostrarDetalles() {
        System.out.println(this);
    }
}
