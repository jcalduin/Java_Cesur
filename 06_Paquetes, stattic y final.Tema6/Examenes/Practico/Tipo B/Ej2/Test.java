package Ej2;

public class Test {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(3);

        inventario.agregarProducto(0, new Producto("Laptop", 1200.0, 10,CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(1, new Producto("Camiseta", 20.0, 50,CategoriaProducto.ROPA));
        inventario.agregarProducto(2, new Producto("Manzanas", 2.5, 200,CategoriaProducto.ALIMENTACION));

        inventario.mostrarInventario();
    }
}
