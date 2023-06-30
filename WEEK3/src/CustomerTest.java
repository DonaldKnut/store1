import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    public void testGetName() {
        Customer customer = new Customer("Scott", 3);
        assertEquals("Scott", customer.getName());
    }

    @Test
    public void testGetCartItemCount() {
        Customer customer = new Customer("Joel", 3);
        assertEquals(3, customer.getCartItemCount());
    }
}
