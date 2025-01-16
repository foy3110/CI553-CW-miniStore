package catalogue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BetterBasketTest {

    @Test
    void add() {
        Basket basket = new Basket();
        Product p1, p2, p3, p4, p5, p6, p7;
        p1 = new Product("0003","knive",10,15,5);
        p2 = new Product("0004","stone",11,14,3);
        p3 = new Product("0005","flashdrive",12,16,4);
        p4 = new Product("0006","camera",13,17,5);


        basket.add(p1);
        basket.add(p2);
        basket.add(p3);
        basket.add(p4);


        assertEquals(4, basket.size());
        assertEquals(5, basket.get(0).theMinQuantity);
        assertEquals(17, basket.get(3).getQuantity());

        assertEquals( true, basket.add(p1));
        assertEquals( 15, basket.get(0).getQuantity());
        basket.clear();
        assertEquals( 15, p1.getQuantity());

    }
}