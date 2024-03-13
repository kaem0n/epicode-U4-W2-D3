package entities;

public class Customer {
    private final String id;
    private final String name;
    private final int tier;

    public Customer(String name, int tier) {
        this.id = Integer.toHexString(hashCode());
        this.name = name;
        this.tier = tier;
    }

    public String getName() {
        return name;
    }

    public int getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
