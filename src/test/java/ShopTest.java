import org.junit.Before;
import org.junit.Test;
import instruments.strings.Guitar;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    @Before
    public void before(){
        shop = new Shop("Sam Ash");
        guitar = new Guitar("Black", "Flame Maple","Gibson", 1500,1200,6);
    }

    @Test
    public void shopHasName(){
        assertEquals("Sam Ash", shop.getName());
    }

    @Test
    public void shopHasStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.stockCount());
    }
}
