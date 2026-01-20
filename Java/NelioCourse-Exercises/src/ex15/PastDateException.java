package ex15;

public class PastDateException extends RuntimeException {
    public PastDateException(String message) {
        super(message);
    }
}
