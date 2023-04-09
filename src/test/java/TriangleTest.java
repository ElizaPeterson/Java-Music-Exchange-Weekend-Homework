import org.junit.Before;
import org.junit.Test;
import instruments.percussion.Triangle;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void before(){
        triangle = new Triangle("Silver","Metal","Kolberg",3,20,10);
    }
    @Test
    public void triangleHasColor(){
        assertEquals("Silver", triangle.getColor());
    }

    @Test
    public void triangleHasMaterial(){
        assertEquals("Metal", triangle.getMaterial());
    }

    @Test
    public void triangleHasBrand(){
        assertEquals("Kolberg", triangle.getBrand());
    }

    @Test
    public void triangleHasPrice(){
        assertEquals(20, triangle.getPrice(),0);
    }

    @Test
    public void triangleHasCost(){
        assertEquals(10, triangle.getCost(),0);
    }

    @Test
    public void triangleHasSize(){
        assertEquals(3, triangle.getSize());
    }

    @Test
    public void triangleCanPlay(){
        assertEquals("Ting", triangle.play());
    }

    @Test
    public void triangleHasMarkup(){
        assertEquals(100, triangle.calculateMarkup(),0.1);
    }

}
