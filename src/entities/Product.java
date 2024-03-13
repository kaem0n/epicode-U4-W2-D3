package entities;

public class Product {
    private final long id;
    private final String name;
    private final String category;
    private final double price;

    public Product(long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
}
