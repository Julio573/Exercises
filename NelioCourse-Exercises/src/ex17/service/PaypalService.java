package ex17.service;

public class PaypalService implements OnlinePaymentService{

    private static final double INTEREST = 0.1;
    private static final double TAX = 0.2;

    public double paymentFee(double amount) {
        return amount * TAX;
    }

    public double interest(double amount, int months) {
        return amount * INTEREST * months;
    }


}
