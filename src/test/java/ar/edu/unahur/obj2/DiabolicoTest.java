package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.Almas.Alma;
import ar.edu.unahur.obj2.Almas.AlmaSimple;
import ar.edu.unahur.obj2.Demonios.*;
import ar.edu.unahur.obj2.Entrenamiento.CruzRoja;
import ar.edu.unahur.obj2.Entrenamiento.Supervivencia;
import ar.edu.unahur.obj2.Lugares.Infierno;
import ar.edu.unahur.obj2.Lugares.Lugar;
import ar.edu.unahur.obj2.Lugares.Paraiso;
import ar.edu.unahur.obj2.Lugares.Purgatorio;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiabolicoTest {

    Alma alma1 = new AlmaSimple(20,20,true);
    Alma alma2 = new AlmaSimple(20,22,false);
    Alma alma3 = new AlmaSimple(55,50,true);
    Alma alma4 = new AlmaSimple(26,20,true);
    Alma alma5 = new AlmaSimple(60,29,false);
    Alma alma6 = new AlmaSimple(40,0,true);



    List<Alma> almas1 = Stream.of(alma1, alma2,alma3,alma4,alma5,alma6).
            collect(Collectors.toList());
    List<Alma> almas2 = Stream.of(alma1, alma2,alma3,alma4,alma5,alma6).
            collect(Collectors.toList());
    List<Alma> almas3 = Stream.of(alma1, alma2,alma3,alma4,alma5,alma6).
            collect(Collectors.toList());

    Arma espada = new Espada();
    Arma ballesta = new Ballesta();
    Arma arco = new ArcoYFlecha();
    Demonio dem1 = new DemonioHielo(40,espada);
    Demonio dem2 = new DemonioFuego(50, ballesta);
    Demonio dem3 = new DemonioSombra(55,arco);
    Lugar infierno = new Infierno(almas1);
    Lugar paraiso = new Paraiso(almas2);
    Lugar purgatorio = new Purgatorio(almas3);


    @BeforeMethod
    public void setUp() {

    }

    @Test
    public void entrenamiento() {
        Alma alma = new AlmaSimple(50, 100, true);
        Alma almaEntrenadaSupervivencia = new Supervivencia(alma);
        Alma almaCruzRoja = new CruzRoja(almaEntrenadaSupervivencia);

    }

    @Test
    public void escondites(){


        dem1.cazar(infierno);

    }




}