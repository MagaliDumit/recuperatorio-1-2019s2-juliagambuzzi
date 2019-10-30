package ar.edu.unahur.obj2.Lugares;

import ar.edu.unahur.obj2.Almas.Alma;

import java.util.List;

public class Purgatorio extends Lugar{

    public Purgatorio(List<Alma> almas) {
        super(almas);
    }

    public void addEsconder(Alma alma) {
        if (tieneLugar()){
            esconder.add(alma);
            penaliza(alma);}

    }


    public boolean tieneLugar(){
        if (esconder.size()<5 ){return true; }
        return false;
    }

    public void esconderse(List<Alma> almas){
        almas.stream()
                .filter(alma -> alma.getBondad()>10 && alma.getValor()>5)
                .forEach(alma -> this.addEsconder(alma));

    }

    public void penaliza(Alma alma){

        alma.setBondad(alma.getBondad()-5);
        alma.setValor(alma.getValor()-1);

    }











}
