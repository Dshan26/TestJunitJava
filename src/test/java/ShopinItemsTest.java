import org.camilo.example.Product;
import org.camilo.example.ShopinItems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopinItemsTest {



    @Test
    void testCalculatePrice() {
        Product product1 = new Product("Bread",1200, 2);
        Product product2 = new Product("eggs",7000, 1);
        Product product3 = new Product("banana",1000, 1);

        ShopinItems cart = new ShopinItems();
        cart.addItems(product1);
        cart.addItems(product2);
        cart.addItems(product3);

        assertEquals(10400,cart.calculteTotalProducts());
    }

    @Test
    void testRemoveItems() {
        Product product1 = new Product("Bread",1200, 2);
        Product product2 = new Product("eggs",7000, 1);
        Product product3 = new Product("banana",1000, 1);

        ShopinItems cart = new ShopinItems();
        cart.addItems(product1);
        cart.addItems(product2);
        cart.addItems(product3);

        cart.removeItems(product1);

        assertEquals(2,cart.getSize());
    }
}
