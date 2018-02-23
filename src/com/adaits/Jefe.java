package com.adaits;

import java.util.ArrayList;

public class Jefe {

    public Jefe(ArrayList<Minion> minions,String nombre){
        this.minions=minions;
        this.nombre=nombre;
    }

    private ArrayList<Minion> minions = new ArrayList<>(  );
    private String nombre;

    public ArrayList<Minion> getSinGafasConOjos() {
        ArrayList<Minion> aux = minions;
        for (Minion m: aux
             ) {if(aux[m])

        }
    }

}
