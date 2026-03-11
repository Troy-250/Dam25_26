package org.example;

import java.io.*;
import java.util.Scanner;

public class GestionFicheros {
    public static final String NOMBRE_DE_FICHERO = "Fichero";

    public static void escribirFicheroPW(String nombreFichero) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(nombreFichero);
        pw.println("Hola, ya estamos escribiendo un fichero");
        pw.close();
    }

    public static void escribirFicheroPW() throws FileNotFoundException {
        escribirFicheroPW(NOMBRE_DE_FICHERO);
    }

    public static void escribirFicheroFW(String nombreFichero, String texto, boolean append)  {
        try {
            FileWriter fw = new FileWriter(nombreFichero,append);
            fw.write(texto+"\n");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribirFicheroPWFW(String nombreFichero, String texto, boolean append)  {
        try {
            FileWriter fw = new FileWriter(nombreFichero,append);
            PrintWriter pw = new PrintWriter(fw);
            //PrintWriter pw = new PrintWriter(new FileWriter(nombreFichero,append));
            pw.println(texto);
            //pw.printf("%s\n",texto);
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void leerFichero(){
       /* File f = new File(NOMBRE_DE_FICHERO);
        Scanner sc = new Scanner(f);*/
        try {
            Scanner lectorFichero = new Scanner(new File(NOMBRE_DE_FICHERO));
            while(lectorFichero.hasNextLine()){
                String texto = lectorFichero.nextLine();
                System.out.println(texto);
            }
            lectorFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
    }

    public static String leerFichero(String  nombreFichero){
       /* File f = new File(nombreFichero);
        Scanner sc = new Scanner(f);*/
        StringBuilder sb = new StringBuilder();
        try {
            Scanner lectorFichero = new Scanner(new File(nombreFichero));
            while(lectorFichero.hasNextLine()){
                String texto = lectorFichero.nextLine();
                sb.append(texto).append("\n");
            }
            lectorFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
        return sb.toString();
    }


    public static String crearFichero(String nombreFichero) throws FileNotFoundException {
        File f = new File(nombreFichero);
        String respuesta= null;

        if (f.exists()) {
            respuesta = "Fichero ya existe y su tamaño es: " + f.length();
        } else {
            try {
                respuesta = f.createNewFile() ? "Fichero creado" : "Fichero no creado porque no tiene permisos";
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        //El flujo se puede establecer no sólo con el nombre del fichero sino también con un objeto de tipo File, el manejador
        // PrintWriter pw = new PrintWriter(f);


    return respuesta;
    }


}
