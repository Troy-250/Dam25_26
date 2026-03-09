package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejemplo3 {
    static void main() {
        int [] numeros = new  int [10];
        for (int i = 0; i <= numeros.length ; i++) {
            //esto no se hace
            try {
                System.out.println(numeros[i]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }

        int [][] tabla = new int[10][5];

       /* for (int i = 0; i < tabla.length ; i++) {

            for (int j = -1; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j]);
                System.out.println(tabla[j+j]);
            }
            System.out.println();
        }

        String [] nombres = {"BMB", null, "asdf","124123"};
        for (int i = 0; i < nombres.length; i++) {
            //if (nombres[i]!= null)
            //Esto no se hace
            try {
                System.out.println(nombres[i].length());
            }catch (NullPointerException e){
                System.err.println(e.getMessage());
            }
        }*/
    }
}
