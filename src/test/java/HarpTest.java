import org.junit.Before;
import org.junit.Test;
import instruments.strings.Harp;

import static org.junit.Assert.assertEquals;

public class HarpTest {
    Harp harp;

    @Before
    public void before(){
        harp = new Harp("Black", "Birch","Dusty Strings", 2500,2200,34);
    }

    @Test
    public void harpHasColor(){
        assertEquals("Black", harp.getColor());
    }

    @Test
    public void harpHasMaterial(){
        assertEquals("Birch", harp.getMaterial());
    }

    @Test
    public void harpHasBrand(){
        assertEquals("Dusty Strings", harp.getBrand());
    }
    @Test
    public void harpHasPrice(){
        assertEquals(2500, harp.getPrice(),0);
    }

    @Test
    public void harpHasCost(){
        assertEquals(2200, harp.getCost(),0);
    }

    @Test
    public void harpHasNumberOfStrings(){
        assertEquals(34, harp.getNumberOfStrings());
    }

    @Test
    public void harpCanPlay(){
        assertEquals("Great Fairy Fountain", harp.play());
    }

    @Test
    public void harpHasMarkup(){
        assertEquals(13.6, harp.calculateMarkup(),0.1);
    }
}
