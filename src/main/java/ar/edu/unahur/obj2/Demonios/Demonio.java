package ar.edu.unahur.obj2.Demonios;

import ar.edu.unahur.obj2.Almas.Alma;
import ar.edu.unahur.obj2.Lugares.Lugar;

import java.util.ArrayList;
import java.util.List;

public abstract class Demonio {

    private int maldad;
    private List<Alma> almasCazadas = new ArrayList<>();
    private Arma arma;

    public Demonio(int maldad, Arma arma) {
        this.maldad = maldad;
        this.arma = arma;
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }



    public void cazar(Lugar lugar) {
        lugar.estaCazando(this,true);

        // para evitar el error de concurrent modification
        List<Alma> copiaDeAlmas = new ArrayList<>(lugar.getAlmas());
        copiaDeAlmas.stream().forEach(alma -> cazarOAtormentar(lugar, alma));

        lugar.estaCazando(this,false);
    }

    protected void cazarOAtormentar(Lugar lugar, Alma alma) {
        int almasAtormentadas=0;
        int almasCazadas=0;


        if (alma.getValor() < this.maldad && puedoCazarlo(alma) && !lugar.contieneEsconder(alma)) {

            almasCazadas++;
            cazar(lugar, alma);
        } else {
            almasAtormentadas++;
            atormentarAlma(alma);
        }
        incrementarNivelMaldad(almasCazadas, almasAtormentadas);
    }

    private void incrementarNivelMaldad(int almasCazadas, int almasAtormentadas) {
        maldad+=almasAtormentadas + 2*almasCazadas;
    }

    protected void cazar(Lugar lugar, Alma alma) {
        lugar.quitarAlma(alma);
        almasCazadas.add(alma);
    }
    protected void atormentarAlma(Alma alma) {
        alma.setValor(alma.getValor()-5);
        atormentar(alma);
    }

    protected abstract void atormentar(Alma a);
    protected abstract boolean puedoCazarlo(Alma a);

    public int poder(){return arma.getEnergia() * maldad * almasCazadas.size();}


    public List<Alma> getAlmasCazadas() {
        return almasCazadas;
    }

    public void setAlmasCazadas(List<Alma> almasCazadas) {
        this.almasCazadas = almasCazadas;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void sacarAlma(){
        almasCazadas.remove(almasCazadas.size()-1);
    }
    public void borrarAlmas(){
        almasCazadas.removeAll(almasCazadas);
    }

}
