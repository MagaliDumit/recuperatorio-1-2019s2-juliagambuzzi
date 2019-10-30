package ar.edu.unahur.obj2.Demonios;

import ar.edu.unahur.obj2.Almas.Alma;

public class DemonioHielo extends Demonio {

    public DemonioHielo(int maldad, Arma arma) {
        super(maldad, arma);
    }

    @Override
    protected void atormentar(Alma alma) {
        alma.setFriolenta(true);
    }

    @Override
    protected boolean puedoCazarlo(Alma a) {
        return a.isFriolenta();
    }
}