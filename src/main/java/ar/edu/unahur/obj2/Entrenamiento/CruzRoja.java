package ar.edu.unahur.obj2.Entrenamiento;

import ar.edu.unahur.obj2.Almas.Alma;

public class CruzRoja extends Entrenamiento {
    public CruzRoja(Alma alma) {
        super(alma);
    }

    @Override
    public int getBondad() {
        int bondadActual = super.getBondad();
        return bondadActual < 100 ? 100 : bondadActual;
    }
}
