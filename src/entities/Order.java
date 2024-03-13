package entities;

import enums.OrderStatus;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private final long id;
    private OrderStatus status;
    private final LocalDate orderDate;
    private final LocalDate deliveryDate;
    private final List<Product> products;
    private final Customer customer;

    public Order(long id, LocalDate orderDate, LocalDate deliveryDate, List<Product> products, Customer customer) {
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
        this.status = OrderStatus.RECEIVED;
    }

    public void ship() {
        this.status = OrderStatus.SHIPPED;
    }
}
