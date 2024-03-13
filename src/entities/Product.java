package entities;

import enums.ProductCategory;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class Product {
    private final String id;
    private final String name;
    private final ProductCategory category;
    private double price;

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

    public void setPrice(double price) {
        this.price = price;
    }

    public static void printCheapProducts(List<Product> list, ProductCategory cat) {
        System.out.println(cat + " that cost less than 50€:");
        list.stream().filter(el -> el.getCategory() == cat && el.getPrice() < 50).forEach(el -> System.out.println("- " + el));
    }

    public static void printDiscountedProducts(List<Product> list, ProductCategory cat, double discount) {
        System.out.println(cat + " discounted (" + discount * 100 + "%):");
        if (discount > 0 && discount < 1) {
            list.stream().filter(el -> el.getCategory() == cat).forEach(el -> {
                el.setPrice(el.getPrice() * discount);
                System.out.println("- " + el);
            });
        }
    }

    private final String formatPrice() {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.DOWN);
        return df.format(this.price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + formatPrice() +
                "€}";
    }
}
