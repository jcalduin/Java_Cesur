package Ejercicio2;

public class Test {
    public static void main(String[] args) {

        Producto producto1 = new ProductoElectronico("Televisor",300.0,10,3);
        Producto producto2 =  new ProductoRopa("Camiseta",20.0,15,"L");
        Producto producto3 = new ProductoAlimenticio("Leche",2.5,50,"proximo mes");

        System.out.println("Detalles del producto 1 (Electrónico):");
        producto1.mostrarDetalles();
        System.out.printf("Precio final: %.2f€\n",producto1.calcularPrecio());
        producto1.disponibilidad();

        System.out.println("\nDetalles del producto 2 (Ropa):");
        producto2.mostrarDetalles();
        System.out.printf("Precio final: %.2f€\n",producto2.calcularPrecio());
        producto2.disponibilidad();

        System.out.println("\nDetalles del producto 3 (Alimenticio):");
        producto3.mostrarDetalles();
        System.out.printf("Precio final: %.2f€\n",producto3.calcularPrecio());
        producto3.disponibilidad();
    }
}
