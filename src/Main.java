import entities.Product;
import enums.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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

        System.out.println();
        System.out.println("===== ESERCIZIO 1 =====");
        System.out.println();
        System.out.println("Lista di prodotti della categoria \"books\" che costano meno di 50€:");
        Product.printCheapProducts(products, ProductCategory.BOOKS);
    }
}