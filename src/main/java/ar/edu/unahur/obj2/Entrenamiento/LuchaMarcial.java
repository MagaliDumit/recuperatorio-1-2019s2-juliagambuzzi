package ar.edu.unahur.obj2.Entrenamiento;

import ar.edu.unahur.obj2.Almas.Alma;

public class LuchaMarcial extends Entrenamiento {
    public LuchaMarcial(Alma alma) {
        super(alma);
    }

    @Override
    public int getValor() {
        return super.getValor()*2;
    }
}
