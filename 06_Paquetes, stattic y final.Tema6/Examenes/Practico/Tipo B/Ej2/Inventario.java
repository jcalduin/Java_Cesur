package Ej2;

public class Inventario {
    private Producto[] productos;

    public Inventario(int capacidad) {
        productos = new Producto[capacidad];
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void agregarProducto(int numProducto, Producto producto) {
        int indice =0;
        boolean encontrado= false;

        do {
            if (productos[indice] ==  null){
                productos[indice] = producto;
                encontrado = true;
            } else
                indice++;
        } while (!encontrado && indice < productos.length);

        if (!encontrado)
            System.out.println("No se puede agregar mas productos al inventario");

    }

    public void mostrarInventario() {
        double precioTotal =0;
        for (Producto p : productos) {
            if (p != null) {
                precioTotal += p.calcularPrecioFinal()*p.getCantidadEnStock();
                System.out.println("Producto: " + p.getNombre() + " - Precio unitario: " + p.calcularPrecioFinal() + "€ - Stock: " + p.getCantidadEnStock() + " Precio final: " +p.calcularPrecioFinal()*p.getCantidadEnStock() +"€");
            }
        }
        System.out.printf("Total inventario: %.2f€",precioTotal);
    }
}
