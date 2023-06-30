class Product {
    private final String name;

    private double price;

    public Product(int unit, String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}