import java.util.*;

class Store implements Company{
    private final Queue<Customer> customerQueue;
    private final PriorityQueue<Customer> priorityCustomerQueue;
    private final List<Product> products;

    public Store() {
        customerQueue = new LinkedList<>();
        priorityCustomerQueue = new PriorityQueue<>((c1, c2) -> Integer.compare(c2.getCartItemCount(), c1.getCartItemCount()));
        products = new ArrayList<>();
    }

    public void addCustomerToQueue(Customer customer) {
        customerQueue.offer(customer);
        priorityCustomerQueue.offer(customer);
    }

    public void addProduct(Product product) {
        products.add(product);
    }


    public void sellProductsBasedOnQueue() {
        System.out.println("Selling products based on customer queue:");
        while (!customerQueue.isEmpty()) {
            Customer customer = customerQueue.poll();
            if (!products.isEmpty()) {
                Product product = products.remove(0);
                System.out.println("Sold " + product.getName() + " to " + customer.getName());
            } else {
                System.out.println("Out of stock.");
                break;
            }
        }
    }

    public void sellProductsBasedOnItemCount() {
        System.out.println("\nSelling products based on customer's cart item count:");
        while (!priorityCustomerQueue.isEmpty()) {
            Customer customer = priorityCustomerQueue.poll();
            if (!products.isEmpty()) {
                Product product = products.remove(0);
                System.out.println("Sold " + product.getName() + " to " + customer.getName());
            } else {
                System.out.println("Out of stock.");
                break;
            }
        }
    }

    @Override
    public void addStore(Store store) {
        List<Store> linkedStore = new ArrayList<>();
        linkedStore.add(store);
    }

    @Override
    public void sellProductsInAllStores() {

    }
}

