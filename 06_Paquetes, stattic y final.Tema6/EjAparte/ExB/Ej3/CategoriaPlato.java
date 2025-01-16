package ExB.Ej3;

public enum CategoriaPlato {
    ENTRANTE(10),PRINCIPAL(5),POSTRE(7);

    private int descuento;

    CategoriaPlato(int descuento) {
        this.descuento = descuento;
    }

    public int getDescuento() {
        return descuento;
    }
}
