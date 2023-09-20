package org.example.exceptions;

/**
 * @author keptman
 * @createTime 2023-07-06
 */
public class LoadBalancerException extends RuntimeException {

    public LoadBalancerException(String message) {
        super(message);
    }

    public LoadBalancerException() {
    }
}
