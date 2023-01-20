package bll;

public class BLLException extends Exception{
    public BLLException (String message){
        super(message);
    }

    public BLLException (String message, Throwable throwable){
        super(message, throwable);
    }
}
