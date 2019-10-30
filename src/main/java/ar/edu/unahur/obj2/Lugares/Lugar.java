package ar.edu.unahur.obj2.Lugares;

import ar.edu.unahur.obj2.Almas.Alma;
import ar.edu.unahur.obj2.Demonios.Demonio;

import java.util.List;

public abstract class Lugar {
    List<Alma> esconder;
    private List<Alma> almas;

    public Lugar(List<Alma> almas) {
        this.almas = almas;
    }
    public List<Alma> getAlmas() {
        return almas;
    }

    public void quitarAlma(Alma alma) {
        almas.remove(alma );
    }

    public void esconderse(List<Alma> almas, Demonio demonio, boolean res){
        if (estaCazando(demonio,res )){

        }
    }

    public boolean contieneEsconder(Alma alma) {
        return esconder.contains(alma);
    }

    public boolean estaCazando(Demonio demonio, Boolean res ){
         if (res==true){
             return res;
         }else{
             return esconder.removeAll(esconder);
         }
    }
}
