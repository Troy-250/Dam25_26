package org.example;

import java.io.*;
import java.util.Scanner;

public class GestionFicheros {
    public static final String NOMBRE_DE_FICHERO = "Fichero";

    /*public static void escribirFicheroPW(String nombreFichero) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(nombreFichero);
        pw.println("Hola, ya estamos escribiendo un fichero");
        pw.close();
    }*/
    /*public static void escribirFicheroPW(String nombreFichero) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(nombreFichero);
            pw.println("Hola, ya estamos escribiendo un fichero");
            pw.close();
        } catch (FileNotFoundException e) {

        }
    }*/
    public static void escribirFicheroPW(String nombreFichero) {
        // try catch con recursos, el cierre del fichero lo hace java automáticamente
        try (PrintWriter pw = new PrintWriter(nombreFichero)) {
            pw.println("Hola, ya estamos escribiendo un fichero");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void escribirFicheroPW() {
        escribirFicheroPW(NOMBRE_DE_FICHERO);
    }

    /*public static void escribirFicheroFW(String nombreFichero, String texto, boolean append) {
        try {
            FileWriter fw = new FileWriter(nombreFichero, append);
            fw.write(texto + "\n");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/

    public static void escribirFicheroFW(String nombreFichero, String texto, boolean append) {
        // try catch con recursos, el cierre del fichero lo hace java automáticamente

        try (FileWriter fw = new FileWriter(nombreFichero, append)) {
            fw.write(texto + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void escribirFicheroPWFW(String nombreFichero, String texto, boolean append) {
        try {
           /* FileWriter fw = new FileWriter(nombreFichero, append);
            PrintWriter pw = new PrintWriter(fw);*/
            PrintWriter pw = new PrintWriter(new FileWriter(nombreFichero,append));
            pw.println(texto);
            //pw.printf("%s\n",texto);
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void leerFichero() {
       /* File f = new File(NOMBRE_DE_FICHERO);
        Scanner sc = new Scanner(f);*/
        try {
            Scanner lectorFichero = new Scanner(new File(NOMBRE_DE_FICHERO));
            while (lectorFichero.hasNextLine()) {
                String texto = lectorFichero.nextLine();
                System.out.println(texto);
            }
            lectorFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
    }

    public static String leerFicheroFR(String nombreFichero) {
        StringBuilder sb= new StringBuilder();
        try {
            BufferedReader lectorFichero = new BufferedReader(new FileReader(nombreFichero));
            String linea= null;
            do{
                linea = lectorFichero.readLine();
                sb.append(linea).append("\n");
            }while(linea!=null);
        } catch (IOException e) { //incluye a la FileNotFound por herencia
            System.out.println(e.getMessage());
        }
        return sb.delete(sb.length()-5, sb.length()).toString();
    }

    public static String leerFichero(String nombreFichero) {
       /* File f = new File(nombreFichero);
        Scanner sc = new Scanner(f);*/
        StringBuilder sb = new StringBuilder();
        try {
            Scanner lectorFichero = new Scanner(new File(nombreFichero));
            while (lectorFichero.hasNextLine()) {
                String texto = lectorFichero.nextLine();
                sb.append(texto).append("\n");
            }
            lectorFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
        return sb.toString();
    }
    /**
     * Método que lee el fichero que contiene una lista de colores y nos devuelve un array donde en cada posición tenemos un color
     * @param nombreFichero que contiene los colores a cargar en RAM
     * @return el array con los colores
     */
    public static String [] leerFicheroColoresCochesMiguel(String nombreFichero) {
       String[] colores = new String[cuantosColoresHayFichero(nombreFichero)];
        try {
            Scanner lectorFichero = new Scanner(new File(nombreFichero));
            for (int i=0;lectorFichero.hasNextLine();i++) {
                colores[i]=lectorFichero.nextLine(); //no almaceno en ningún sitio lo leido
            }
            lectorFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
       return colores;
    }

    /**
     * Método que devuelve el número de líneas, en el caso concreto del fichero de colores, la cantidad de colores
     * @param nombreFichero
     * @return el número de líneas
     */
    private static int cuantosColoresHayFichero(String nombreFichero) {
        int contadorColores = 0;
        try {
            Scanner lectorFichero = new Scanner(new File(nombreFichero));
            while (lectorFichero.hasNextLine()) {
                lectorFichero.nextLine(); //no almaceno en ningún sitio lo leido
                contadorColores++;
            }
            lectorFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
        return contadorColores;
    }


    public static String crearFichero(String nombreFichero) throws FileNotFoundException {
        File f = new File(nombreFichero);
        String respuesta = null;

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


    public static void escribirFicheroPW(String nombreFichero, String[] coches) {
        try {
            PrintWriter pw = new PrintWriter(nombreFichero);
            for (int i = 0; i < coches.length; i++) {
                pw.println(coches[i]);
            }
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
