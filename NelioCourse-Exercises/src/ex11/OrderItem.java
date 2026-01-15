package ex11;

public class OrderItem {

    private Product product;
    private int quantity;
    private double price;

    public OrderItem() {
    }

    public OrderItem(Product product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double subTotal() {
        return getQuantity() * getPrice();
    }

    @Override
    public String toString() {
        return getProduct() +
                ", Quantity: " +
                getQuantity() +
                ", Subtotal: $" +
                String.format("%.2f", subTotal());
    }
}
