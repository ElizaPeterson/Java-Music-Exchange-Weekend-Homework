import org.junit.Before;
import org.junit.Test;
import instruments.strings.Guitar;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Black", "Flame Maple","Gibson", 1500,1200,6);
    }

    @Test
    public void guitarHasColor(){
        assertEquals("Black", guitar.getColor());
    }

    @Test
    public void guitarHasMaterial(){
        assertEquals("Flame Maple", guitar.getMaterial());
    }

    @Test
    public void guitarHasBrand(){
        assertEquals("Gibson", guitar.getBrand());
    }
    @Test
    public void guitarHasPrice(){
        assertEquals(1500, guitar.getPrice(),0);
    }

    @Test
    public void guitarHasCost(){
        assertEquals(1200, guitar.getCost(),0);
    }

    @Test
    public void guitarHasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void guitarCanPlay(){
        assertEquals("Wonderwall", guitar.play());
    }
    @Test
    public void guitarHasMarkup(){
        assertEquals(25, guitar.calculateMarkup(),0.1);
    }
}
