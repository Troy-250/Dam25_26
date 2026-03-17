package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//17/3
public class Main {
    static void main() {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Sophia");
        lista.add("Alejandro");
        lista.add("Kiarash");
        lista.add("Miguel");
        lista.add("Jorge");
        lista.add("Javier");
        lista.add("Álvaro");
        lista.add("Alejandra");
        lista.add("Luna");
        System.out.println(lista);
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            //if (lista.get(i).contains("A") || lista.get(i).contains("a")) {
            if (lista.get(i).charAt(0) == 'A') {
                System.out.println(lista.get(i));
            }
        }
        lista.remove("Javier");
        System.out.println(lista);
        lista.remove(5);
        lista.remove(lista.indexOf("Luna"));
        System.out.println(lista);


    }
}
