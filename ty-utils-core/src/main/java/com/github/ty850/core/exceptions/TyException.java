package com.github.ty850.core.exceptions;

/**
 * @author xy
 */
public class TyException extends RuntimeException {

    public TyException() {
        super();
    }

    public TyException(String message) {
        super(message);
    }

    public TyException(String message, Throwable cause) {
        super(message, cause);
    }

    public TyException(Throwable cause) {
        super(cause);
    }

    protected TyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
