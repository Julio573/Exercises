package Ex1;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return getPrice() * getQuantity();
    }

    public void addProducts(int quantity) {
        setQuantity(getQuantity() + quantity);
    }

    public void removeProducts(int quantity) {
        setQuantity(getQuantity() - quantity);
    }

    @Override
    public String toString() {
        return getName() +
                ", $" +
                String.format("%.2f", getPrice()) +
                ", " +
                getQuantity() +
                ", units Total: $" +
                String.format("%.2f%n", totalValueInStock());
    }
}
