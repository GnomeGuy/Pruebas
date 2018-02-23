package com.adaits;

import java.util.Arrays;

public class Minion {

    private String nombre;
    private int crimenes;
    private String palabraFavorita;
    private int ojos;
    private boolean llevaGafas;
    private String habilidades[];
    private Jefe jefe;

    //Crear propiedad para gestionar palabra favorita
    //Crear propiedad para los numeros de ojos
    //Crear propiedad de si lleva gafas o no
    //Crear propiedad de habilidades
    //Crear Clase Jefe y asociarla a un minion, tener en cuenta que un jefe puede tener varios minions
    //Pero los minions solo obedecen a un jefe

    public Minion(String nombre, int crimenes,String palabraFavorita,int ojos, boolean llevaGafas, String habilidad1, String habilidad2, Jefe jefe) {
        this.nombre = nombre;
        this.crimenes = crimenes;
        this.palabraFavorita = palabraFavorita;
        this.ojos = ojos;
        this.llevaGafas = llevaGafas;
        habilidades[0] = habilidad1;
        habilidades[1] = habilidad2;
        this.jefe = jefe;
    }
    public Minion(int ojos,boolean llevaGafas){
        this.ojos=ojos;
        this.llevaGafas=llevaGafas;
    }

    @Override
    public String toString() {
        return "Minion{" +
                "nombre='" + nombre + '\'' +
                ", crimenes=" + crimenes +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esUnVillano(){
        boolean esMayor = false;

        if(this.crimenes >= 18){
            esMayor = true;
        }

        return esMayor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Minion minion = (Minion) o;

        if (crimenes != minion.crimenes) return false;
        if (ojos != minion.ojos) return false;
        if (llevaGafas != minion.llevaGafas) return false;
        if (nombre != null ? !nombre.equals( minion.nombre ) : minion.nombre != null) return false;
        if (palabraFavorita != null ? !palabraFavorita.equals( minion.palabraFavorita ) : minion.palabraFavorita != null)
            return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals( habilidades, minion.habilidades );
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + crimenes;
        result = 31 * result + (palabraFavorita != null ? palabraFavorita.hashCode() : 0);
        result = 31 * result + ojos;
        result = 31 * result + (llevaGafas ? 1 : 0);
        result = 31 * result + Arrays.hashCode( habilidades );
        return result;
    }


    //Crear una funcion que obtengan todos los minions con mas de un ojo y sin gafas


    //Crear una función que obtenga todos los minions con más de una habilidad


    //Crear una función que obtenga un minion con la misma palabra favorita que tu

    //Crear una función que te devuelva el primer minion que se unio a un jefe

}
