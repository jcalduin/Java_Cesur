package ExB.Ej3;

public class Plato {
    private String nombre;
    private CategoriaPlato categoria;
    private double precio;

    public Plato(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        comprobarCategoria(categoria);
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CategoriaPlato getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        comprobarCategoria(categoria);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void comprobarCategoria(String categoria) {
        switch (categoria.toLowerCase()) {
            case "entrante" -> this.categoria = CategoriaPlato.ENTRANTE;
            case "postre" -> this.categoria = CategoriaPlato.POSTRE;
            default -> this.categoria = CategoriaPlato.PRINCIPAL;
        }
    }

    public double calcularPrecioFinal() {
        double descuento =100 - getCategoria().getDescuento();
        descuento/=100;
        double precioFinal = descuento * this.precio;
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", precio=" + precio +
                '}';
    }
}
