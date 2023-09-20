package org.example.exceptions;

/**
 * @author keptman
 * @createTime 2023-07-25
 */
public class ResponseException extends RuntimeException {

    private byte code;
    private String msg;

    public ResponseException(byte code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
