package org.example.exceptions;

/**
 * @author keptman
 * @createTime 2023-06-29
 */
public class SerializeException extends RuntimeException{

    public SerializeException() {
    }

    public SerializeException(String message) {
        super(message);
    }

    public SerializeException(Throwable cause) {
        super(cause);
    }
}
