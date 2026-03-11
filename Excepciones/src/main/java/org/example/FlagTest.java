package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FlagTest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //deberes 1. bucle con booleano hasta que introduzca una bandera bien
        //deberes 2. chequear que la longitud de la playa esté en un rango

        try {
            System.out.println("Introduce la longitud de la playa");
            int longitud = sc.nextInt();
            sc.nextLine(); //limpieza
            Comprobaciones.longOk(longitud);
            System.out.println("Introduce bandera");
            String bandera = sc.nextLine();
            Comprobaciones.flagOk(bandera);
            System.out.println("Enhorabuena, has introducido un valor de bandera válida");
            //1. tratamiento diferente para cada excepción
        /*} catch (FlagException  e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("La longitud tiene que se un número");
        } catch (Exception e) {
            System.out.println("Para todas las demás excepciones");
        }*/
            //2. Mismo tratamiento para todas las excepciones que puedan saltar en el bloque
        } catch (FlagException | InputMismatchException | LongException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Cualquier otra excepcion"+e.getMessage());
        }

    }
}
