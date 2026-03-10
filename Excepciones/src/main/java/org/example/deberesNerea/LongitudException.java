package org.example.deberesNerea;

public class LongitudException extends Exception{

    public LongitudException(){
        super("Longitud no válida");
    }

    public LongitudException(String message){
        super(message);
    }
}
