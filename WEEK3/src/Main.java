import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

abstract public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Product product1 = new Product( 100, "White - Men's S/S Crew Tee - Large");
        Product product2 = new Product(150, "Charcoal - Men's S/S Crew Tee - Small");
        store.addProduct(product1);
        store.addProduct(product2);

        // Add customers to the queue
        Customer customer1 = new Customer("John", 2);
        Customer customer2 = new Customer("Emily", 1);
        Customer customer3 = new Customer("Mike", 3);
        store.addCustomerToQueue(customer1);
        store.addCustomerToQueue(customer2);
        store.addCustomerToQueue(customer3);

        String productsCsvFile = "/Users/user/IdeaProjects/WEEK3/src/resources/package.csv";
//        String customersCsvFile = "/Users/user/IdeaProjects/WEEK3/src/resources/package.csv";
        String csvSeparator = ",";

//        Store store = new Store();

        // Read products from CSV file
        try (BufferedReader br = new BufferedReader(new FileReader(productsCsvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSeparator);
                int unit = Integer.parseInt(data[0]);
                String name = String.valueOf(data[1]);

                Product product = new Product(unit, name);
                store.addProduct(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        store.sellProductsBasedOnQueue();


        store.sellProductsBasedOnItemCount();
    }

}