package ex13;

public class ImportedProduct extends Product{

    private double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String productName, double productPrice, double customsFee) {
        super(productName, productPrice);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return getProductPrice() + getCustomsFee();
    }

    @Override
    public String toString() {
        return getProductName() + " $" + String.format("%.2f ", totalPrice()) +
                "(Customs fee: $" + String.format("%.2f", getCustomsFee()) + ")";
    }
}
