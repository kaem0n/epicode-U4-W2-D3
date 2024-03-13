package entities;

public class Customer {
    private final String id;
    private final String name;
    private int tier;

    public Customer(String name, int tier) {
        this.id = Integer.toHexString(hashCode());
        this.name = name;
        this.tier = tier;
    }
}
