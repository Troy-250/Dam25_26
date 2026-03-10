package org.example.deberesNerea;

import com.sun.security.jgss.GSSUtil;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Test {
    //entrada salida
    static void main() {
        Scanner read = new Scanner(System.in);

        Random random = new Random();
        double longitudPlaya = 0;
        double longitudCala = 0;
        boolean correcto = false;
        //System.out.println("Pulsa enter para empezar");
        do {
            try {
                System.out.println("Introduce si es Playa o Cala");
                String tipo = read.nextLine();
                Comprobaciones.playaOk(tipo);
                System.err.println("Tipo correcto");
                if (tipo.equalsIgnoreCase("Playa")) {
                    System.out.println("Introduce la longitud de la Playa (minimo 600m maximo 2000m) ");
                    longitudPlaya = read.nextDouble();
                    Comprobaciones.longitudOk(longitudPlaya, 600,2000);
                    System.out.println("Introduce la longitud de la Playa (minimo 100m maximo 600m) ");
                    longitudCala = read.nextDouble();
                    Comprobaciones.longitudOk(longitudCala,100,600);
                }
                read.nextLine();
                System.out.println("Introduce el color de la bandera");
                String bandera = read.nextLine();
                Comprobaciones.flagOk(bandera);
                System.err.println("Bandera correcta");
                correcto = true;
                //chequear que la longitud de la playa este dentro de un rango
                //meter un bucle con booleano que hasta que no se meta la bandera bien no sale
            } catch (PlayaException | LongitudException | FlagException e) {
                System.out.println(e.getMessage());
            }
            read.nextLine();
        } while (correcto != true);

    }
}
