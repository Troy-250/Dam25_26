package org.example.deberesNerea;

import java.util.Random;

public class Comprobaciones {


    public static void playaOk(String tipo) throws PlayaException{
        if (!(tipo.equalsIgnoreCase("Cala") || tipo.equalsIgnoreCase("Playa"))){
            throw new PlayaException("Has introducido " + tipo + ". Tiene que ser una Playa o una Cala");
        }
    }

    public static void flagOk(String flag) throws FlagException{
        if (!(flag.equalsIgnoreCase("amarilla") || flag.equalsIgnoreCase("amarillo") ||
                flag.equalsIgnoreCase("verde") || flag.equalsIgnoreCase("roja") || flag.equalsIgnoreCase("rojo"))){
            //throw new FlagException();
            throw new FlagException("La bandera ni puede ser " + flag + ". Tiene que ser Amarilla, Verde o Roja");
        }

    }

    public  static void longitudOk(double longitud,int inferior, int superior) throws LongitudException{
        if (longitud<inferior || longitud>superior)
            throw new LongitudException("La longitud esta fuera de los limites ");
    }


}
