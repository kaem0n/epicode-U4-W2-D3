package entities;

import enums.OrderStatus;
import enums.ProductCategory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String id;
    private OrderStatus status;
    private final LocalDate orderDate;
    private LocalDate deliveryDate;
    private final List<Product> products = new ArrayList<>();
    private final Customer customer;

    public Order(LocalDate orderDate, Customer customer) {
        this.id = Integer.toHexString(hashCode());
        this.orderDate = orderDate;
        this.customer = customer;
        this.status = OrderStatus.RECEIVED;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product item) {
        products.add(item);
    }

    public void ship() {
        this.deliveryDate = LocalDate.now();
        this.status = OrderStatus.COMPLETED;
    }

    public static void printOrdersWithCat(List<Order> list, ProductCategory cat) {
        System.out.println("Orders that include " + cat + " products:");
        list.forEach(el -> {
            if (el.getProducts().stream().anyMatch(item -> item.getCategory() == cat)) {
                System.out.println("- " + el);
            }
        });
    }

    public static void printOrdersByTier(List<Order> list, int tier, LocalDate fromDate, LocalDate toDate) {
        System.out.println("Orders from Tier " + tier + " customers from " + fromDate + " to " + toDate);
        list.forEach(el -> {
            if (el.getOrderDate().isAfter(fromDate) && el.getOrderDate().isBefore(toDate) && el.getCustomer().getTier() == tier) {
                System.out.println("- " + el);
            }
        });
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", customer=" + customer.getName() +
                ", status=" + status +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                '}';
    }
}
