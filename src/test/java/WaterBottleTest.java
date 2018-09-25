import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        int volume = waterBottle.getVolume();
        assertEquals(100, volume);
    }

    @Test
    public void canTakeSip(){
        int volume = waterBottle.takeSip();
        assertEquals(90, volume);
    }

    @Test
    public void isEmpty(){
        int volume = waterBottle.emptyBottle();
        assertEquals(0, volume);
    }

    @Test
    public void isFull(){
        int sip = waterBottle.takeSip();
        int volume = waterBottle.fillBottle();
        assertEquals(100, volume);
    }

}
