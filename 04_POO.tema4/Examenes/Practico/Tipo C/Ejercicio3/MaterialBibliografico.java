package Ejercicio3;

public class MaterialBibliografico {
    private String titulo;
    private String autor;
    private int anhoPublicacion;
    private boolean disponible;

    public MaterialBibliografico(String titulo, String autor, int anhoPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anhoPublicacion = anhoPublicacion;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnhoPublicacion() {
        return anhoPublicacion;
    }

    public void setAnhoPublicacion(int anhoPublicacion) {
        this.anhoPublicacion = anhoPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar () {
        if (disponible) {
            System.out.println("Material disponible");
            disponible = false;
        } else {
            System.out.println("Material no disponible");
        }
    }

    public void devolver () {
        if (disponible) {
            System.out.println("El libro ha sido devuelto");
        } else {
            System.out.println("No hay nada que devolver");
        }
    }

    public void mostrarDetalles() {
        String disponibilidad =" ";
        if (disponible) {
            disponibilidad = "si";
        } else {
            disponibilidad = "no";
        }
        System.out.println("Titulo: " + titulo+"\nAutor: " + autor+"\nAño Publicacion: " + anhoPublicacion+"\nDisponible: " + disponibilidad );
    }

    public void disponibilidad() {
        if (disponible) {
            System.out.println("Material disponible");
        } else {
            System.out.println("Material no disponible");
        }
    }
}
