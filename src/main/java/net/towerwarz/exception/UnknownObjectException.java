package net.towerwarz.exception;

/**
 * TowerWarZ
 * Created by xiurobert on 2/14/2016.
 */
public class UnknownObjectException extends Exception {
    public UnknownObjectException() { super(); }
    public UnknownObjectException(String message) { super(message); }
    public UnknownObjectException(String message, Throwable cause) { super(message, cause); }
    public UnknownObjectException(Throwable cause) { super(cause); }
}
