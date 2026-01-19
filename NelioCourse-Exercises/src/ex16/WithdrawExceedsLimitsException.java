package ex16;

public class WithdrawExceedsLimitsException extends RuntimeException {
    public WithdrawExceedsLimitsException(String message) {
        super(message);
    }
}
