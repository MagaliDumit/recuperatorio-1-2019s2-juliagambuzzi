package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.Demonios.Demonio;
import ar.edu.unahur.obj2.Lugares.Lugar;

import java.util.List;

public class Diablo {

    private List<Demonio> demonios;

    public boolean isEstaContento() {
        return estaContento;
    }

    public void setEstaContento(boolean estaContento) {
        this.estaContento = estaContento;
    }

    private boolean estaContento;


    public Diablo(List<Demonio> demonios) {
        this.demonios = demonios;
    }

    public void enviarACazar(Demonio demonio, Lugar lugar) {
        demonio.cazar(lugar);
    }


    public void conbatir(Demonio dem1, Demonio dem2){

        if (dem1.poder()> dem2.poder()){
            if (estaContento){
                dem1.setMaldad(dem1.getMaldad()+10);
                dem2.sacarAlma();
                dem2.sacarAlma();

            }else{
                dem1.setMaldad(dem1.getMaldad()+1);
                dem2.borrarAlmas();
            }

        }else {
            if (estaContento){
                dem2.setMaldad(dem1.getMaldad()+10);
                dem1.sacarAlma();
                dem1.sacarAlma();

            }else{
                dem2.setMaldad(dem1.getMaldad()+1);
                dem1.borrarAlmas();
            }

        }
    }
}
