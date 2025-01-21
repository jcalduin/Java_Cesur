package Ej3;

public class Plato {
    private String plato;
    private CategoriaPlato categoria;
    private double precio;

    public Plato(String plato, CategoriaPlato categoria, double precio) {
        this.plato = plato;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public CategoriaPlato getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaPlato categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularPrecioFinal() {
        double precioFinal = 0;
        if (getCategoria() == CategoriaPlato.ENTRANTE) {
            precioFinal = getPrecio() * 0.9;
        } else if (getCategoria() == CategoriaPlato.POSTRE) {
            precioFinal = getPrecio() * 0.8;
        } else
            precioFinal = getPrecio();

        return precioFinal;
    }
}
