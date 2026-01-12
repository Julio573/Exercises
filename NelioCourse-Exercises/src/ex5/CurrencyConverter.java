package ex5;

public class CurrencyConverter {

    private double dollarPrice;
    private double dollarsBought;

    public CurrencyConverter() {
    }

    public CurrencyConverter(double dollarPrice, double dollarsBought) {
        this.dollarPrice = dollarPrice;
        this.dollarsBought = dollarsBought;
    }

    public double getDollarPrice() {
        return dollarPrice;
    }

    public void setDollarPrice(double dollarPrice) {
        this.dollarPrice = dollarPrice;
    }

    public double getDollarsBought() {
        return dollarsBought;
    }

    public void setDollarsBought(double dollarsBought) {
        this.dollarsBought = dollarsBought;
    }

    public double dollarPurchase() {
        double tax = getDollarPrice() + (getDollarPrice() * 0.06);
        return getDollarsBought() * tax;
    }
}
