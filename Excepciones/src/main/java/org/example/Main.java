package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        try {
            char letra = (char) System.in.read();


        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("IO Error");
            System.out.println(e.getMessage());
        }


        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            try {
                opcion = lector.nextInt();
                switch (opcion) {
                    case

                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println("Introduzca un número del 1 al 10");
            }
        } while (opcion != 10);
    }
}
