package com.adaits;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class minionTest2 {

    static Minion[] minions;
    static Minion[] minions2;
    static Minion minion1;
    static Minion minion2;

    static Minion minion3;
    static Minion minion4;


    @BeforeAll
    static void crearminions(){
        minions = new Minion[2];
        minions2 = new Minion[2];
        minion1 = new Minion("Dave",30);
        minion2 = new Minion("Carl",15);

        minion3 = new Minion("Dave",30);
        minion4 = new Minion("Carl",15);
    }

    @Test
    void probarSonIgualesIguales(){
    
    }


    @Test
    void probarMinionsIguales(){
        minions[0] = minion1;
        minions[1] = minion2;

        minions2[0] = minion3;
        minions2[1] = minion4;

        assertArrayEquals(minions,minions2);
    }

    @Test
    void probarMinionsIguales2(){
        minions[0] = minion1;
        minions[1] = minion2;

        minions2[0] = minion1;
        minions2[1] = minion2;

        assertArrayEquals(minions,minions2);
    }






}