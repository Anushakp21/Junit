import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private Order order;

    @BeforeEach
    void setUp() {
        order = new Order();
    }

    @Test
    void testCalculateTotalPriceWithProducts() {
        Product product1 = new Product("Laptop", 1000.0, 2);
        Product product2 = new Product("Mouse", 50.0, 1);
        order.addProduct(product1);
        order.addProduct(product2);

        double expectedTotal = 1000.0 * 2 + 50.0 * 1; 
        assertEquals(expectedTotal, order.calculateTotalPrice(),"Total price should be 2050");
    }

    @Test
    void testCalculateTotalPriceWithEmptyOrder() {
        assertEquals(0.0, order.calculateTotalPrice(),"Total price should be 0 for an empty order");
    }
}
