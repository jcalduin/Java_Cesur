package Practica_03;

public class Productos_frescos extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;

    public Productos_frescos(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Productos_frescos: "+super.toString()+ "\nFecha envasado: "+fechaEnvasado+" Pais origen: "+paisOrigen;

    }
}
