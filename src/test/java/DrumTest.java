
import org.junit.Before;
import org.junit.Test;
import instruments.percussion.Drums;

import static org.junit.Assert.assertEquals;

public class DrumTest {
    
    Drums drums;
    
    @Before
    public void before(){
        drums = new Drums("Black", "Wood","Pearl", 6,2000,1800);
    }
    @Test
    public void drumsHasColor(){
        assertEquals("Black", drums.getColor());
    }

    @Test
    public void drumsHasMaterial(){
        assertEquals("Wood", drums.getMaterial());
    }

    @Test
    public void drumsHasBrand(){
        assertEquals("Pearl", drums.getBrand());
    }
    @Test
    public void drumsHasPrice(){
        assertEquals(2000, drums.getPrice(),0);
    }

    @Test
    public void drumsHasCost(){
        assertEquals(1800, drums.getCost(),0);
    }

    @Test
    public void drumsHasSize(){
        assertEquals(6, drums.getSize());
    }

    @Test
    public void drumsCanPlay(){
        assertEquals("Bonk", drums.play());
    }

    @Test
    public void drumsHasMarkup(){
        assertEquals(11.1, drums.calculateMarkup(),0.1);
    }
}
