package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Deberes:
1. Al crear el fichero dar la opción al usuario de introducir el texto en el fichero
2. Manejar el FileWriter y metodo write en vez de println (tanto sobreescribiendo como añadiendo texto)
 */

//11_3
public class Main2 {

    /*public static void scannerString() {
        Scanner scanner = new Scanner("234; Hoy; hace; sol");
        scanner.useDelimiter(";");
        scanner.next();
        scanner.next();
        scanner.next();
        System.out.println(scanner.next());
    }*/
    static void main() {
        Scanner lector = new Scanner(System.in);
        try {
            System.out.println("Introduce nombre del fichero a escribir");
            String nombreFichero = lector.nextLine();
            System.out.println(GestionFicheros.crearFichero(nombreFichero));
            System.out.println("\nIndica 1.Conservar texto \n2. Sobreescribir");
            int opcion= lector.nextInt();
            boolean append = (opcion==1)?true:false;
            //boolean append = opcion==1;
            GestionFicheros.escribirFicheroPWFW(nombreFichero,"primera línea del fichero", append);
            //GestionFicheros.leerFichero();
            EntradaSalida.imprimeTexto(GestionFicheros.leerFichero(nombreFichero));

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            ;
        } catch (IOException e) {
            System.out.println("Excepción de Entrada/Salida");;
        }
    //scannerString();
    }
}
