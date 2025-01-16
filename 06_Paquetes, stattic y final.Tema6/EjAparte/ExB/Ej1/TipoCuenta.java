package ExB.Ej1;

public enum TipoCuenta {
    AHORRO(3),CORRIENTE(5),EMPRESARIAL(12);

    private int intereses;

    TipoCuenta(int intereses) {
        this.intereses = intereses;
    }

    public int getIntereses() {
        return intereses;
    }
}
