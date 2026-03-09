package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo2 {
    static void main() {
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Introduce el numero");
            try {
                numero = lector.nextInt();
                switch(numero) {
                    case 1:
                        System.out.println("Introduce el nombre");
                        break;
                    case 2:
                        System.out.println("Introduce el apellido");
                        break;
                    case 8:
                        System.out.println("Hasta luego");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error de entrada, no introduzcas letras");
                lector.nextLine(); //ignorar el enter
            }



        } while (numero != 8);
    }
}