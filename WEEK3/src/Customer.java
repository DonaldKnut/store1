class Customer {
    private String name;
    private int cartItemCount;

    public Customer(String name, int cartItemCount) {
        this.name = name;
        this.cartItemCount = cartItemCount;
    }

    public String getName() {
        return name;
    }

    public int getCartItemCount() {
        return cartItemCount;
    }
}
