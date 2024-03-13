package entities;

public class Customer {
    private final long id;
    private final String name;
    private int tier;

    public Customer(long id, String name, int tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }
}
