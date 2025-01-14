package Practica_04;

public class ProductoRopa extends Producto {
    private Talla talla;
    private Material material;

    public ProductoRopa(String nombre, double precioInicial, String talla, String material) {
        super(nombre, precioInicial);
        comprobarMaterial(material);
        comprobarTalla(talla);
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Talla: " + talla+"\nMaterial: " + material);
    }

    public void comprobarTalla(String talla) {
        switch (talla.toLowerCase()) {
            case "S" -> this.talla = Talla.S;
            case "M" -> this.talla = Talla.M;
            case "XL" -> this.talla = Talla.XL;
            case "XXL" -> this.talla = Talla.XXL;
            default -> this.talla = Talla.L;
        }
    }

    public void comprobarMaterial(String material) {
        switch (material.toLowerCase()) {
            case "algodon" -> this.material = Material.ALGODON;
            case "lino" -> this.material = Material.LINO;
            case "poliester" -> this.material = Material.POLIESTER;
            case "lana" -> this.material = Material.LANA;
            default -> this.material = Material.SEDA;
        }
    }
}
