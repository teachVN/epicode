package it.epicode.u5w3d2teoria.exception;

public class UnAuthorizedException extends RuntimeException{

    public UnAuthorizedException(String message){
        super(message);
    }
}
