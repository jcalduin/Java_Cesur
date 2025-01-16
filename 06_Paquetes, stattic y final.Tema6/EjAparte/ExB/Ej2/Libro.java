package ExB.Ej2;

public class Libro {
    private String titulo;
    private double precio;
    private CategoriaLibro categoria;
    private boolean prestado;

    public Libro(String titulo, double precio, String categoria) {
        this.titulo = titulo;
        this.precio = precio;
        comprobarCategoria(categoria);
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double porecio) {
        this.precio = porecio;
    }

    public CategoriaLibro getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        comprobarCategoria(categoria);
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void comprobarCategoria(String categoria) {
        switch (categoria.toLowerCase()) {
            case "ficcion" -> this.categoria = CategoriaLibro.FICCION;
            case "historia" -> this.categoria = CategoriaLibro.HISTORIA;
            default -> this.categoria = CategoriaLibro.CIENCIA;
        }
    }

    public void marcarPrestado() {
        this.prestado = true;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", categoria=" + categoria +
                ", prestado=" + prestado +
                '}';
    }
}
