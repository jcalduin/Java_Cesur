package Practica_04;

import java.util.Arrays;

public class Inventario {
    private Producto[] productos;

    public Inventario(int capacidadInventario) {
        productos = new Producto[capacidadInventario];
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        boolean encontrado = false;
        int indice = 0;
        do {
            if (productos[indice] == null) {
                productos[indice] = producto;
                encontrado = true;
            } else
                indice++;
        }while(!encontrado && indice < productos.length);

        if (encontrado)
            System.out.println("Producto agregado correctamente");
        else
            System.out.println("Producto no se puede agregar en el inventario");
    }

    public void listarProductos() {
        for (Producto p : productos){
            if (p != null)
                p.mostrarDetalles();
        }
    }

    public void listarProductosPorTipo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "electronico" -> {
                for (Producto p : productos) {
                    if (p instanceof ProductoElectronico)
                        p.mostrarDetalles();
                }
            }
            case "ropa" -> {
                for (Producto p : productos) {
                    if (p instanceof ProductoRopa)
                        p.mostrarDetalles();
                }
            }
        }
    }
}
