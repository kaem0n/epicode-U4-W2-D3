package entities;

import enums.ProductCategory;

import java.util.List;

public class Product {
    private final String id;
    private final String name;
    private final ProductCategory category;
    private final double price;

    public Product(String name, ProductCategory category, double price) {
        this.id = Integer.toHexString(hashCode());
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public static void printCheapProducts(List<Product> list, ProductCategory cat) {
        list.stream().filter(el -> el.getCategory() == cat && el.getPrice() < 50).forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}
