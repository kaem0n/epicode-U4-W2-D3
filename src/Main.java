import entities.Customer;
import entities.Order;
import entities.Product;
import enums.ProductCategory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Mario", 3);
        Customer customer2 = new Customer("Luigi", 2);
        Customer customer3 = new Customer("Michele", 1);
        Customer customer4 = new Customer("Gianfranco", 2);

        List<Product> products = new ArrayList<>();
        products.add(new Product("Harry Potter e la Pietra Filosofale", ProductCategory.BOOKS, 9.99));
        products.add(new Product("Harry Potter e la Camera dei Segreti", ProductCategory.BOOKS, 9.99));
        products.add(new Product("Harry Potter e il Prigioniero di Azkaban", ProductCategory.BOOKS, 9.99));
        products.add(new Product("Harry Potter Collection", ProductCategory.BOOKS, 59.99));
        products.add(new Product("God of War (PS4)", ProductCategory.GAMES, 29.99));
        products.add(new Product("God of War: Ragnarok (PS5)", ProductCategory.GAMES, 59.99));
        products.add(new Product("Biscotti Plasmon", ProductCategory.BABY, 3.99));
        products.add(new Product("Omogeneizzato Plasmon (pollo)", ProductCategory.BABY, 2.49));
        products.add(new Product("Omogeneizzato Plasmon (vitello)", ProductCategory.BABY, 2.49));
        products.add(new Product("Omogeneizzato Plasmon (orata)", ProductCategory.BABY, 2.69));

        Order order1 = new Order(LocalDate.parse("2024-01-29"), customer1);
        order1.addProduct(products.get(new Random().nextInt(0, products.size())));
        order1.addProduct(products.get(new Random().nextInt(0, products.size())));
        order1.addProduct(products.get(new Random().nextInt(0, products.size())));
        order1.addProduct(products.get(new Random().nextInt(0, products.size())));
        Order order2 = new Order(LocalDate.parse("2024-02-14"), customer2);
        order2.addProduct(products.get(new Random().nextInt(0, products.size())));
        order2.addProduct(products.get(new Random().nextInt(0, products.size())));
        Order order3 = new Order(LocalDate.parse("2024-02-29"), customer3);
        order3.addProduct(products.get(new Random().nextInt(0, products.size())));
        order3.addProduct(products.get(new Random().nextInt(0, products.size())));
        order3.addProduct(products.get(new Random().nextInt(0, products.size())));
        Order order4 = new Order(LocalDate.parse("2024-03-04"), customer4);
        order4.addProduct(products.get(new Random().nextInt(0, products.size())));
        List<Order> totalOrders = new ArrayList<>();
        totalOrders.add(order1);
        totalOrders.add(order2);
        totalOrders.add(order3);
        totalOrders.forEach(Order::ship);
        totalOrders.add(order4);

        System.out.println();
        System.out.println("===== EXERCISE 1 =====");
        System.out.println();
        Product.printCheapProducts(products, ProductCategory.BOOKS);
        System.out.println();
        System.out.println("===== EXERCISE 2 =====");
        System.out.println();
        Order.printOrdersWithCat(totalOrders, ProductCategory.BABY);
        System.out.println();
        System.out.println("===== EXERCISE 3 =====");
        System.out.println();
        Product.printDiscountedProducts(products, ProductCategory.GAMES, 0.10);
        System.out.println();
        System.out.println("===== EXERCISE 4 =====");
        System.out.println();
        Order.printOrdersByTier(totalOrders, 2, LocalDate.parse("2024-02-01"), LocalDate.parse("2024-03-06"));
    }

}