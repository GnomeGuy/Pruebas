package com.adaits;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MinionTest {

    static Minion[] minions;
    static int posMinionActual = 0;
    private Minion minionProbar = null;

    @BeforeAll
    static void crearPersonas(){
        minions = new Minion[10];
        minions[0] = new Minion("Dave",30,"Adamantium",31341,false,"Destilar cubatas","Higado de hierro");
        minions[1] = new Minion("Carl",15,"Xinxengumi",0,true,"Gonorrea Radiactiva","Brazo boomerang");
        minions[2] = new Minion("Stuart",Integer.MAX_VALUE,"Viva er beti",1,true,"Gastroenteritis grado 8","Pelo Chicle");
        minions[3] = new Minion("Jerry",Integer.MIN_VALUE,"Campurrianas Integrales",0,true,"Trapichero","Terrorista");
        minions[4] = new Minion("Jorge",17,"Chimichanga",314512,false,"Cabeza de pan Bimbo", "Héroe de Stalingrado");
        minions[5] = new Minion("Tim",18,"Duracell",9,true,"Proyector en las orejas","Primo de Hulk");
        minions[6] = new Minion("Mark",19);
        minions[7] = new Minion("Phil",Integer.MIN_VALUE -1);
        minions[8] = new Minion("Kevin",Integer.MAX_VALUE+1);
    }

    @BeforeEach
    void prepararMinionProbar(){
        minionProbar = minions[posMinionActual];
        System.out.println(minionProbar);
    }

    @AfterEach
    void aumentarPosicion(){
        posMinionActual +=1;
        System.out.println("POSICION ACTUAL: "+ posMinionActual);
    }

    @AfterAll
    static void terminar(){
        System.out.println("TODAS LAS PRUEBAS HAN TERMINADO");
    }



    @Test
    void probarEsUnVillano1(){
        assertTrue(minionProbar.esUnVillano());
    }
    @Test
    void probarEsUnVillano2(){
        assertFalse(minionProbar.esUnVillano());
    }
    @Test
    void probarEsUnVillano3(){
        assertTrue(minionProbar.esUnVillano());
    }
    @Test
    void probarEsUnVillano4(){
        assertFalse(minionProbar.esUnVillano());
    }
    @Test
    void probarEsUnVillano5(){
        assertFalse(minionProbar.esUnVillano());
    }
    @Test
    void probarEsUnVillano6(){
        assertTrue(minionProbar.esUnVillano());
    }
    @Test
    void probarEsUnVillano7(){
        assertTrue(minionProbar.esUnVillano());
    }
    @Test
    void probarEsUnVillano8(){
        assertTrue(minionProbar.esUnVillano());
    }
    @Test
    void probarEsUnVillano9(){
        assertFalse(minionProbar.esUnVillano());
    }






}