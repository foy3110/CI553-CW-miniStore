package clients.customer;

import catalogue.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerModelTest {

    @Test
    void doRight() {
        Product p1,p2,p3,p4;
        p1 = new Product("0001","battery", 1.50,15,10);
        p2 = new Product("0002","usb", 20.00,32,15);
        p3 = new Product("0003","mouse", 25.00,11,13);
        p4 = new Product("0004","dongle", 15.00,90,0);

        assertEquals("0001", p1.getProductNum());
        assertEquals("usb", p2.getDescription());
        assertEquals(15, p4.getPrice());
        assertEquals(13, p3.getMinQuantity());


    }

    @Test
    void doLeft() {
        Product p1,p2,p3,p4;
        p1 = new Product("0001","battery", 1.50,15,10);
        p2 = new Product("0002","usb", 20.00,32,15);
        p3 = new Product("0003","mouse", 25.00,11,13);
        p4 = new Product("0004","dongle", 15.00,90,0);

        assertEquals("0001", p1.getProductNum());
        assertEquals("usb", p2.getDescription());
        assertEquals(15, p4.getPrice());
        assertEquals(13, p3.getMinQuantity());
    }
}