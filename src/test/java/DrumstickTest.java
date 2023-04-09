import accessories.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumstickTest {

    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks("Promark", 5,15,10);
    }

    @Test
    public void drumsticksHasBrand(){
        assertEquals("Promark", drumsticks.getBrand());
    }
    @Test
    public void drumsticksHasPrice(){
        assertEquals(15, drumsticks.getPrice(),0);
    }

    @Test
    public void drumsticksHasCost(){
        assertEquals(10, drumsticks.getCost(),0);
    }
    @Test
    public void drumsticksHasMarkup(){
        assertEquals(50, drumsticks.calculateMarkup(),0.1);
    }
}
