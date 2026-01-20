package ex13;

import java.time.LocalDate;

public class UsedProduct extends Product{

    private LocalDate manufactoreDate;

    public UsedProduct(String productName, double productPrice, LocalDate manufactoreDate) {
        super(productName, productPrice);
        this.manufactoreDate = manufactoreDate;
    }

    public LocalDate getManufactoreDate() {
        return manufactoreDate;
    }

    @Override
    public String toString() {
        return getProductName() +
                " (used) $" +
                String.format("%.2f", getProductPrice()) +
                " (Manufacture date: " +
                getManufactoreDate() +
                ")";
    }
}
