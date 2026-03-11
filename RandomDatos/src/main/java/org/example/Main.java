package org.example;

import net.datafaker.Faker;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Faker f = new Faker();
        String []nombres= new String[100];
        for (int i = 0; i < 100; i++) {
            nombres[i]=f.pokemon().name();
            //evitar duplicados
        }
        StringBuilder nombres2= new StringBuilder();
        String nombre= f.pokemon().name();;
        nombres2.append(nombre).append("/");
        for (int i = 0; i < 99; i++) {
            //evitar duplicados
            do {
                nombre = f.pokemon().name();
            } while (nombres2.indexOf(nombre) != -1);
            nombres2.append(nombre).append("/");
        }
        System.out.println(nombres2);
        String[] trozos = nombres2.toString().split("/");
        Arrays.sort(trozos);
        for (int i = 0; i < 100; i++) {
            System.out.println(trozos[i]);
        }
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            IO.println("i = " + i);
        }
    }
}
