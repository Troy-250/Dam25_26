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

//10_3
public class Main1 {


    static void main() {
        Scanner lector = new Scanner(System.in);
        try {
            GestionFicheros.escribirFicheroPW();
            System.out.println("Introduce nombre del fichero a escribir");
            String nombreFichero = lector.nextLine();
            System.out.println(GestionFicheros.crearFichero(nombreFichero));
            System.out.println("Indica 1.Conservar texto \n2. Sobreescribir");
            int opcion= lector.nextInt();
            boolean append = (opcion==1)?true:false;
            //boolean append = opcion==1;
            GestionFicheros.escribirFicheroPWFW(nombreFichero,"primera línea del fichero", append);
            /*GestionFicheros.escribirFicheroPW(nombreFichero);
            File f = new File("asdf");
            if (f.exists()) {
                System.out.println(f.delete()?"Fichero borrado":"Fichero no borrado");
            } else
                System.out.println(f.createNewFile()?"Fichero creado":"Fichero no creado porque no tiene permisos");
            */


        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            ;
        } catch (IOException e) {
            System.out.println("Excepción de Entrada/Salida");;
        }
    //scannerString();
    }
}
