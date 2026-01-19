package ex15;

public class InvalidCheckOutDateException extends RuntimeException {
    public InvalidCheckOutDateException(String message) {
        super(message);
    }
}
