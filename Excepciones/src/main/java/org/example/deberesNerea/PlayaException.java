package org.example.deberesNerea;

public class PlayaException extends Exception{

    public PlayaException(String message){
        super(message);
    }
    public PlayaException() {
        super("Has introducido un tipo errónero, sólo se admite playa o cala");
    }
}
