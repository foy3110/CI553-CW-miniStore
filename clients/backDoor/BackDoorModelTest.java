package clients.backDoor;

import catalogue.Product;
import middle.LocalMiddleFactory;
import middle.MiddleFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BackDoorModelTest {


    @Test
    void doAddMin() {
        MiddleFactory mf = new LocalMiddleFactory();
        BackDoorModel back = new BackDoorModel(mf);
        Product p1,p2;
        p1 = new Product("01","tv",10,10,0);
        p2 = new Product("02","remote",5,50,5);

        assertEquals(0,p1.getMinQuantity());
        back.doAddMin("01","10");
        assertEquals(10,p1.getMinQuantity());

    }
}