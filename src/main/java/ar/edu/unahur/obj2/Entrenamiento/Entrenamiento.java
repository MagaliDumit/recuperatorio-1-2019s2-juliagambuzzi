package ar.edu.unahur.obj2.Entrenamiento;

import ar.edu.unahur.obj2.Almas.Alma;

public abstract class Entrenamiento implements Alma {

    protected Alma alma;

    public Entrenamiento(Alma alma) {
        this.alma = alma;
    }

    @Override
    public int getValor() {
        return alma.getValor();
    }

    @Override
    public int getBondad() {
        return alma.getBondad();
    }

    @Override
    public boolean isFriolenta() {
        return alma.isFriolenta();
    }

    @Override
    public void setBondad(int bondad) {
        alma.setBondad(bondad);
    }

    @Override
    public void setValor(int valor) {
        alma.setValor(valor);
    }

    @Override
    public void setFriolenta(boolean friolenta) {
        alma.setFriolenta(friolenta);
    }
}
