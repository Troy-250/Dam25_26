package org.example;

import java.util.Scanner;

public class Ejemplo4 {
    static void main() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce número");

        int numero=0;
        boolean ok=false;
        do {
            String cadena = lector.nextLine();
            try {
                numero = Integer.parseInt(cadena);
                ok=true;
            } catch (NumberFormatException e) {
                System.out.println("Numero incorrecto");
            }
        }while(!ok);
        System.out.println("El número introducido es:" + numero);
    }
}
