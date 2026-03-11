package org.example;

import java.util.Scanner;

public class EntradaSalida {
    public static String dameTexto(String palabra){
        Scanner sc = new Scanner(System.in);
        imprimeTexto(palabra);
        return sc.nextLine();
    }
    public static void imprimeTexto(String texto){
        System.out.println(texto);
    }
}
