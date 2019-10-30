package ar.edu.unahur.obj2.Lugares;

import ar.edu.unahur.obj2.Almas.Alma;
import ar.edu.unahur.obj2.Demonios.Demonio;

import java.util.List;

public class Infierno extends Lugar{

    public Infierno(List<Alma> almas) {
        super(almas);
    }

    public void addEsconder(Alma alma) {
        if (tieneLugar()){
            esconder.add(alma);
            penaliza(alma);}
    }

    public boolean tieneLugar(){
        if (esconder.size()<2 ){return true; }
        return false;
    }

    public void esconderse(List<Alma> almas, Demonio demonio){
        almas.stream()
                .filter(alma -> alma.getBondad()==alma.getValor() && !alma.isFriolenta() )
                .forEach(alma -> this.addEsconder(alma));
    }

    public void penaliza(Alma alma){
        alma.setFriolenta(true);
    }


}
