package org.example;

import java.io.IOException;

public class Ejemplo1 {
    static void main() {
        try {
            char letra = (char) System.in.read();
            switch (letra) {
                case 'a':
                    System.out.println("Enhorabuena has introducido la a");
                    break;
            }
        } catch (IOException e) {
            //enviar al log
            System.out.println("Error de entrada");
            System.out.println(e.getMessage());
        }
    }
}
