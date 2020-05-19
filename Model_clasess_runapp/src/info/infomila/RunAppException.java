/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.infomila;

/**
 *
 * @author David
 */
public class RunAppException extends RuntimeException{

    public RunAppException() {
    }

    public RunAppException(String message) {
        super(message);
    }

    public RunAppException(String message, Throwable cause) {
        super(message, cause);
    }

    public RunAppException(Throwable cause) {
        super(cause);
    }

    public RunAppException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
