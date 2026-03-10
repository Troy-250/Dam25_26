package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class GestionFicheros {
    public static final String NOMBRE_DE_FICHERO = "Fichero";

    public static void escribirFichero(String nombreFichero) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(nombreFichero);
        pw.println("Hola, ya estamos escribiendo un fichero");
        pw.close();
    }

    public static void escribirFichero() throws FileNotFoundException {
        escribirFichero(NOMBRE_DE_FICHERO);
    }

    public static String crearFichero(String nombreFichero) {
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

    return respuesta;
    }
}
