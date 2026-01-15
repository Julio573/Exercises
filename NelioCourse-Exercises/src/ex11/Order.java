package ex11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Client client;
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> orderItemList = new ArrayList<>();

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Order() {
    }

    public Order(Client client, LocalDateTime moment, OrderStatus status) {
        this.client = client;
        this.moment = moment;
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addOrder(OrderItem orderItem) {
        orderItemList.add(orderItem);
    }

    public void removeOrder(OrderItem orderItem) {
        orderItemList.remove(orderItem);
    }

    public double totalPrice() {
        double price = 0.0;
        for (OrderItem order : orderItemList) {
            price += order.subTotal();
        }
        return price;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Order moment: ")
                .append(dateFormatter.format(moment) + "\n")
                .append("Order Status: ")
                .append(getStatus() + "\n")
                .append(client)
                .append("Order items: \n");
                for (OrderItem item : orderItemList) {
                    stringBuilder.append(item + "\n");
                }
                stringBuilder.append("Total Price: $")
                        .append(totalPrice());
                return stringBuilder.toString();

    }
}
