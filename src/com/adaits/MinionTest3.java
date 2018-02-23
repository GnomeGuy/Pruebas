package com.adaits;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MinionTest3 {

    static Minion[] minions;
    static int posMinionActual = 0;
    private Minion minionProbar = null;

    @BeforeAll
    static void crearminion(){
        minions = new Minion[10];
        minions[0] = new Minion(0,true);
        minions[1] = new Minion(1,false);
        minions[3] = new Minion(2,true);
        minions[4] = new Minion(3,false);
        minions[5] = new Minion(0,true);
        minions[6] = new Minion(5,false);
        minions[7] = new Minion(7,true);
        minions[8] = new Minion(8,false);
        minions[9] = new Minion(4,true);
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

    @Test
    void prueba(){
        ArrayList<Minion> m = new ArrayList<>(  );
        minions[1] = new Minion( 3,false );
        Jefe j = new Jefe(m,"Rutinario");
        ArrayList<Minion> mm = new ArrayList<>(j.getSinGafasConOjos());
        assertEquals( m.size(),mm.size());
            for (int i =0;i<mm.size();i++ ){
                Minion minion1 = mm.get( i );
                Minion minion2 = m.get( i );
                assertSame( minion1,minion2 ); //Mejor usar same para saber que es el minion de las pruebas
            }
    }

}
