package ar.edu.unahur.obj2.Almas;

public class AlmaSimple implements Alma {

    private int bondad;
    private int valor;
    private boolean friolenta;

    public AlmaSimple(int bondad, int valor, boolean friolenta) {
        this.bondad = bondad;
        this.valor = valor;
        this.friolenta = friolenta;
    }

    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean isFriolenta() {
        return friolenta;
    }

    public void setFriolenta(boolean friolenta) {
        this.friolenta = friolenta;
    }

}
