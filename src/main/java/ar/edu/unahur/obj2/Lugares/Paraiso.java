package ar.edu.unahur.obj2.Lugares;

import ar.edu.unahur.obj2.Almas.Alma;

import java.util.List;

public class Paraiso extends Lugar{
    public Paraiso(List<Alma> almas) {
        super(almas);
    }

    public void addEsconder(Alma alma) {
        if (tieneLugar()){
            esconder.add(alma);
            penaliza(alma);}
    }


    public boolean tieneLugar(){
        if (esconder.size()<10 ){return true; }
        return false;
    }

    public void esconderse(List<Alma> almas){
        almas.stream()
                .filter(alma -> alma.getBondad()>0 )
                .forEach(alma -> this.addEsconder(alma));

    }

    public void penaliza(Alma alma){
        alma.setBondad(alma.getBondad()-1);
    }



}
